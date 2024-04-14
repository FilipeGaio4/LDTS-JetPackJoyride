package jetpack.Controller;

import jetpack.Controller.Pause.PauseController;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.Game.background.Background;
import jetpack.Model.Pause.Pause;
import jetpack.States.GameState;
import jetpack.States.MenuState;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.SyncFailedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PauseControllerTest {

    private Pause pause = Mockito.mock(Pause.class);
    private PauseController pauseController = new PauseController(pause);
    @Property
    void step(@ForAll GUI.ACTION action) throws IOException {
        System.out.println(pause.getChoice());
        JetpackJoyride app = Mockito.mock(JetpackJoyride.class);
        pauseController.step(app, action, 1000);

        if(action == GUI.ACTION.UP) {
            Mockito.verify(pause, Mockito.times(1)).previousChoice();
        }
        if(action == GUI.ACTION.DOWN) {
            Mockito.verify(pause, Mockito.times(1)).nextChoice();
        }
        if(action == GUI.ACTION.SELECT) {
            if(pause.getChoice() == 0) {
                Mockito.verify(app, Mockito.times(1)).setState(Mockito.any(GameState.class));
            }
            if(pause.getChoice() == 1) {
                Mockito.verify(app, Mockito.times(1)).setState(Mockito.any(MenuState.class));
            }
        }
    }
}
