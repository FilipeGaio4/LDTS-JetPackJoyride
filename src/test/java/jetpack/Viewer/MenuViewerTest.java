package jetpack.Viewer;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import jetpack.GUI.GUI;
import jetpack.Model.Menu.Menu;
import jetpack.Model.Position;
import jetpack.Viewer.Menu.MenuViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;

public class MenuViewerTest {

    @Test
    void testDrawElements() {
        GUI gui = Mockito.mock(GUI.class);
        Menu model = Mockito.mock(Menu.class);
        Mockito.when(model.getJetpackJoyride()).thenReturn("YourJetpackJoyrideString");
        MenuViewer menuViewer = new MenuViewer(model);
        menuViewer.drawElements(gui, 5000);

        Mockito.verify(gui, Mockito.atLeastOnce()).drawText(
                ArgumentMatchers.any(Position.class),
                ArgumentMatchers.eq("YourJetpackJoyrideString"),
                ArgumentMatchers.eq(TextColor.ANSI.YELLOW),
                ArgumentMatchers.eq(TextColor.ANSI.BLACK));

        for (int i = 0; i < model.getNumberEntries(); i++) {
            Mockito.verify(gui, Mockito.atLeastOnce()).drawText(
                    ArgumentMatchers.any(Position.class),
                    ArgumentMatchers.eq(model.getEntry(i)),
                    ArgumentMatchers.eq(model.isSelected(i) ? TextColor.ANSI.RED_BRIGHT : TextColor.ANSI.YELLOW_BRIGHT),
                    ArgumentMatchers.eq(TextColor.ANSI.BLACK));
        }

    }
}

