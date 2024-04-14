package jetpack.Model.Game.elements;

import jetpack.Model.Position;
import java.util.ArrayList;

public class Player extends Element {
    private static Player instance = null;
    public ArrayList<Position> getBody() {
        return body;
    }

    private final ArrayList<Position> body;

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    int velocity = 0;

    public int getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }

    int timePeriod = 0;

    public int getAceleration() {
        return aceleration;
    }

    public void setAceleration(int aceleration) {
        this.aceleration = aceleration;
    }

    int aceleration = -2;

    public boolean isBoost() {
        return boost;
    }

    public void setBoost(boolean boost) {
        this.boost = boost;
    }

    private boolean boost;

    public static Player getInstance(int x, int y) {
        if (instance == null) {
            instance = new Player(x, y);
        } else {
            instance.setPosition(x, y);
            instance.setVelocity(0);
            instance.setTimePeriod(0);
            instance.boost = false;
            Position h1 = new Position(x-1, y);
            Position h2 = new Position(x-1, y-1);
            Position h3 = new Position(x, y-1);
            Position h4 = new Position(x+1, y-1);
            Position h5 = new Position(x+1, y);
            Position b1 = new Position(x-1, y+1);
            Position b2 = new Position(x, y+1);
            Position b3 = new Position(x+1, y+1);
            Position b4 = new Position(x-1, y+2);
            Position b5 = new Position(x, y+2);
            Position b6 = new Position(x+1, y+2);
            Position b7 = new Position(x-1, y+3);
            Position b8 = new Position(x, y+3);
            Position b9 = new Position(x+1, y+3);
            Position b10 = new Position(x-1, y+4);
            Position b11 = new Position(x, y+4);
            Position b12 = new Position(x+1, y+4);
            Position j1 = new Position(x-2, y+1);
            Position j2 = new Position(x-2, y+2);
            Position j3 = new Position(x-2, y+3);
            instance.body.clear();
            //Head
            instance.body.add(h1);
            instance.body.add(h2);
            instance.body.add(h3);
            instance.body.add(h4);
            instance.body.add(h5);
            //Body
            instance.body.add(b1);
            instance.body.add(b2);
            instance.body.add(b3);
            instance.body.add(b4);
            instance.body.add(b5);
            instance.body.add(b6);
            instance.body.add(b7);
            instance.body.add(b8);
            instance.body.add(b9);
            instance.body.add(b10);
            instance.body.add(b11);
            instance.body.add(b12);
            //Jetpack
            instance.body.add(j1);
            instance.body.add(j2);
            instance.body.add(j3);
        }
        return instance;
    }

    private Player(int x, int y) {
        //cria o jogador e todo o seu corpo em relação à sua position
        super(x, y);
        boost = false;
        Position h1 = new Position(getX()-1, getY());
        Position h2 = new Position(getX()-1, getY()-1);
        Position h3 = new Position(getX(), getY()-1);
        Position h4 = new Position(getX()+1, getY()-1);
        Position h5 = new Position(getX()+1, getY());
        Position b1 = new Position(getX()-1, getY()+1);
        Position b2 = new Position(getX(), getY()+1);
        Position b3 = new Position(getX()+1, getY()+1);
        Position b4 = new Position(getX()-1, getY()+2);
        Position b5 = new Position(getX(), getY()+2);
        Position b6 = new Position(getX()+1, getY()+2);
        Position b7 = new Position(getX()-1, getY()+3);
        Position b8 = new Position(getX(), getY()+3);
        Position b9 = new Position(getX()+1, getY()+3);
        Position b10 = new Position(getX()-1, getY()+4);
        Position b11 = new Position(getX(), getY()+4);
        Position b12 = new Position(getX()+1, getY()+4);
        Position j1 = new Position(getX()-2, getY()+1);
        Position j2 = new Position(getX()-2, getY()+2);
        Position j3 = new Position(getX()-2, getY()+3);
        body = new ArrayList<Position>();
        //Head
        body.add(h1);
        body.add(h2);
        body.add(h3);
        body.add(h4);
        body.add(h5);
        //Body
        body.add(b1);
        body.add(b2);
        body.add(b3);
        body.add(b4);
        body.add(b5);
        body.add(b6);
        body.add(b7);
        body.add(b8);
        body.add(b9);
        body.add(b10);
        body.add(b11);
        body.add(b12);
        //Jetpack
        body.add(j1);
        body.add(j2);
        body.add(j3);
    }
}
