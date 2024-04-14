package jetpack.Model.Game.elements;

import jetpack.Model.Position;

public class Lazer extends Element {
    public Position getEnd() {
        return end;
    }

    public void setEnd(Position end) {
        this.end = end;
    }

    private Position end;

    public int getTolerance() {
        return tolerance;
    }

    int tolerance = 3;

    public int getType() {
        return type;
    }

    int type; //type 0 se x = k, 1 se for y = x, 2 se for y = -x, 3 se for y = b

    public Lazer(int xInitial, int yInitial, int xFinal, int yFinal) { //o this é sempre o mais à esquerda o end é o mais à direita
        super(xInitial, yInitial);
        end = new Position(xFinal, yFinal);
        if (xInitial == xFinal) type = 0; //vertical
        else if (yInitial > yFinal) type = 1; // crescente
        else if (yInitial < yFinal) type = 2; // decrescente
        else type = 3; //horizontal
    }
    public Lazer(Lazer l){
        super(l.getX(), l.getY());
        end = new Position(l.end.getX(), l.end.getY());
        if (this.getX() == this.end.getX()) type = 0; //vertical
        else if (this.getY() > this.end.getY()) type = 1; // crescente
        else if (this.getY() < this.end.getY()) type = 2; // decrescente
        else type = 3; //horizontal
    }
}
