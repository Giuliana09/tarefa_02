package br.com.tarefa_02.model.selecaoMusicas;

import java.util.ArrayList;
import java.util.List;

public class MusicaDados{
    private static List<Musica> dadosMusicas;

    static{
        dadosMusicas = new ArrayList<>();
        Musica musica01 = new Musica("Duck In The Alley","TrackTribe");
        Musica musica02 = new Musica("Lights","Patrick Patrikios");
        Musica musica03 = new Musica("Ringside","Dyalla");
        Musica musica04 = new Musica("Pray", "Anno Dommini Beats");
    }
}