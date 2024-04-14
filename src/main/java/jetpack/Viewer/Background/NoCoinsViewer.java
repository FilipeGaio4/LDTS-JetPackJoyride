package jetpack.Viewer.Background;

import jetpack.GUI.GUI;
import jetpack.Model.Game.DrawMeters.DrawMeters;
import jetpack.Model.Game.NoCoins.NoCoins;
import jetpack.Model.Position;
import jetpack.Viewer.Viewer;

public class NoCoinsViewer extends Viewer<NoCoins> {
    public NoCoinsViewer(NoCoins model) {super(model);}
    @Override
    protected void drawElements(GUI gui, int meters) {
        for (int i = 0; i < getModel().getAtual().length(); i++) {
            char c = getModel().getAtual().charAt(i);
            gui.drawNumCoin(c, getModel().getSize()-i);
        }
        gui.drawLine(new Position(176, 37), new Position(180, 43));
        gui.drawLine(new Position(180, 37), new Position(176, 43));
        gui.drawCoins(new Position(186, 40));
        //gui.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');

    }
}
