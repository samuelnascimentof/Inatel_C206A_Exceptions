package br.inatel.cdg.Model;

public class Projeto {

    private final String nome;
    private final double nota;

    public Projeto(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }
}
