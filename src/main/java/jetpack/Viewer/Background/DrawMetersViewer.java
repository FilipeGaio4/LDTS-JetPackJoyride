package jetpack.Viewer.Background;

import jetpack.GUI.GUI;
import jetpack.Model.Game.DrawMeters.DrawMeters;
import jetpack.Viewer.Viewer;

public class DrawMetersViewer extends Viewer<DrawMeters> {
    public DrawMetersViewer(DrawMeters model) {super(model);}
    @Override
    protected void drawElements(GUI gui, int meters) {
        for (int i = 0; i < getModel().getAtual().length(); i++) {
            char c = getModel().getAtual().charAt(i);
            gui.drawNum(c, getModel().getSize()-i);
        }
    }
}
