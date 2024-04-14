package jetpack.States;

import jetpack.GUI.GUI;
import jetpack.Controller.Controller;
import jetpack.JetpackJoyride;
import jetpack.Viewer.Viewer;

import java.io.IOException;

public abstract class State<T> {
    private final T model;
    private final Controller<T> controller;
    private final Viewer<T> viewer;
    public State(T model) {
        this.model = model;
        this.viewer = getViewer();
        this.controller = getController();
    }
    protected abstract Viewer<T> getViewer();

    protected abstract Controller<T> getController();

    public T getModel() {
        return model;
    }
    public void step(JetpackJoyride game, GUI gui, int meters) throws IOException {
        GUI.ACTION action = gui.getNextAction();
        controller.step(game, action, meters);
        viewer.draw(gui, meters);
    }


}
