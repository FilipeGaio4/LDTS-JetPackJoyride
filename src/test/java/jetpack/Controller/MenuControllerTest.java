package jetpack.Controller;

import jetpack.Controller.Menu.MenuController;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.EnterUsername.EnterUsername;
import jetpack.Model.HighScore.HighScore;
import jetpack.Model.Instructions.Instructions;
import jetpack.Model.Menu.Menu;
import jetpack.States.EnterUsernameState;
import jetpack.States.HighScoreState;
import jetpack.States.InstructionsState;
import jetpack.States.MenuState;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;

public class MenuControllerTest {
    @Property
    void step(@ForAll GUI.ACTION action) {
        Menu menu = Mockito.mock(Menu.class);
        MenuController menuController = new MenuController(menu);
        JetpackJoyride app = Mockito.mock(JetpackJoyride.class);
        menuController.step(app, action, 1000);
        if(action == GUI.ACTION.QUIT) {
            Mockito.verify(app, Mockito.times(1)).setState(null);
        }
        else if(action == GUI.ACTION.SELECT) {
            if(menu.getChoice() == 0) Mockito.verify(app, Mockito.times(1)).setState(Mockito.any(EnterUsernameState.class));
            if(menu.getChoice() == 1) Mockito.verify(app, Mockito.times(1)).setState(Mockito.any(InstructionsState.class));
            if(menu.getChoice() == 2) Mockito.verify(app, Mockito.times(1)).setState(Mockito.any(HighScoreState.class));
        }
        else if(action == GUI.ACTION.DOWN) {
            Mockito.verify(menu, Mockito.times(1)).nextChoice();
        }
        else if(action == GUI.ACTION.UP) {
            Mockito.verify(menu, Mockito.times(1)).previousChoice();
        }
    }
}
