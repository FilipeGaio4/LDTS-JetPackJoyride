package jetpack.Controller.Menu;

import jetpack.Controller.Controller;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.EnterUsername.EnterUsername;
import jetpack.Model.HighScore.HighScore;
import jetpack.Model.Instructions.Instructions;
import jetpack.Model.Menu.Menu;
import jetpack.States.EnterUsernameState;
import jetpack.States.HighScoreState;
import jetpack.States.InstructionsState;


public class MenuController extends Controller<Menu> {

    public MenuController(Menu model) {super(model);}

    @Override
    public void step(JetpackJoyride app, GUI.ACTION action, int meters) {
        switch(action)
        {
            case UP:
                getModel().previousChoice();
                break;
            case DOWN:
                getModel().nextChoice();
                break;
            case QUIT:
                app.setState(null);
                break;
            case SELECT:
                if(getModel().getChoice() == 0) app.setState(new EnterUsernameState(new EnterUsername()));
                if(getModel().getChoice() == 1) app.setState(new InstructionsState(new Instructions()));
                if(getModel().getChoice() == 2) app.setState(new HighScoreState(new HighScore()));
                break;
        }
    }
}
