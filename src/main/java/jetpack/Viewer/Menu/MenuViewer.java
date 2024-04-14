package jetpack.Viewer.Menu;

import com.googlecode.lanterna.TextColor;
import jetpack.Model.Menu.Menu;
import jetpack.GUI.GUI;
import jetpack.Model.Position;
import jetpack.Viewer.Viewer;

public class MenuViewer extends Viewer<Menu> {
    public MenuViewer(Menu menu) {
        super(menu);
    }
    @Override
    public void drawElements(GUI gui, int meters) {
        gui.drawText(new Position(15, 33), getModel().getJetpackJoyride(), TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(68, 58 + 10 * i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? TextColor.ANSI.RED_BRIGHT : TextColor.ANSI.YELLOW_BRIGHT, TextColor.ANSI.BLACK);
    }
}
