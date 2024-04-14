package jetpack.States;

import jetpack.Controller.Controller;
import jetpack.Controller.HighScore.HighScoreController;
import jetpack.Model.HighScore.HighScore;
import jetpack.Viewer.HighScore.HighScoreViewer;
import jetpack.Viewer.Viewer;

public class HighScoreState extends State<HighScore> {
    public HighScoreState(HighScore model) {
        super(model);
    }

    @Override
    protected Viewer<HighScore> getViewer() {
        return new HighScoreViewer(getModel());
    }

    @Override
    protected Controller<HighScore> getController() {
        return new HighScoreController(getModel());
    }
}
