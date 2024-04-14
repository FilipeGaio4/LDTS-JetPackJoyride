package jetpack.Model.Pause;

import jetpack.Model.Game.background.Background;
import jetpack.States.PauseState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pause {
    int meters;
    int coins;

    public Background resumeGame() {
        return model;
    }

    public String getPauseMenu() {
        return pauseMenu;
    }

    private final String pauseMenu = "\n" +
            "\n" +
            "      :::::::::     :::     :::    :::  ::::::::  ::::::::::               :::   :::   :::::::::: ::::    ::: :::    ::: \n" +
            "     :+:    :+:  :+: :+:   :+:    :+: :+:    :+: :+:                     :+:+: :+:+:  :+:        :+:+:   :+: :+:    :+:  \n" +
            "    +:+    +:+ +:+   +:+  +:+    +:+ +:+        +:+                    +:+ +:+:+ +:+ +:+        :+:+:+  +:+ +:+    +:+   \n" +
            "   +#++:++#+ +#++:++#++: +#+    +:+ +#++:++#++ +#++:++#               +#+  +:+  +#+ +#++:++#   +#+ +:+ +#+ +#+    +:+    \n" +
            "  +#+       +#+     +#+ +#+    +#+        +#+ +#+                    +#+       +#+ +#+        +#+  +#+#+# +#+    +#+     \n" +
            " #+#       #+#     #+# #+#    #+# #+#    #+# #+#                    #+#       #+# #+#        #+#   #+#+# #+#    #+#      \n" +
            "###       ###     ###  ########   ########  ##########             ###       ### ########## ###    ####  ########        \n" +
            "\n";

    public List<String> getEntries() {
        return entries;
    }

    private List<String> entries = new ArrayList<>();

    public int getChoice() {
        return choice;
    }

    private int choice;
    public void nextChoice() {
        if(choice == -1)
            choice = 0;
        else if(choice == 0)
            choice = 1;
        else if(choice == 1)
            choice = 0;
    }

    public void previousChoice() {
        if(choice == -1)
            choice = 0;
        else if(choice == 0)
            choice = 1;
        else if(choice == 1)
            choice = 0;
    }


    Background model;
    public Pause(int meters, Background model) {
        this.choice = -1;
        this.meters = meters;
        this.coins = model.getCollectedCoins();
        this.username = model.getUsername();
        this.model = model;
        this.entries = Arrays.asList(" ____  ____  ___  __  __  __  __  ____ \n" +
                "(  _ \\( ___)/ __)(  )(  )(  \\/  )( ___)\n" +
                " )   / )__) \\__ \\ )(__)(  )    (  )__) \n" +
                "(_)\\_)(____)(___/(______)(_/\\/\\_)(____)\n" +
                "\n", "\n" +
                "\n" +
                " _____  __  __  ____  ____ \n" +
                "(  _  )(  )(  )(_  _)(_  _)\n" +
                " )(_)(  )(__)(  _)(_   )(  \n" +
                "(___/\\\\(______)(____) (__) \n" +
                "\n");
    }

    public String getUsername() {
        return username;
    }

    String username;

    public int getMeters() {
        return meters;
    }

    public int getCoins() {
        return coins;
    }
    public boolean isSelected(int i) {return this.choice == i;}
    public String getEntry(int i) {return this.entries.get(i);}

}
