package jetpack.Controller.Game;

import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.Game.background.Background;
import jetpack.Model.Position;

import java.io.IOException;

public class PlayerController extends GameController {
    public PlayerController(Background model) {
        super(model);
    }

    @Override
    public void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException {
        if(action == GUI.ACTION.BOOST || action == GUI.ACTION.UP) getModel().getPlayer().setBoost(true);
        else getModel().getPlayer().setBoost(false);
        boost(getModel().getPlayer().isBoost());
    }

    public Boolean moveUp(int value){

        if (getModel().getPlayer().getY()-value > 2){
            for (Position p : getModel().getPlayer().getBody()){
                p.setPosition(p.getX(), p.getY() - value);
            }
            getModel().getPlayer().setPosition(getModel().getPlayer().getX(), getModel().getPlayer().getY() - value);
            return true;
        }
        else{
            getModel().getPlayer().setVelocity(0);;
        }
        return false;
    }

    public Boolean moveDown(int value){
        if (getModel().getPlayer().getY() + value < 105){
            //Mexe a posição do player e todo o seu corpo
            for (Position p : getModel().getPlayer().getBody()){
                p.setPosition(p.getX(), p.getY() + value);
            }
            getModel().getPlayer().setPosition(getModel().getPlayer().getX(), getModel().getPlayer().getY() + value);
            return true;
        }
        else{
            getModel().getPlayer().setVelocity(0);
        }
        return false;
    }


    public void boost(boolean boost){
        getModel().getPlayer().setBoost(boost);
        if (getModel().getPlayer().getVelocity()== 0) getModel().getPlayer().setTimePeriod(0);
        //A reacao do jetpack é maior se ele tiver a cair só para ser mais fácil aguentá-lo no ar
        if (boost && getModel().getPlayer().getAceleration() == 2 && getModel().getPlayer().getVelocity() < 0){
            getModel().getPlayer().setTimePeriod(getModel().getPlayer().getTimePeriod() + 1);
            getModel().getPlayer().setVelocity(getModel().getPlayer().getVelocity() + getModel().getPlayer().getAceleration() * getModel().getPlayer().getTimePeriod() * getModel().getPlayer().getTimePeriod());
        }
        else if (boost && getModel().getPlayer().getAceleration() == 2){
            getModel().getPlayer().setTimePeriod(getModel().getPlayer().getTimePeriod() + 1);
            getModel().getPlayer().setVelocity(getModel().getPlayer().getVelocity() + 20 + getModel().getPlayer().getAceleration() * getModel().getPlayer().getTimePeriod());
        }
        else if (boost){
            getModel().getPlayer().setAceleration(2);
            getModel().getPlayer().setTimePeriod(0);
        }
        else if (getModel().getPlayer().getAceleration() == -2){
            getModel().getPlayer().setTimePeriod(getModel().getPlayer().getTimePeriod() + 1);
            getModel().getPlayer().setVelocity(getModel().getPlayer().getVelocity() + getModel().getPlayer().getAceleration() * getModel().getPlayer().getTimePeriod());
        }
        else{
            getModel().getPlayer().setAceleration(-2);
            getModel().getPlayer().setTimePeriod(0);
        }
        //O jogador mexe-se consoante a sua velocidade
        if (getModel().getPlayer().getVelocity() > 700) moveUp(3); //IMPORTANTE ESTES TESTES
        else if (getModel().getPlayer().getVelocity() > 400) moveUp(2);
        else if (getModel().getPlayer().getVelocity() > 0) moveUp(1);
        else if (getModel().getPlayer().getVelocity() < -700) moveDown(3);
        else if (getModel().getPlayer().getVelocity() < -400) moveDown(2);
        else if (getModel().getPlayer().getVelocity() < 0) moveDown(1);
    }

}
