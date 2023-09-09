package br.com.tarefa_02.model.selecaoMusicas;

import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;

public class TocarMusica {
    public static void main(String[] args) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    TocarMusica.class.getResourceAsStream("./resources/static/musicas/"));

            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Aguarda a música terminar de tocar
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            clip.stop();
            clip.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
