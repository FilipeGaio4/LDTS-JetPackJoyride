package jetpack.Viewer.EnterUsername;

import com.googlecode.lanterna.TextColor;
import jetpack.GUI.GUI;
import jetpack.Model.EnterUsername.EnterUsername;
import jetpack.Model.Position;
import jetpack.Viewer.Viewer;

public class EnterUsernameViewer extends Viewer<EnterUsername> {

    public EnterUsernameViewer(EnterUsername model) {super(model);}

    @Override
    protected void drawElements(GUI gui, int meters) {
        gui.drawText(new Position(35, 45), getModel().getEnterUsername(), TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        if(getModel().getInsertIntoScreen() != null && !getModel().getInsertIntoScreen().isEmpty())
            for(int i = 0; i < getModel().getInsertIntoScreen().size(); i++)
                gui.drawText(new Position(35 + 7*i, 60), getModel().getInsertIntoScreen().get(i), TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
    }
}
