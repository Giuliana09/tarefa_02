package br.com.tarefa_02.model.selecaoAgentesValorant;
public class EstatisticasPorMapa {
    private String mapa;
    private double porcentagemDeVitoria;
    private double porcentagemDePick;

    public EstatisticasPorMapa(String mapa, double porcentagemDeVitoria, double porcentagemDePick) {
        this.mapa = mapa;
        this.porcentagemDeVitoria = porcentagemDeVitoria;
        this.porcentagemDePick = porcentagemDePick;
    }

    public String getMapa() {
        return mapa;
    }

    public double getPorcentagemDeVitoria() {
        return porcentagemDeVitoria;
    }

    public double getPorcentagemDePick() {
        return porcentagemDePick;
    }
}
