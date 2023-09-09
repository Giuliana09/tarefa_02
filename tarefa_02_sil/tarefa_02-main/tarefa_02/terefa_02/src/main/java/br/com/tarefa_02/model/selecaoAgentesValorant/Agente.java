package br.com.tarefa_02.model.selecaoAgentesValorant;

import java.util.ArrayList;
import java.util.List;

public class Agente {
    private String nome;
    private String biografia;
    private String funcao;
    private List<EstatisticasPorMapa> estatisticas;

    public Agente(String nome, String biografia, String funcao) {
        this.nome = nome;
        this.biografia = biografia;
        this.funcao = funcao;
        this.estatisticas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getFuncao() {
        return funcao;
    }

    public List<EstatisticasPorMapa> getEstatisticas() {
        return estatisticas;
    }

    public void adicionarEstatisticas(String mapa, double porcentagemDeVitoria, double porcentagemDePick) {
        EstatisticasPorMapa dados = new EstatisticasPorMapa(mapa, porcentagemDeVitoria, porcentagemDePick);
        estatisticas.add(dados);
    }

    @Override
    public String toString() {
        return "Agente{" +
                "nome='" + nome + '\'' +
                ", biografia='" + biografia + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}
