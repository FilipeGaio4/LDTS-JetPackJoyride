package jetpack.Controller;

import jetpack.Controller.Instructions.InstructionsController;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.Instructions.Instructions;
import jetpack.States.MenuState;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;

public class InstructionsControllerTest {

    @Property
    void step(@ForAll GUI.ACTION action) throws IOException {
        Instructions instructions = Mockito.mock(Instructions.class);
        InstructionsController instructionsController = new InstructionsController(instructions);
        JetpackJoyride app = Mockito.mock(JetpackJoyride.class);
        instructionsController.step(app, action, 1000);
        Mockito.verify(instructions, Mockito.times(1)).increaseTicks();
        if(action == GUI.ACTION.QUIT) {
            Mockito.verify(app, Mockito.times(1)).setState(Mockito.any(MenuState.class));
        }
        else if(action == GUI.ACTION.DOWN) {
            if ( -instructions.getIndex() < instructions.getMaxIndex()) Mockito.verify(instructions, Mockito.times(1)).downIndex();
        }
        else if(action == GUI.ACTION.UP) {
            if ( -instructions.getIndex() > 0) Mockito.verify(instructions, Mockito.times(1)).upIndex();
        }
    }
}
