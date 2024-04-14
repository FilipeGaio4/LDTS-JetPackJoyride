package jetpack.Viewer.Background;

import jetpack.GUI.GUI;
import jetpack.Model.Game.elements.Lazer;

public class LazerViewer implements ElementViewer<Lazer>{

    @Override
    public void draw(Lazer element, GUI gui) {
        gui.drawLazer(element.getPosition(), element.getEnd(), element.getType());
    }
}
