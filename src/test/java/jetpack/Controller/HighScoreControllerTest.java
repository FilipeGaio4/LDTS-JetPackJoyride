package jetpack.Controller;

import jetpack.Controller.HighScore.HighScoreController;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.HighScore.HighScore;
import jetpack.States.MenuState;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import org.mockito.Mockito;

import java.io.IOException;

public class HighScoreControllerTest {
    @Property
    void step(@ForAll GUI.ACTION action) throws IOException {
        HighScore highScore = new HighScore();
        HighScoreController highScoreController = new HighScoreController(highScore);
        JetpackJoyride app = Mockito.mock(JetpackJoyride.class);
        highScoreController.step(app, action, 1000);
        if(action == GUI.ACTION.QUIT) {
            Mockito.verify(app, Mockito.times(1)).setState(Mockito.any(MenuState.class));
        }
    }
}
