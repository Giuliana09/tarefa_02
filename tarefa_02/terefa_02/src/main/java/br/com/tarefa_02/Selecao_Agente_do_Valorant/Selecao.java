package br.com.tarefa_02.Selecao_Agente_do_Valorant;

import java.util.ArrayList;
import java.util.List;

public class Selecao {
    private String funcao;
    private String mapa;
    private List<Agente> agenteList;

    public Selecao(String funcao, String mapa, List<Agente> agenteList) {
        this.funcao = funcao;
        this.mapa = mapa;
        this.agenteList = agenteList;
    }

    public String selecionarCaminhoDoMapa(String mapa) {
        String caminho = "./img/mapas/";
        String nomeDoMapa = this.mapa.toLowerCase();
        String extensaoDaImg = ".jpg";

        String caminhoDaImgMapa = caminho + nomeDoMapa + extensaoDaImg;
        return caminhoDaImgMapa;
    }

    public String selecionarCaminhoDoAgente(String agenteSelecionado) {
        String caminho = "./img/agentes/";
        String nomeDoAgente = agenteSelecionado.toLowerCase();
        String extensaoDaImg = ".png";

        String caminhoDaImgAgente = caminho + nomeDoAgente + extensaoDaImg;
        return caminhoDaImgAgente;
    }

    public List<Agente> filtrarPorMapaEFuncao(String funcao, String mapa) {
        List<Agente> filtrarPorMapaEFuncao = new ArrayList<>();

        if (!agenteList.isEmpty()) {
            for (Agente a : agenteList) {
                if (a.getFuncao().equalsIgnoreCase(funcao)) {
                    filtrarPorMapaEFuncao.add(a);
                }
            }
        }
        return filtrarPorMapaEFuncao;
    }


    public String selecionarAgente(String funcao, String mapa) {
        String agenteSelecionado = "";
        List<Agente> agenteFiltrados = new ArrayList<>();
        agenteFiltrados = filtrarPorMapaEFuncao(funcao, mapa);

        double maiorPickRate = 0.0;

        for (Agente a : agenteFiltrados) {
            for (EstatisticasPorMapa e : a.getEstatisticas()) {
                if (e.getMapa().equalsIgnoreCase(mapa)) {
                    if (e.getPorcentagemDePick() > maiorPickRate) {
                        maiorPickRate = e.getPorcentagemDePick();
                        agenteSelecionado = a.getNome();
                    }
                }
            }
        }

        return agenteSelecionado;
}

    public double selecionarPorcentagemDeVitoria(String agenteSelecionado, String mapa) {
        double porcentagemDeVitoria = 0.0;

        if (!agenteList.isEmpty()) {
            for (Agente a : agenteList) {
                for (EstatisticasPorMapa e : a.getEstatisticas()) {
                    if (a.getNome().equalsIgnoreCase(agenteSelecionado) && e.getMapa().equalsIgnoreCase(mapa)) {
                            porcentagemDeVitoria = e.getPorcentagemDeVitoria();
                            break;
                    }
                }
            }
        }
        return porcentagemDeVitoria;
    }

    public String selecionarBiografia(String agenteSelecionado) {
        String biografia = "";

        if (!agenteList.isEmpty()) {
            for (Agente a : agenteList) {
                if (a.getNome().equalsIgnoreCase(agenteSelecionado)) {
                    biografia = a.getBiografia();
                    break;
                } else {
                    biografia = "Biografia não encontrada";
                }
            }
        }
        return biografia;
    }

}
