package jetpack.Viewer.Background;

import jetpack.GUI.GUI;
import jetpack.Model.Game.DrawMeters.DrawMeters;
import jetpack.Model.Game.NoCoins.NoCoins;
import jetpack.Model.Game.elements.Element;
import jetpack.Viewer.Viewer;
import jetpack.Model.Game.background.Background;

import java.util.List;

public class GameViewer extends Viewer<Background> {

    public GameViewer(Background model) {
        super(model);
    }

    @Override
    public void drawElements(GUI gui, int meters) {
        gui.drawBackground(meters);
        gui.linesdraw(meters);
        drawElements(gui, getModel().getActiveLazers(), new LazerViewer());
        drawElements(gui, getModel().getActiveCoins(), new CoinViewer());
        drawElement(gui, getModel().getPlayer(), new PlayerViewer());
        DrawMetersViewer drawMetersViewer = new DrawMetersViewer(new DrawMeters(meters));
        drawMetersViewer.drawElements(gui, meters);
        NoCoinsViewer noCoinsViewer = new NoCoinsViewer(new NoCoins(getModel().getCollectedCoins()));
        noCoinsViewer.drawElements(gui, meters);
        gui.drawBorders();
    }

    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }

    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}
