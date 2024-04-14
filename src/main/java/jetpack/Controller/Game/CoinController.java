package jetpack.Controller.Game;

import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.Game.background.Background;
import jetpack.Model.Game.elements.Coin;
import jetpack.Model.Position;
import javax.sound.sampled.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class CoinController extends GameController{
    public CoinController(Background background) {
        super(background);
    }

    @Override
    public void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException {
        if (!getModel().getActiveCoins().isEmpty()) {
            Iterator<Coin> iterator = getModel().getActiveCoins().iterator();
            while (iterator.hasNext()){
                Coin c = iterator.next();
                if (c.getX() < -5) {
                    iterator.remove();
                    //System.out.println("deleted Coin");
                }
            }
        }
        //System.out.println("COINS: " + String.valueOf(getModel().getActiveCoins().size()));

        for (Coin o : getModel().getActiveCoins()) {
            move(o);
            if(collidesWithPlayer(o)) {
                playSound();
                getModel().setCollectedCoins(getModel().getCollectedCoins()+1);
                Iterator<Coin> iterator = getModel().getActiveCoins().iterator();
                while (iterator.hasNext()){
                    Coin c = iterator.next();
                    if (c.getX() == o.getX()) {
                        iterator.remove();
                        break;
                    }
                }
                break;
            }
        }
    }

    private void playSound() {
        String soundFilePath = "resources/coin.mp3"; // Replace with your MP3 file path
        try {
            FileInputStream fileInputStream = new FileInputStream(soundFilePath);
            Player player = new Player(fileInputStream);

            Thread playerThread = new Thread(() -> {
                try {
                    player.play();
                    player.close();
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            });

            // Start the player thread
            playerThread.start();

        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }
    }

    private boolean move(Coin coin){
        coin.setPosition(new Position(coin.getX()-1, coin.getY()));
        return collidesWithPlayer(coin);
    }

    private boolean collidesWithPlayer(Coin coin){
        int high = getModel().getPlayer().getY();
        if (coin.getX() > 10 + coin.getTolerance()) return false;
        if (coin.getX() > 10 - coin.getTolerance() && coin.getX() < 10 + coin.getTolerance()){
            if (coin.getY() + coin.getTolerance() > high && coin.getY() - coin.getTolerance() < high) return true;
        }
        return false;
    }
}
