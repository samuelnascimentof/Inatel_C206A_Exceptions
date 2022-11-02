package br.inatel.cdg.Model;

import br.inatel.cdg.Exception.NomeRepetidoException;
import br.inatel.cdg.Exception.NotaInsuficienteException;

import java.util.*;

public class Fetin {
    private final Map<String, Double> projetos = new HashMap<>();
    public void validaProjeto(Projeto projeto) throws NotaInsuficienteException {
        if(projeto.getNota() > 0 && projeto.getNota() < 60){
            throw new NotaInsuficienteException("ERRO: Projeto \"".concat(projeto.getNome()).concat("\" reprovado!"));
        } else if(projeto.getNota() >= 60 && projeto.getNota() <= 100) {
            System.out.println("Projeto \"".concat(projeto.getNome()).concat("\" aprovado!"));
        }
    }
    public void insereProjeto(Projeto projeto) throws NomeRepetidoException {
        if(projetos.putIfAbsent(projeto.getNome(), projeto.getNota()) == null) {
            System.out.println("Projeto \"".concat(projeto.getNome()).concat("\" inserido com sucesso!"));
        } else throw new NomeRepetidoException("ERRO: O projeto \"".concat(projeto.getNome()).concat("\" já existe. Tente outro nome."));
    }
}
