package br.com.tarefa_02.model.selecaoMusicas;

import java.util.ArrayList;
import java.util.List;

public class Musica {
    private String titulo;
    private String artista;
    private List<ArquivoMusicas> arquivo;

    public Musica(String titulo, String artista){
        this.titulo = titulo;
        this.artista = artista;
        this.arquivo = new ArrayList<>();
    }
    public String getTitulo(){
        return titulo;
    }
    public String getArtista(){
        return artista;
    }
    public List<ArquivoMusicas> getArquivo() {
        return arquivo;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", arquivo='" + arquivo + '\'' +
                '}';
    }

    private class ArquivoMusicas {
    }
}
