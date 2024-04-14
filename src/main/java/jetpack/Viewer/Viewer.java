package jetpack.Viewer;

import java.io.IOException;
import jetpack.GUI.GUI;

public abstract class Viewer<T> {
    private final T model;

    public Viewer(T model) {
        this.model = model;
    }

    public T getModel() {
        return model;
    }

    public void draw(GUI gui, int meters) throws IOException {
        gui.clear();
        drawElements(gui, meters);
        gui.refresh();
    }

    protected abstract void drawElements(GUI gui, int meters);
}
