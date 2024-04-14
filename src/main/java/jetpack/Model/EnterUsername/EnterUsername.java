package jetpack.Model.EnterUsername;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.TextBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnterUsername {
    public String getEnterUsername() {
        return enterUsername;
    }

    public List<String> getAlphabet() {
        return alphabet;
    }
    private List<String> alphabet;

    public List<String> getInsertIntoScreen() {
        return insertIntoScreen;
    }

    public void setInsertIntoScreen(List<String> insertIntoScreen) {
        this.insertIntoScreen = insertIntoScreen;
    }

    private List<String> insertIntoScreen = new ArrayList<>();

    public List<Character> getInsertedUsername() {
        return insertedUsername;
    }

    public void setInsertedUsername(List<Character> insertedUsername) {
        this.insertedUsername = insertedUsername;
    }

    private List<Character> insertedUsername = new ArrayList<>();

    private final String enterUsername = "\n" +
            " _______  _       _________ _______  _______                     _______  _______  _______  _        _______  _______  _______        \n" +
            "(  ____ \\( (    /|\\__   __/(  ____ \\(  ____ )          |\\     /|(  ____ \\(  ____ \\(  ____ )( (    /|(  ___  )(       )(  ____ \\       \n" +
            "| (    \\/|  \\  ( |   ) (   | (    \\/| (    )|          | )   ( || (    \\/| (    \\/| (    )||  \\  ( || (   ) || () () || (    \\/ _     \n" +
            "| (__    |   \\ | |   | |   | (__    | (____)|          | |   | || (_____ | (__    | (____)||   \\ | || (___) || || || || (__    (_)    \n" +
            "|  __)   | (\\ \\) |   | |   |  __)   |     __)          | |   | |(_____  )|  __)   |     __)| (\\ \\) ||  ___  || |(_)| ||  __)          \n" +
            "| (      | | \\   |   | |   | (      | (\\ (             | |   | |      ) || (      | (\\ (   | | \\   || (   ) || |   | || (       _     \n" +
            "| (____/\\| )  \\  |   | |   | (____/\\| ) \\ \\__          | (___) |/\\____) || (____/\\| ) \\ \\__| )  \\  || )   ( || )   ( || (____/\\(_)    \n" +
            "(_______/|/    )_)   )_(   (_______/|/   \\__/          (_______)\\_______)(_______/|/   \\__/|/    )_)|/     \\||/     \\|(_______/       \n" +
            "                                                                                                                                      \n" +
            "\n";
    public EnterUsername() {
        this.alphabet = Arrays.asList("\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "| .'|\n" +
                "|__,|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " _   \n" +
                "| |_ \n" +
                "| . |\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "|  _|\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "   _ \n" +
                " _| |\n" +
                "| . |\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "| -_|\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " ___ \n" +
                "|  _|\n" +
                "|  _|\n" +
                "|_|  \n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "| . |\n" +
                "|_  |\n" +
                "|___|\n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " _   \n" +
                "| |_ \n" +
                "|   |\n" +
                "|_|_|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "   \n" +
                " _ \n" +
                "|_|\n" +
                "| |\n" +
                "|_|\n" +
                "   \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "   _ \n" +
                "  |_|\n" +
                "  | |\n" +
                " _| |\n" +
                "|___|\n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " _   \n" +
                "| |_ \n" +
                "| '_|\n" +
                "|_,_|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "   \n" +
                " _ \n" +
                "| |\n" +
                "| |\n" +
                "|_|\n" +
                "   \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                "       \n" +
                " _____ \n" +
                "|     |\n" +
                "|_|_|_|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "|   |\n" +
                "|_|_|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "| . |\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "| . |\n" +
                "|  _|\n" +
                "|_|  \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "| . |\n" +
                "|_  |\n" +
                "  |_|\n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "|  _|\n" +
                "|_|  \n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "|_ -|\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " _   \n" +
                "| |_ \n" +
                "|  _|\n" +
                "|_|  \n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " _ _ \n" +
                "| | |\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " _ _ \n" +
                "| | |\n" +
                " \\_/ \n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                "       \n" +
                " _ _ _ \n" +
                "| | | |\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " _ _ \n" +
                "|_'_|\n" +
                "|_,_|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " _ _ \n" +
                "| | |\n" +
                "|_  |\n" +
                "|___|\n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                "     \n" +
                " ___ \n" +
                "|- _|\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|  _  |\n" +
                "|     |\n" +
                "|__|__|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "| __  |\n" +
                "| __ -|\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|     |\n" +
                "|   --|\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " ____  \n" +
                "|    \\ \n" +
                "|  |  |\n" +
                "|____/ \n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|   __|\n" +
                "|   __|\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|   __|\n" +
                "|   __|\n" +
                "|__|   \n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|   __|\n" +
                "|  |  |\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|  |  |\n" +
                "|     |\n" +
                "|__|__|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|     |\n" +
                "|-   -|\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                "    __ \n" +
                " __|  |\n" +
                "|  |  |\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|  |  |\n" +
                "|    -|\n" +
                "|__|__|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " __    \n" +
                "|  |   \n" +
                "|  |__ \n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|     |\n" +
                "| | | |\n" +
                "|_|_|_|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|   | |\n" +
                "| | | |\n" +
                "|_|___|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|     |\n" +
                "|  |  |\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|  _  |\n" +
                "|   __|\n" +
                "|__|   \n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|     |\n" +
                "|  |  |\n" +
                "|__  _|\n" +
                "   |__|\n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "| __  |\n" +
                "|    -|\n" +
                "|__|__|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|   __|\n" +
                "|__   |\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  |_|  \n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|  |  |\n" +
                "|  |  |\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|  |  |\n" +
                "|  |  |\n" +
                " \\___/ \n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _ _ _ \n" +
                "| | | |\n" +
                "| | | |\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " __ __ \n" +
                "|  |  |\n" +
                "|-   -|\n" +
                "|__|__|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " __ __ \n" +
                "|  |  |\n" +
                "|_   _|\n" +
                "  |_|  \n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " _____ \n" +
                "|__   |\n" +
                "|   __|\n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                "       \n" +
                "       \n" +
                "       \n" +
                " _____ \n" +
                "|_____|\n" +
                "\n", "\n" +
                "\n" +
                "       \n" +
                " ___   \n" +
                "|_  |  \n" +
                " _| |_ \n" +
                "|_____|\n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " ___ \n" +
                "|_  |\n" +
                "|  _|\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " ___ \n" +
                "|_  |\n" +
                "|_  |\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " ___ \n" +
                "| | |\n" +
                "|_  |\n" +
                "  |_|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " ___ \n" +
                "|  _|\n" +
                "|_  |\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " ___ \n" +
                "|  _|\n" +
                "| . |\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " ___ \n" +
                "|_  |\n" +
                "  | |\n" +
                "  |_|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " ___ \n" +
                "| . |\n" +
                "| . |\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " ___ \n" +
                "| . |\n" +
                "|_  |\n" +
                "|___|\n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "     \n" +
                " ___ \n" +
                "|   |\n" +
                "| | |\n" +
                "|___|\n" +
                "     \n" +
                "\n");
    }
}