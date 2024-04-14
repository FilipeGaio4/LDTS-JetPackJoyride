package jetpack.Model.Menu;

import java.util.Arrays;
import java.util.List;

public class Menu {
    private int choice;
    private final List<String> entries;
    public Menu() {
        choice = -1;
        this.entries = Arrays.asList(" ___  ____   __    ____  ____     ___    __    __  __  ____ \n" +
                "/ __)(_  _) /__\\  (  _ \\(_  _)   / __)  /__\\  (  \\/  )( ___)\n" +
                "\\__ \\  )(  /(__)\\  )   /  )(    ( (_-. /(__)\\  )    (  )__) \n" +
                "(___/ (__)(__)(__)(_)\\_) (__)    \\___/(__)(__)(_/\\/\\_)(____)\n" +
                "\n", "\n" +
                " ____  _  _  ___  ____  ____  __  __  ___  ____  ____  _____  _  _  ___ \n" +
                "(_  _)( \\( )/ __)(_  _)(  _ \\(  )(  )/ __)(_  _)(_  _)(  _  )( \\( )/ __)\n" +
                " _)(_  )  ( \\__ \\  )(   )   / )(__)(( (__   )(   _)(_  )(_)(  )  ( \\__ \\\n" +
                "(____)(_)\\_)(___/ (__) (_)\\_)(______)\\___) (__) (____)(_____)(_)\\_)(___/\n", "\n" +
                "\n" +
                " _   _  ____  ___  _   _  ___   ___  _____  ____  ____ \n" +
                "( )_( )(_  _)/ __)( )_( )/ __) / __)(  _  )(  _ \\( ___)\n" +
                " ) _ (  _)(_( (_-. ) _ ( \\__ \\( (__  )(_)(  )   / )__) \n" +
                "(_) (_)(____)\\___/(_) (_)(___/ \\___)(_____)(_)\\_)(____)\n" +
                "\n");
    }

    private String jetpackJoyride= "::::::::::: :::::::::: ::::::::::: :::::::::     :::      ::::::::  :::    :::      :::::::::: :::::::::: :::    ::: :::::::::  :::::::::  ::::::::::: :::::::::  :::::::::: \n" +
            "    :+:     :+:            :+:     :+:    :+:  :+: :+:   :+:    :+: :+:   :+:       :+:        :+:        :+:    :+: :+:    :+: :+:    :+:     :+:     :+:    :+: :+:        \n" +
            "    +:+     +:+            +:+     +:+    +:+ +:+   +:+  +:+        +:+  +:+        +:+        +:+        +:+    +:+ +:+    +:+ +:+    +:+     +:+     +:+    +:+ +:+        \n" +
            "    +#+     +#++:++#       +#+     +#++:++#+ +#++:++#++: +#+        +#++:++         :#::+::#   +#++:++#   +#+    +:+ +#++:++#+  +#++:++#:      +#+     +#+    +:+ +#++:++#   \n" +
            "    +#+     +#+            +#+     +#+       +#+     +#+ +#+        +#+  +#+        +#+        +#+        +#+    +#+ +#+        +#+    +#+     +#+     +#+    +#+ +#+        \n" +
            "#+# #+#     #+#            #+#     #+#       #+#     #+# #+#    #+# #+#   #+#       #+#        #+#        #+#    #+# #+#        #+#    #+#     #+#     #+#    #+# #+#        \n" +
            " #####      ##########     ###     ###       ###     ###  ########  ###    ###      ###        ##########  ########  ###        ###    ### ########### #########  ########## \n" +
            "\n";
    public void nextChoice() {
        if(choice == -1)
            choice = 0;
        else if(choice == 0)
            choice = 1;
        else if(choice == 1)
            choice = 2;
        else if(choice == 2)
            choice = 0;
    }

    public void previousChoice() {
        if(choice == -1)
            choice = 0;
        else if(choice == 0)
            choice = 2;
        else if(choice == 1)
            choice = 0;
        else if(choice == 2)
            choice = 1;
    }

    public String getJetpackJoyride() {return jetpackJoyride;}
    public String getEntry(int i) {
        return entries.get(i);
    }

    public boolean isSelected(int i) {
        return choice == i;
    }

    public boolean isSelectedExit() {
        return isSelected(1);
    }

    public boolean isSelectedStart() {
        return isSelected(0);
    }

    public int getNumberEntries() {
        return this.entries.size();
    }
    public int getChoice() {
        return choice;
    }
}
