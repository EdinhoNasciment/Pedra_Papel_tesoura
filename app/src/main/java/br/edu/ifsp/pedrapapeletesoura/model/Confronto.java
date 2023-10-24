package br.edu.ifsp.pedrapapeletesoura.model;

public class Confronto {

    private int batalhas;
    private int batalhasValidadas;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador empate;

    public Confronto(int batalhas, String jogador1, String jogador2){
        if(batalhas > 0){
            this.batalhas = batalhas;
        }else{
            this.batalhas = 1;
        }

        this.batalhasValidadas = 0;
        this.jogador1 = new Jogador();
        this.jogador2 = new Jogador();
        this.empate = new Jogador();
    }

    Jogador getVencedor(){
        if(tem_batalha()){
            return null;
        }else{
            if(jogador1.getPontos() >= jogador2.getPontos()){
                return jogador1;
            }else{
                return jogador2;
            }
        }
    }

    public Jogador novoConfronto(Coisa coisaJogador1, Coisa coisaJogador2){

        Jogador vencedor = null;

        if(tem_batalha()){
            if(! coisaJogador1.getClass().getSimpleName().equals(coisaJogador2.getClass().getSimpleName())){
                if (coisaJogador1 instanceof Pedra && coisaJogador2 instanceof Tesoura){
                    vencedor = jogador1;
                }else{
                    if(coisaJogador1 instanceof Tesoura && coisaJogador2 instanceof Papel){
                        vencedor = jogador1;
                    }else{
                        if (coisaJogador1 instanceof Papel && coisaJogador2 instanceof Pedra){
                        vencedor = jogador1;
                        }else{
                            vencedor = jogador2;
                        }
                    }
                }

                vencedor.acumulaPontos();
                batalhasValidadas +=1;
            }
        }

        return vencedor;
    }

    public boolean tem_batalha(){
        return batalhasValidadas < batalhas;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }
}
