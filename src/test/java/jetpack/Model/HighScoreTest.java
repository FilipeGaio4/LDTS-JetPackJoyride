package jetpack.Model;

import jetpack.Model.HighScore.HighScore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HighScoreTest {

    @Test
    void testGetHighScore() {
        HighScore highScore = new HighScore();
        String expectedHighScore = "      :::    ::: ::::::::::: ::::::::  :::    :::  ::::::::   ::::::::   ::::::::  :::::::::  :::::::::: \n" +
                "     :+:    :+:     :+:    :+:    :+: :+:    :+: :+:    :+: :+:    :+: :+:    :+: :+:    :+: :+:         \n" +
                "    +:+    +:+     +:+    +:+        +:+    +:+ +:+        +:+        +:+    +:+ +:+    +:+ +:+          \n" +
                "   +#++:++#++     +#+    :#:        +#++:++#++ +#++:++#++ +#+        +#+    +:+ +#++:++#:  +#++:++#      \n" +
                "  +#+    +#+     +#+    +#+   +#+# +#+    +#+        +#+ +#+        +#+    +#+ +#+    +#+ +#+            \n" +
                " #+#    #+#     #+#    #+#    #+# #+#    #+# #+#    #+# #+#    #+# #+#    #+# #+#    #+# #+#             \n" +
                "###    ### ########### ########  ###    ###  ########   ########   ########  ###    ### ##########       \n" +
                "\n";
        assertEquals(expectedHighScore, highScore.getHighScore());
    }

    @Test
    void testGetPressEsc() {
        HighScore highScore = new HighScore();
        String expectedPressEsc = "____ ____ _________ ____    _________ ____    _____ ____    _______  __ _____ \n" +
                "/  __/  __/  __/ ___/ ___\\  /  __/ ___/   _\\  /__ __/  _ \\  /  __\\  \\// /__ __\\\n" +
                "|  \\/|  \\/|  \\ |    |    \\  |  \\ |    |  /      / \\ | / \\|  |  \\  \\  /| | / \\  \n" +
                "|  __|    |  /_\\___ \\___ |  |  /_\\___ |  \\_     | | | \\_/|  |  /_ /  \\| | | |  \n" +
                "\\_/  \\_/\\_\\____\\____\\____/  \\____\\____\\____/    \\_/ \\____/  \\____/__/\\\\_/ \\_/  \n" +
                "                                                                               \n" +
                "\n";
        assertEquals(expectedPressEsc, highScore.getPressEsc());
    }
}