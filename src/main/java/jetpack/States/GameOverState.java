package jetpack.States;

import jetpack.Controller.Controller;
import jetpack.Controller.GameOver.GameOverController;
import jetpack.Model.GameOver.GameOver;
import jetpack.Viewer.GameOver.GameOverViewer;
import jetpack.Viewer.Viewer;

public class GameOverState extends State<GameOver>{

    public GameOverState(GameOver model) {super(model);}

    @Override
    protected Viewer<GameOver> getViewer() {
        return new GameOverViewer(getModel());
    }

    @Override
    protected Controller<GameOver> getController() {
        return new GameOverController(getModel());
    }
}
