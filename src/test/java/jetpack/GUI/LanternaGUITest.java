package jetpack.GUI;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import jetpack.Model.Game.elements.Player;
import jetpack.Model.Position;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class LanternaGUITest {
    private LanternaGUI gui;
    private TextGraphics tg;

    @BeforeEach
    void setUp() {
        Screen screen = Mockito.mock(Screen.class);
        tg = Mockito.mock(TextGraphics.class);
        Mockito.when(screen.newTextGraphics()).thenReturn(tg);
        gui = new LanternaGUI(screen);
    }


    @Test
    void drawPlayer() {
        Player player = Player.getInstance(10,10);
        gui.drawPlayer(new Position(player.getX(), player.getY()), false, player.getBody());

        Mockito.verify(tg, Mockito.atLeastOnce()).setBackgroundColor(Mockito.any(TextColor.class));
        Mockito.verify(tg, Mockito.atLeastOnce()).putString(Mockito.any(TerminalPosition.class), Mockito.anyString());
        Mockito.verify(tg, Mockito.atLeastOnce()).enableModifiers(Mockito.any(SGR.class));
        Mockito.verify(tg, Mockito.atLeastOnce()).clearModifiers();
    }


    @Test
    void drawText() {
        TextColor.ANSI t1 = TextColor.ANSI.YELLOW;
        TextColor.ANSI t2 = TextColor.ANSI.BLACK;
        gui.drawText(new Position(1, 1), "Hello World\nFilipe Gaio\nTomás Esteves", t1, t2);

        Mockito.verify(tg, Mockito.times(1)).setBackgroundColor(t2);
        Mockito.verify(tg, Mockito.times(1)).setForegroundColor(t1);
        Mockito.verify(tg, Mockito.times(1)).putString(new TerminalPosition(1, 1), "Hello World");
        Mockito.verify(tg, Mockito.times(1)).putString(new TerminalPosition(1, 2), "Filipe Gaio");
        Mockito.verify(tg, Mockito.times(1)).putString(new TerminalPosition(1, 3), "Tomás Esteves");
    }
    @Test
    void drawNumCoin() {
        gui.drawNumCoin('5', 1);

        Mockito.verify(tg, Mockito.times(1)).setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
        Mockito.verify(tg, Mockito.times(1)).drawLine(169, 37, 171, 37, ' ');
        Mockito.verify(tg, Mockito.times(1)).drawLine(169, 37, 169, 40, ' ');
        Mockito.verify(tg, Mockito.times(1)).drawLine(169, 40, 171, 40, ' ');
        Mockito.verify(tg, Mockito.times(1)).drawLine(171, 40, 171, 43, ' ');
        Mockito.verify(tg, Mockito.times(1)).drawLine(169, 43, 171, 43, ' ');
    }

    @Test
    void drawLine(){
        gui.drawLine(new Position(1,1), new Position(2,2));

        Mockito.verify(tg, Mockito.times(1)).setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
        Mockito.verify(tg, Mockito.times(1)).drawLine(1, 1, 2, 2, ' ');
    }

    @Test
    void drawNum(){
        gui.drawNum('0', 1);

        Mockito.verify(tg, Mockito.times(1)).setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
        Mockito.verify(tg,Mockito.times(1)).drawLine(182, 10, 188, 10, ' ');
        Mockito.verify(tg,Mockito.times(1)).drawLine(182, 25, 188, 25, ' ');
        Mockito.verify(tg,Mockito.times(1)).drawLine(182, 10, 182, 25, ' ');
        Mockito.verify(tg,Mockito.times(1)).drawLine(188, 10, 188, 25, ' ');
    }

    @Test
    void changeBackgroundColor(){
        gui.changeBackgroundColor(20099);

        Mockito.verify(tg, Mockito.times(1)).setBackgroundColor(TextColor.Factory.fromString("#2b2b2b"));
        Mockito.verify(tg, Mockito.times(1)).enableModifiers(SGR.BLINK);
        Mockito.verify(tg, Mockito.times(1)).fillRectangle(new TerminalPosition(1, 1), new TerminalSize(198, 115), '+');
        Mockito.verify(tg, Mockito.times(1)).disableModifiers();
    }

    @Test
    void drawBackground() {
        gui.drawBackground(20);

        Mockito.verify(tg, Mockito.times(1)).setBackgroundColor(TextColor.Factory.fromString("#336699"));
        Mockito.verify(tg, Mockito.times(1)).setBackgroundColor(TextColor.Factory.fromString("#ba8749"));
        Mockito.verify(tg, Mockito.times(1)).fillRectangle(new TerminalPosition(1, 100), new TerminalSize(198, 16), ' ');
        Mockito.verify(tg, Mockito.times(1)).setBackgroundColor(TextColor.Factory.fromString("#000000"));
        Mockito.verify(tg, Mockito.times(1)).fillRectangle(new TerminalPosition(0, 0), new TerminalSize(1, 117), ' ');
        Mockito.verify(tg, Mockito.times(1)).fillRectangle(new TerminalPosition(0, 0), new TerminalSize(200, 1), ' ');
        Mockito.verify(tg, Mockito.times(1)).fillRectangle(new TerminalPosition(199, 0), new TerminalSize(1, 117), ' ');
        Mockito.verify(tg, Mockito.times(1)).fillRectangle(new TerminalPosition(0, 116), new TerminalSize(200, 1), ' ');
    }

}