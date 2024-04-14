package jetpack.Controller.Pause;

import jetpack.Controller.Controller;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.EnterUsername.EnterUsername;
import jetpack.Model.Game.background.BackgroundBuilder;
import jetpack.Model.HighScore.HighScore;
import jetpack.Model.Menu.Menu;
import jetpack.Model.Pause.Pause;
import jetpack.States.EnterUsernameState;
import jetpack.States.GameState;
import jetpack.States.HighScoreState;
import jetpack.States.MenuState;

import java.io.IOException;

public class PauseController extends Controller<Pause> {
    public PauseController(Pause model) {
        super(model);
    }

    @Override
    public void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException {
        switch(action)
        {
            case UP:
                getModel().previousChoice();
                break;
            case DOWN:
                getModel().nextChoice();
                break;
            case QUIT:
                app.setState(new GameState(getModel().resumeGame()));
                break;
            case p:
                app.setState(new GameState(getModel().resumeGame()));
                break;
            case SELECT:
                if(getModel().getChoice() == 0) app.setState(new GameState(getModel().resumeGame()));
                if(getModel().getChoice() == 1) app.setState(new MenuState(new Menu()));
                break;
        }
    }
}
