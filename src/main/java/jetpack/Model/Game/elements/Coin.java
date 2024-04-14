package jetpack.Model.Game.elements;

public class Coin extends Element{

    public int getTolerance() {
        return tolerance;
    }

    private final int tolerance = 4;

    public Coin(int x, int y) {
        super(x, y);
    }

    public Coin(Coin coin) {
        super(coin.getX(), coin.getY());
    }


}
