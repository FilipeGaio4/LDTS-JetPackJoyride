package jetpack.States;

import jetpack.Controller.Controller;
import jetpack.Controller.Instructions.InstructionsController;
import jetpack.Model.Instructions.Instructions;
import jetpack.Viewer.Instructions.InstructionsViewer;
import jetpack.Viewer.Viewer;

public class InstructionsState extends State <Instructions>{
    public InstructionsState(Instructions model) {
        super(model);
    }

    @Override
    protected Viewer<Instructions> getViewer() {
        return new InstructionsViewer(getModel());
    }

    @Override
    protected Controller<Instructions> getController() {
        return new InstructionsController(getModel());
    }
}
