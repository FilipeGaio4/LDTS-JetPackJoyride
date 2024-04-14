package jetpack.Viewer.GameOver;

import com.googlecode.lanterna.TextColor;
import jetpack.GUI.GUI;
import jetpack.Model.GameOver.GameOver;
import jetpack.Model.Position;
import jetpack.Viewer.Viewer;

public class GameOverViewer extends Viewer<GameOver> {
    public GameOverViewer(GameOver model) {super(model);}
    @Override
    protected void drawElements(GUI gui, int meters) {
        gui.drawText(new Position(50, 30), getModel().getGameOver(), TextColor.ANSI.RED, TextColor.ANSI.BLACK);
        gui.drawText(new Position(50, 40), getModel().getTotalString(), TextColor.ANSI.RED, TextColor.ANSI.BLACK);
        gui.drawText(new Position(50, 45), getModel().getMetersString(), TextColor.ANSI.RED, TextColor.ANSI.BLACK);
        gui.drawText(new Position(50, 50), getModel().getCoinsString(), TextColor.ANSI.RED, TextColor.ANSI.BLACK);
        for(int i = 0; i < getModel().getTotalToShow().size(); i++)
            gui.drawText(new Position(75 + 6*i, 40), getModel().getTotalToShow().get(i), TextColor.ANSI.RED, TextColor.ANSI.BLACK);
        for(int i = 0; i < getModel().getMetersToShow().size(); i++)
            gui.drawText(new Position(83 + 6*i, 45), getModel().getMetersToShow().get(i), TextColor.ANSI.RED, TextColor.ANSI.BLACK);
        for(int i = 0; i < getModel().getCoinsCollectedToShow().size(); i++)
            gui.drawText(new Position(112 + 6*i, 50), getModel().getCoinsCollectedToShow().get(i), TextColor.ANSI.RED, TextColor.ANSI.BLACK);
        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(80, 68 + 10 * i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? TextColor.ANSI.RED_BRIGHT : TextColor.ANSI.YELLOW_BRIGHT, TextColor.ANSI.BLACK);
    }
}
