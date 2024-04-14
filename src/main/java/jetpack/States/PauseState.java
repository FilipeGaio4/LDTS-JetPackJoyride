package jetpack.States;

import jetpack.Controller.Controller;
import jetpack.Controller.Pause.PauseController;
import jetpack.Model.Pause.Pause;
import jetpack.Viewer.Pause.PauseViewer;
import jetpack.Viewer.Viewer;

public class PauseState extends State<Pause> {
    public PauseState(Pause pauseState) {
        super(pauseState);
    }

    @Override
    protected Viewer<Pause> getViewer() {
        return new PauseViewer(getModel());
    }

    @Override
    protected Controller<Pause> getController() {
        return new PauseController(getModel());
    }
}
