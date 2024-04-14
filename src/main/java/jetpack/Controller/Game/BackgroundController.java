package jetpack.Controller.Game;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.Game.background.Background;
import jetpack.Model.Game.elements.Coin;
import jetpack.Model.Game.elements.Lazer;
import jetpack.Model.GameOver.GameOver;
import jetpack.Model.Menu.Menu;
import jetpack.Model.Pause.Pause;
import jetpack.States.GameOverState;
import jetpack.States.MenuState;
import jetpack.States.PauseState;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BackgroundController extends GameController {
    public BackgroundController(Background backgroung) {
        super(backgroung);
        this.playerController = new PlayerController(backgroung);
        this.lazerController = new LazerController(backgroung);
        this.coinController = new CoinController(backgroung);
    }
    private PlayerController playerController;
    private LazerController lazerController;
    private CoinController coinController;
    @Override
    public void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException {
        if (action == GUI.ACTION.p || action == GUI.ACTION.P || action == GUI.ACTION.QUIT){
            app.setState(new PauseState(new Pause(meters,getModel())));
        }
        else{
            lazerCalculate(meters);
            coinCalculate(meters);
            playerController.step(app, action, meters);
            lazerController.step(app, action, meters);
            coinController.step(app, action, meters);
        }
    }

    private void coinCalculate(int meters)
    {
        boolean exist = false;
        if (meters % 66 == 0){
            Random random = new Random();
            int randint = random.nextInt(getModel().getCoins().size()); //escolhe um Coin random da lista dos Coins
            Coin randomCoin = new Coin(getModel().getCoins().get(randint));
            List<Coin> activeCoins = new ArrayList<>(getModel().getActiveCoins());
            for (Coin c : activeCoins){
                if (c.getY() == randomCoin.getY()) {
                    exist = true;
                    break;
                }
            }
            if (!exist){
                activeCoins.add(randomCoin);
                getModel().setActiveCoins(activeCoins);
            }
        }

    }
    private void lazerCalculate(int meters){
        boolean exist = false;
        if (meters / 20 >= 350) {
            if (meters % 15 == 0){
                Random random = new Random();
                int randint = random.nextInt(getModel().getLazers().size()); //escolhe um lazer random da lista dos 8 lazers
                Lazer randomLazer = new Lazer(getModel().getLazers().get(randint));
                List<Lazer> activeLazers = new ArrayList<>(getModel().getActiveLazers());
                for (Lazer l : activeLazers){
                    if (l.getY() == randomLazer.getY()) {
                        exist = true;
                        break;
                    }
                }
                if (!exist){
                    activeLazers.add(randomLazer);
                    getModel().setActiveLazers(activeLazers);
                }
            }
        }
        else if (meters / 20 >= 300) {
            if (meters % 30 == 0){
                Random random = new Random();
                int randint = random.nextInt(getModel().getLazers().size()); //escolhe um lazer random da lista dos 8 lazers
                Lazer randomLazer = new Lazer(getModel().getLazers().get(randint));
                List<Lazer> activeLazers = new ArrayList<>(getModel().getActiveLazers());
                for (Lazer l : activeLazers){
                    if (l.getY() == randomLazer.getY()) {
                        exist = true;
                        break;
                    }
                }
                if (!exist){
                    activeLazers.add(randomLazer);
                    getModel().setActiveLazers(activeLazers);
                }
            }
        }
        else if (meters / 20 >= 200) {
            if (meters % 50 == 0){
                Random random = new Random();
                int randint = random.nextInt(getModel().getLazers().size()); //escolhe um lazer random da lista dos lazers
                Lazer randomLazer = new Lazer(getModel().getLazers().get(randint));
                List<Lazer> activeLazers = new ArrayList<>(getModel().getActiveLazers());
                for (Lazer l : activeLazers){
                    if (l.getY() == randomLazer.getY()) {
                        exist = true;
                        break;
                    }
                }
                if (!exist){
                    activeLazers.add(randomLazer);
                    getModel().setActiveLazers(activeLazers);
                }
            }
        }
        else if (meters / 20 >= 100) {
            if (meters % 80 == 0){
                Random random = new Random();
                int randint = random.nextInt(getModel().getLazers().size()); //escolhe um lazer random da lista dos lazers
                Lazer randomLazer = new Lazer(getModel().getLazers().get(randint));
                List<Lazer> activeLazers = new ArrayList<>(getModel().getActiveLazers());
                for (Lazer l : activeLazers){
                    if (l.getY() == randomLazer.getY()) {
                        exist = true;
                        break;
                    }
                }
                if (!exist){
                    activeLazers.add(randomLazer);
                    getModel().setActiveLazers(activeLazers);
                }
            }
        }
        else if (meters / 20 >= 60) {
            if (meters % 110 == 0){
                Random random = new Random();
                int randint = random.nextInt(getModel().getLazers().size()); //escolhe um lazer random da lista dos lazers
                Lazer randomLazer = new Lazer(getModel().getLazers().get(randint));
                List<Lazer> activeLazers = new ArrayList<>(getModel().getActiveLazers());
                for (Lazer l : activeLazers){
                    if (l.getY() == randomLazer.getY()) {
                        exist = true;
                        break;
                    }
                }
                if (!exist){
                    activeLazers.add(randomLazer);
                    getModel().setActiveLazers(activeLazers);
                }
            }
        }
        else{
            if (meters % 140 == 0 || meters == 9){
                Random random = new Random();
                int randint = random.nextInt(getModel().getLazers().size()); //escolhe um lazer random da lista dos lazers
                Lazer randomLazer = new Lazer(getModel().getLazers().get(randint));
                List<Lazer> activeLazers = new ArrayList<>(getModel().getActiveLazers());
                for (Lazer l : activeLazers){
                    if (l.getY() == randomLazer.getY()) {
                        exist = true;
                        break;
                    }
                }
                if (!exist){
                    activeLazers.add(randomLazer);
                    getModel().setActiveLazers(activeLazers);
                }
            }
        }
    }


}
