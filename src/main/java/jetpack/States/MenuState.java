package jetpack.States;

import jetpack.Controller.Controller;
import jetpack.Controller.Menu.MenuController;
import jetpack.Model.Menu.Menu;
import jetpack.Viewer.Menu.MenuViewer;
import jetpack.Viewer.Viewer;

public class MenuState extends State<Menu> {

    public MenuState(Menu model) {
        super(model);
    }
    @Override
    protected Viewer<Menu> getViewer() {return new MenuViewer(getModel());}
    @Override
    protected Controller<Menu> getController() {
        return new MenuController(getModel());
    }
}
