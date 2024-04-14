package jetpack.Controller.HighScore;

import jetpack.Controller.Controller;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.HighScore.HighScore;
import jetpack.Model.Menu.Menu;
import jetpack.States.MenuState;

import java.io.IOException;

public class HighScoreController extends Controller<HighScore> {
    public HighScoreController(HighScore highscore) {super(highscore);}
    @Override
    public void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException {
        switch(action)
        {
            case QUIT:
                app.setState(new MenuState(new Menu()));
                break;
        }
    }
}
