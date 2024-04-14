package jetpack.Viewer.Instructions;

import com.googlecode.lanterna.TextColor;
import jetpack.GUI.GUI;
import jetpack.Model.Game.elements.Player;
import jetpack.Model.Instructions.Instructions;
import jetpack.Model.Position;
import jetpack.Viewer.Viewer;

public class InstructionsViewer extends Viewer<Instructions> {
    public InstructionsViewer(Instructions model) {
        super(model);
    }

    @Override
    protected void drawElements(GUI gui, int meters) {
        gui.drawText(new Position(5, 5 + getModel().getIndex()), getModel().getInstructionsTitle(), TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK); //INRUCTIONSSSS
        gui.drawText(new Position(55, 20 + getModel().getIndex() + 4), "To Activate the jetpack and therefore fly press SPACE or ARROW UP", TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        Player p = Player.getInstance(130, 18 + getModel().getIndex() + 4);
        gui.drawPlayer(new Position(130, 18 + getModel().getIndex() + 4), getModel().getTicks() > 50 ? true : false, p.getBody());
        gui.drawText(new Position(67, 40 + getModel().getIndex() + 4), "Try to catch as many coins as you can", TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        gui.drawCoins(new Position(112, 40 + getModel().getIndex() + 4));
        gui.drawText(new Position(62, 63 + getModel().getIndex() + 4), "Avoid touching a lazer or it will KIIL you...", TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        gui.drawLazer(new Position(112, 75 + getModel().getIndex() + 4), new Position( 132, 55 + getModel().getIndex() +4), 1);
        gui.drawText(new Position(60, 86 + getModel().getIndex() + 4), "Pressing 'P' or ESC will pause the game if you need a break", TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        gui.drawText(new Position(5, 77 + getModel().getIndex() + 25), getModel().getScoreTitle(), TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK); //Score
        gui.drawText(new Position(60, 98 + getModel().getIndex() + 25), "As time goes by you run a certain numer of 'meters'", TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        gui.drawNum(String.valueOf(getModel().getTime()), new Position(118, 92 + getModel().getIndex() + 25));
        gui.drawText(new Position(62, 108 + getModel().getIndex() + 25), "Each coin you cathc adds an additional 10 points", TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        gui.drawText(new Position(60, 120 + getModel().getIndex() + 25), "  When you die it will be added to the highscore table\n\n\n your name followed by your score METERS + 10 x COINS", TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
        gui.drawText(new Position(5, 135 + getModel().getIndex() + 25), getModel().getDevTitle(), TextColor.ANSI.YELLOW, TextColor.ANSI.BLACK);
    }
}
