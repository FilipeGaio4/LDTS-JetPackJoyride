package jetpack.Controller.GameOver;

import jetpack.Controller.Controller;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.Game.background.BackgroundBuilder;
import jetpack.Model.GameOver.GameOver;
import jetpack.Model.Menu.Menu;
import jetpack.States.GameState;
import jetpack.States.MenuState;

import java.io.IOException;
import java.util.List;

public class GameOverController extends Controller<GameOver> {
    public GameOverController(GameOver model) {
        super(model);
        for(int i = 0; i < getModel().getTotal().length(); i++){
            switch(getModel().getTotal().charAt(i)){
                case '1':
                    setTotalList(0);
                    break;
                case '2':
                    setTotalList(1);
                    break;
                case '3':
                    setTotalList(2);
                    break;
                case '4':
                    setTotalList(3);
                    break;
                case '5':
                    setTotalList(4);
                    break;
                case '6':
                    setTotalList(5);
                    break;
                case '7':
                    setTotalList(6);
                    break;
                case '8':
                    setTotalList(7);
                    break;
                case '9':
                    setTotalList(8);
                    break;
                case '0':
                    setTotalList(9);
                    break;
            }
        }
        //for coins
        for(int i = 0; i < getModel().getCollectedCoins().length(); i++){
            switch(getModel().getCollectedCoins().charAt(i)){
                case '1':
                    setCollectedCoinsList(0);
                    break;
                case '2':
                    setCollectedCoinsList(1);
                    break;
                case '3':
                    setCollectedCoinsList(2);
                    break;
                case '4':
                    setCollectedCoinsList(3);
                    break;
                case '5':
                    setCollectedCoinsList(4);
                    break;
                case '6':
                    setCollectedCoinsList(5);
                    break;
                case '7':
                    setCollectedCoinsList(6);
                    break;
                case '8':
                    setCollectedCoinsList(7);
                    break;
                case '9':
                    setCollectedCoinsList(8);
                    break;
                case '0':
                    setCollectedCoinsList(9);
                    break;
            }
        }
        //for meters
        for(int i = 0; i < getModel().getMeters_().length(); i++){
            switch(getModel().getMeters_().charAt(i)){
                case '1':
                    setMetersList(0);
                    break;
                case '2':
                    setMetersList(1);
                    break;
                case '3':
                    setMetersList(2);
                    break;
                case '4':
                    setMetersList(3);
                    break;
                case '5':
                    setMetersList(4);
                    break;
                case '6':
                    setMetersList(5);
                    break;
                case '7':
                    setMetersList(6);
                    break;
                case '8':
                    setMetersList(7);
                    break;
                case '9':
                    setMetersList(8);
                    break;
                case '0':
                    setMetersList(9);
                    break;
            }
        }
    }
    private void setCollectedCoinsList(int pos) {
        List<String> l = getModel().getCoinsCollectedToShow();
        l.add(getModel().getDigits().get(pos));
        getModel().setCoinsCollectedToShow(l);
    }
    private void setMetersList(int pos){
        List<String> l = getModel().getMetersToShow();
        l.add(getModel().getDigits().get(pos));
        getModel().setMetersToShow(l);
    }
    private void setTotalList(int pos){
        List<String> l = getModel().getTotalToShow();
        l.add(getModel().getDigits().get(pos));
        getModel().setTotalToShow(l);
    }
    @Override
    public void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException {
        if(action == GUI.ACTION.SELECT)
        {
            if(getModel().getChoice() == 0) app.setState(new GameState(new BackgroundBuilder().createBackground(getModel().getUsername())));
            else if (getModel().getChoice() == 1) app.setState(new MenuState(new Menu()));
        }
        else if (action == GUI.ACTION.QUIT) app.setState(null);
        else if (action == GUI.ACTION.UP) getModel().previousChoice();
        else if(action == GUI.ACTION.DOWN) getModel().nextChoice();

    }
}
