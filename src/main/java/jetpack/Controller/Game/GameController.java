package jetpack.Controller.Game;

import jetpack.Controller.Controller;
import jetpack.Model.Game.background.Background;

public abstract class GameController extends Controller<Background> {
    public GameController(Background background) {
        super(background);
    }
}
