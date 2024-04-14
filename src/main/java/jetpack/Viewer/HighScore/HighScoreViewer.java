package jetpack.Viewer.HighScore;

import com.googlecode.lanterna.TextColor;
import jetpack.GUI.GUI;
import jetpack.Model.HighScore.HighScore;
import jetpack.Model.Position;
import jetpack.Viewer.Viewer;

public class HighScoreViewer extends Viewer<HighScore> {
    public HighScoreViewer(HighScore model) {super(model);}
    @Override
    protected void drawElements(GUI gui, int meters) {
        gui.drawText(new Position(5, 5), getModel().getHighScore(), TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        gui.drawText(new Position(110, 100), getModel().getPressEsc(), TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        gui.drawTextfromCSV(new Position(10, 10), "resources/highscores.csv", TextColor.ANSI.YELLOW);
    }
}
