package com.aditya;


import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Play {
    public static String filepath = "backend/MusicVisualizer/src/main/java/com/aditya/resources/shivtandav.mp3";

    public  static void playSong() throws Exception {
        FileInputStream filepath = new FileInputStream((this.filepath);
        // AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(filepath.getAbsoluteFile());
        // Clip clip = AudioSystem.getClip();
        // clip.open(audioInputStream);
        // clip.start();
        Player player = new Player(filepath);
        player.play();
    }

    
}
