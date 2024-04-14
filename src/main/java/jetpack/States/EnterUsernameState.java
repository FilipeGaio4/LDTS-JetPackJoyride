package jetpack.States;

import jetpack.Controller.Controller;
import jetpack.Controller.EnterUsername.EnterUsernameController;
import jetpack.Model.EnterUsername.EnterUsername;
import jetpack.Viewer.EnterUsername.EnterUsernameViewer;
import jetpack.Viewer.Viewer;

public class EnterUsernameState extends State<EnterUsername>{
    public EnterUsernameState(EnterUsername model) {super(model);}

    @Override
    protected Viewer<EnterUsername> getViewer() {
        return new EnterUsernameViewer(getModel());
    }

    @Override
    protected Controller<EnterUsername> getController() {
        return new EnterUsernameController(getModel());
    }
}
