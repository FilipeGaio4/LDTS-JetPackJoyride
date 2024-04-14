package jetpack.Viewer.Background;

import jetpack.GUI.GUI;
import jetpack.Model.Game.elements.Coin;

public class CoinViewer implements ElementViewer<Coin> {
    @Override
    public void draw(Coin element, GUI gui) {
        gui.drawCoins(element.getPosition());
    }
}
