package jetpack.States;

import jetpack.Controller.Controller;
import jetpack.Controller.Game.BackgroundController;
import jetpack.Model.Game.background.Background;
import jetpack.Viewer.Background.GameViewer;
import jetpack.Viewer.Viewer;

public class GameState extends State<Background> {

    public GameState(Background model) {super(model);}

    @Override
    protected Viewer<Background> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Background> getController() {
        return new BackgroundController(getModel());
    }
}
