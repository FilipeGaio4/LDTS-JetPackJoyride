package jetpack.Controller.Instructions;

import jetpack.Controller.Controller;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.Instructions.Instructions;
import jetpack.Model.Menu.Menu;
import jetpack.States.MenuState;

import java.io.IOException;

public class InstructionsController extends Controller<Instructions> {
    public InstructionsController(Instructions model) {
        super(model);
    }

    @Override
    public void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException {
        getModel().increaseTicks();
        switch (action) {
            case QUIT:
                app.setState(new MenuState(new Menu()));
                break;
            case DOWN:
                if ( -getModel().getIndex() < getModel().getMaxIndex()) getModel().downIndex();
                break;
            case UP:
                if (-getModel().getIndex() > 0) getModel().upIndex();
                break;
        }
    }
}
