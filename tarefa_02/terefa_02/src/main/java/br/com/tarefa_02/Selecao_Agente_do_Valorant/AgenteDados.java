package br.com.tarefa_02.Selecao_Agente_do_Valorant;

import java.util.ArrayList;
import java.util.List;

public class AgenteDados {
    private static List<Agente> dadosAgentes;

    /*
    Lista de Instancias da Classe Agente, como os Agentes São fixos e preciso de um lugar para controlar
    todos os dados deles que são enormes e infelizmente estou sem Banco de Dados, então essa foi a Solução.
    Como o Static é chamado assim que se tem a classe AgenteDados, então ele automaticamente cria as instancias, ou seja
    Carrega minha Base de Dados dos Agentes
    */
    static {
        dadosAgentes = new ArrayList<>();

        //Adicionando os Agentes e suas Estatisticas por Mapa
        Agente brimstone = new Agente("Brimstone", "Soldado de Elite", "Controlador");
        brimstone.adicionarEstatisticas("Lotus", 50.4, 0.6);
        brimstone.adicionarEstatisticas("Pearl", 50.6, 0.6);
        brimstone.adicionarEstatisticas("Fracture", 51.0, 1.2);
        brimstone.adicionarEstatisticas("Bind", 50.7, 1.1);
        brimstone.adicionarEstatisticas("Haven", 50.6, 0.7);
        brimstone.adicionarEstatisticas("Split", 50.2, 0.7);
        brimstone.adicionarEstatisticas("Ascent", 51.1, 0.8);
        dadosAgentes.add(brimstone);

        Agente phoenix = new Agente("Phoenix", "Carioca", "Duelista");
        phoenix.adicionarEstatisticas("Lotus", 49.7, 0.5);
        phoenix.adicionarEstatisticas("Pearl", 50.4, 0.6);
        phoenix.adicionarEstatisticas("Fracture", 49.8, 0.5);
        phoenix.adicionarEstatisticas("Bind", 49.8, 0.5);
        phoenix.adicionarEstatisticas("Haven", 50.3, 0.6);
        phoenix.adicionarEstatisticas("Split", 49.4, 0.5);
        phoenix.adicionarEstatisticas("Ascent", 50.5, 0.6);
        dadosAgentes.add(phoenix);


    }

    public static List<Agente> getDadosAgentes() {

        return dadosAgentes;
    }
}
