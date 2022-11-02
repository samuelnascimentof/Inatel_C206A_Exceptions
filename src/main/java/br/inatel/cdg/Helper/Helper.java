package br.inatel.cdg.Helper;

import br.inatel.cdg.Model.Projeto;

import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static List<Projeto> carregaProjetos(){
        List<Projeto> projetos = new ArrayList<>();

        Projeto projeto1 = new Projeto("Sistema de monitoramento hídrico residencial", 100);
        Projeto projeto2 = new Projeto("Bengala inteligente", 65);
        Projeto projeto3 = new Projeto("Controle de fluxo veicular em horários de pico", 29);
        Projeto projetoRepetido = new Projeto("Sistema de monitoramento hídrico residencial", 100);
        Projeto projeto4 = new Projeto("Descomplicando os manuais com realidade aumentada", 95);
        Projeto projeto5 = new Projeto("Torrador de cafés especiais inteligente", 20);
        projetos.add(projeto1);
        projetos.add(projeto2);
        projetos.add(projeto3);
        projetos.add(projetoRepetido);
        projetos.add(projeto4);
        projetos.add(projeto5);

        return projetos;
    }
}
