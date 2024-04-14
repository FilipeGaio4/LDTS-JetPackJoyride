package jetpack.Controller;

import jetpack.Controller.GameOver.GameOverController;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.Game.background.BackgroundBuilder;
import jetpack.Model.GameOver.GameOver;
import jetpack.Model.Menu.Menu;
import jetpack.States.GameState;
import jetpack.States.MenuState;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOverControllerTest {
    @Property
    void step(@ForAll GUI.ACTION action) throws IOException {
        GameOver model = new GameOver("username", 1000, 5);
        GameOverController gameOverController = new GameOverController(model);
        JetpackJoyride app = Mockito.mock(JetpackJoyride.class);
        gameOverController.step(app, action, 1000);
        if(action == GUI.ACTION.QUIT) {
            Mockito.verify(app, Mockito.times(1)).setState(null);
        }
        else if (action == GUI.ACTION.SELECT) {
            if(gameOverController.getModel().getChoice() == 0) Mockito.verify(app, Mockito.times(1)).setState(Mockito.any(GameState.class));
            else if (gameOverController.getModel().getChoice() == 1) Mockito.verify(app, Mockito.times(1)).setState(Mockito.any(MenuState.class));
        }
    }
}
