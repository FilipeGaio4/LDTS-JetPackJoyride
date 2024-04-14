package jetpack.Model.Game.elements;

import com.googlecode.lanterna.graphics.TextGraphics;
import jetpack.Model.Position;

public abstract class Element {
    //Uma classe abstrata de todos os elementos que compoe e podem vir a compor o jogo
    protected Position position;

    public Element(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position getPosition() {return new Position(getX(), getY());}
    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    public void setPosition(int a, int b) {
        this.position = new Position(a,b);
    }

}
