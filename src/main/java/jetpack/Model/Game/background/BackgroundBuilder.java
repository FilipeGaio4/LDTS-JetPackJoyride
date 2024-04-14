package jetpack.Model.Game.background;

import javazoom.jl.decoder.JavaLayerException;
import jetpack.Model.Game.elements.Coin;
import jetpack.Model.Game.elements.Lazer;
import jetpack.Model.Game.elements.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class BackgroundBuilder {

    public Background createBackground(String username) {
        Background backgroung = new Background(200, 117);
        backgroung.setPlayer(createPlayer());
        backgroung.setLazers(createLazers());
        backgroung.setCoins(createCoins());
        backgroung.setActiveLazers(createActiveLazers());
        backgroung.setActiveCoins(createActiveCoins());
        backgroung.setUsername(username);
        try {
            FileInputStream fileInputStreamCoin = new FileInputStream("resources/coin.mp3");
            javazoom.jl.player.Player playerCoin = new javazoom.jl.player.Player(fileInputStreamCoin);
            FileInputStream fileInputStreamRun = new FileInputStream("resources/dead.mp3");
            javazoom.jl.player.Player playerRun = new javazoom.jl.player.Player(fileInputStreamRun);
                FileInputStream fileInputStreamSoundTrack = new FileInputStream("resources/soundtrack.mp3");
                javazoom.jl.player.Player playerSoundTrack = new javazoom.jl.player.Player(fileInputStreamSoundTrack);



                    Thread playerThread = new Thread(() -> {
                        try {
                            playerSoundTrack.play();
                            playerSoundTrack.close();
                        } catch (JavaLayerException e) {
                            e.printStackTrace();
                        }
                    });
                    //playerThread.start();

        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }

        return backgroung;
    }
    protected List<Lazer> createLazers(){
        List<Lazer> l = new ArrayList<>();
        Lazer lazertopo = new Lazer(200, 5, 200, 35); //LAZER type 0 Vertical que apanha o teto
        Lazer lazerchao = new Lazer(200, 80, 200, 105); //LAZER type 0 Vertical que apanha o chao
        Lazer lazer3 = new Lazer(200, 95, 290, 95); //LAZER type 2 horizontal
        Lazer lazer2 = new Lazer(200, 55, 240, 95); //LAZER type 2 y = -x
        Lazer lazer1 = new Lazer(200, 95, 240, 55); //LAZER type 1 y = x
        Lazer lazer0 = new Lazer(200, 40, 200, 90); //LAZER type 0 Vertical
        Lazer l3 = new Lazer(200, 10, 280, 10); //LAZER type 2 horizontal
        Lazer l2 = new Lazer(200, 20, 240, 60); //LAZER type 2 y = -x
        Lazer l1 = new Lazer(200, 60, 240, 20); //LAZER type 1 y = x
        Lazer l0 = new Lazer(200, 20, 200, 80); //LAZER type 0 Vertical
        l.add(l3);
        l.add(l2);
        l.add(l1);
        l.add(l0);
        l.add(lazer3);
        l.add(lazer2);
        l.add(lazer1);
        l.add(lazer0);
        l.add(lazerchao);
        l.add(lazertopo);
        return l;
    }
    protected List<Coin> createCoins(){
        List<Coin> l = new ArrayList<>();
        Coin Cointopo = new Coin(200, 5);
        Coin Coinchao = new Coin(200, 80);
        Coin Coin3 = new Coin(200, 95);
        Coin Coin2 = new Coin(200, 55);
        Coin Coin1 = new Coin(200, 100);
        Coin Coin0 = new Coin(200, 40);
        Coin l3 = new Coin(200, 10);
        Coin l2 = new Coin(200, 20);
        Coin l1 = new Coin(200, 60);
        Coin l0 = new Coin(200, 20);
        l.add(l3);
        l.add(l2);
        l.add(l1);
        l.add(l0);
        l.add(Coin3);
        l.add(Coin2);
        l.add(Coin1);
        l.add(Coin0);
        l.add(Coinchao);
        l.add(Cointopo);
        return l;
    }

    protected List<Lazer> createActiveLazers(){
        return new ArrayList<>();
    }
    protected List<Coin> createActiveCoins(){
        return new ArrayList<>();
    }

    protected Player createPlayer(){
        return Player.getInstance(10,105);
    }

    public Background createBackground(String username, int meters, int coins) {
        Background backgroung = new Background(200, 117);
        backgroung.setPlayer(createPlayer());
        backgroung.setLazers(createLazers());
        backgroung.setCoins(createCoins());
        backgroung.setActiveLazers(createActiveLazers());
        backgroung.setActiveCoins(createActiveCoins());
        backgroung.setUsername(username);

        return backgroung;
    }
}
