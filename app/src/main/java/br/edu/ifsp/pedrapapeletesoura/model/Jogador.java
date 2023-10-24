package br.edu.ifsp.pedrapapeletesoura.model;

public class Jogador {

    private String nome;
    private int pontos;

    public void acumulaPontos(){
        pontos +=1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
