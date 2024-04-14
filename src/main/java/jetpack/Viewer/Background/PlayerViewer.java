package jetpack.Viewer.Background;

import com.googlecode.lanterna.TextColor;
import jetpack.GUI.GUI;
import jetpack.Model.Game.elements.Player;
import jetpack.Model.Position;

public class PlayerViewer implements ElementViewer<Player> {

    @Override
    public void draw(Player element, GUI gui) {
        gui.drawPlayer(element.getPosition(), element.isBoost(), element.getBody());
        //Debug message for player's velocity
        //gui.drawText(new Position(30,30), String.valueOf(element.getVelocity()), TextColor.ANSI.BLACK, TextColor.ANSI.WHITE);

    }
}
