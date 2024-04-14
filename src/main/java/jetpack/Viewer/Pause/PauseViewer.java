package jetpack.Viewer.Pause;

import com.googlecode.lanterna.TextColor;
import jetpack.GUI.GUI;
import jetpack.Model.Pause.Pause;
import jetpack.Model.Position;
import jetpack.Viewer.Viewer;

public class PauseViewer extends Viewer<Pause> {
    public PauseViewer(Pause model) {
        super(model);
    }

    @Override
    protected void drawElements(GUI gui, int meters) {
        gui.drawText(new Position(35,35), getModel().getPauseMenu(), TextColor.ANSI.RED_BRIGHT, TextColor.ANSI.BLACK);
        for (int i = 0; i < getModel().getEntries().size(); i++)
            gui.drawText(
                    new Position(68, 58 + 10 * i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? TextColor.ANSI.RED_BRIGHT : TextColor.ANSI.YELLOW_BRIGHT, TextColor.ANSI.BLACK);
    }
}
