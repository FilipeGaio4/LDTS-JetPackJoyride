package jetpack.Controller;

import jetpack.JetpackJoyride;
import jetpack.GUI.GUI;

import java.io.IOException;

public abstract class Controller<T> {
    private final T model;

    public Controller(T model) {
        this.model = model;
    }

    public T getModel() {
        return model;
    }

    public abstract void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException;
}
