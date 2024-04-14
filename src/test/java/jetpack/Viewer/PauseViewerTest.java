
package jetpack.Viewer;

import jetpack.GUI.GUI;
import jetpack.Model.Pause.Pause;
import jetpack.Model.Position;
import jetpack.Viewer.Pause.PauseViewer;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import com.googlecode.lanterna.TextColor;
import java.util.List;
public class PauseViewerTest {
    private static class TestPauseViewer extends PauseViewer {
        public TestPauseViewer(Pause model) {
            super(model);
        }
        public void callDrawElements(GUI gui, int meters) {
            drawElements(gui, meters);
        }
    }

    @Test
    void testDrawElements() {
        // Mocks
        GUI gui = Mockito.mock(GUI.class);
        Pause model = Mockito.mock(Pause.class);
        Mockito.when(model.getPauseMenu()).thenReturn("PauseMenu");
        Mockito.when(model.getEntries()).thenReturn(List.of("Entry1", "Entry2", "Entry3"));
        Mockito.when(model.isSelected(0)).thenReturn(true);
        Mockito.when(model.isSelected(1)).thenReturn(false);
        Mockito.when(model.isSelected(2)).thenReturn(true);
        TestPauseViewer testPauseViewer = new TestPauseViewer(model);
        testPauseViewer.callDrawElements(gui, 0);
        Mockito.verify(gui, Mockito.times(1)).drawText(
                ArgumentMatchers.any(Position.class),
                ArgumentMatchers.eq("PauseMenu"),
                ArgumentMatchers.eq(TextColor.ANSI.RED_BRIGHT),
                ArgumentMatchers.eq(TextColor.ANSI.BLACK));

        Mockito.verify(gui, Mockito.atLeastOnce()).drawText(
                ArgumentMatchers.any(Position.class),
                ArgumentMatchers.anyString(),
                ArgumentMatchers.any(TextColor.ANSI.class),
                ArgumentMatchers.eq(TextColor.ANSI.BLACK));
    }
}
