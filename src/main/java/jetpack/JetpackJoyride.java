package jetpack;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import javazoom.jl.decoder.JavaLayerException;
import jetpack.GUI.LanternaGUI;
import jetpack.Model.Menu.Menu;
import jetpack.States.*;

public class JetpackJoyride {

    private final LanternaGUI gui;
    private State state;
    javazoom.jl.player.Player playerSoundTrack;

    public JetpackJoyride() throws FontFormatException, IOException, URISyntaxException {
        this.gui = new LanternaGUI(200, 117);
        this.state = new MenuState(new Menu());
    }

    public static void main(String[] args) throws IOException, FontFormatException, URISyntaxException, JavaLayerException {
        new JetpackJoyride().start();
    }

    public void setState(State state) {
        this.state = state;
    }

    private void start() throws IOException, JavaLayerException {
        int FPS = 40;
        int frameTime = 1000 / FPS;
        int meters = 0;
        soundTrack();
        while (this.state != null) {
            long startTime = System.currentTimeMillis();
            if(state instanceof GameState) meters++;
            else if (!(state instanceof  PauseState)) meters = 0;
            state.step(this, gui, meters);
            long elapsedTime = System.currentTimeMillis() - startTime;
            long sleepTime = frameTime - elapsedTime;

            try {
                if (sleepTime > 0) Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
            }
        }
        playerSoundTrack.close();

        gui.close();
    }

    private void soundTrack() throws FileNotFoundException, JavaLayerException {
        FileInputStream fileInputStreamSoundTrack = new FileInputStream("resources/soundtrack.mp3");
        playerSoundTrack = new javazoom.jl.player.Player(fileInputStreamSoundTrack);



        Thread playerThread = new Thread(() -> {
            try {
                playerSoundTrack.play();
                playerSoundTrack.close();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        });
        playerThread.start();
    }
}

