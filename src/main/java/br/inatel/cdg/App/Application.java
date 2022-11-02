package br.inatel.cdg.App;

import br.inatel.cdg.Exception.NomeRepetidoException;
import br.inatel.cdg.Exception.NotaInsuficienteException;
import br.inatel.cdg.Helper.Helper;
import br.inatel.cdg.Model.Fetin;
import br.inatel.cdg.Model.Projeto;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        Fetin fetin = new Fetin();
        List<Projeto> projetos = Helper.carregaProjetos();

        System.out.println("Inserindo projetos\n");
        projetos.forEach(projeto -> {
            try {
                fetin.insereProjeto(projeto);
            } catch (NomeRepetidoException e) {
                System.out.println(e.getMessage());
            }
        });
        System.out.println("\nFim da inserção de projetos\n");
        System.out.println("-------------------------------------");
        System.out.println("\nValidando projetos\n");
        projetos.forEach(projeto -> {
            try {
                fetin.validaProjeto(projeto);
            } catch (NotaInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        });
        System.out.println("\nFim da validação de projetos");
        System.out.println("\nFim da execução.");
    }
}
