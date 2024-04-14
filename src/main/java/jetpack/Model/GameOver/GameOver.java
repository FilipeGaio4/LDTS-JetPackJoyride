package jetpack.Model.GameOver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameOver {


    //Username
    public String getUsername() {
        return username;
    }
    private String username;


    //Meters travelled
    public String getMetersString() {
        return metersString;
    }
    private final String metersString = "\n" +
            "\n" +
            "   __  ___    __              _   \n" +
            "  /  |/  ___ / /____ _______ (_)  \n" +
            " / /|_/ / -_/ __/ -_/ __(_-<_     \n" +
            "/_/  /_/\\__/\\__/\\__/_/ /___(_)    \n" +
            "                                  \n" +
            "\n";
    public String getMeters_() {
        return meters_;
    }
    private String meters_;
    public List<String> getMetersToShow() {
        return metersToShow;
    }
    public void setMetersToShow(List<String> metersToShow) {
        this.metersToShow = metersToShow;
    }
    private List<String> metersToShow = new ArrayList<>();



    //Coins Collected
    public String getCoinsString() {
        return CoinsString;
    }
    public List<String> getCoinsCollectedToShow() {
        return coinsCollectedToShow;
    }

    public void setCoinsCollectedToShow(List<String> coinsCollectedToShow) {
        this.coinsCollectedToShow = coinsCollectedToShow;
    }

    private List<String> coinsCollectedToShow = new ArrayList<>();

    private final String CoinsString = "\n" +
            "\n" +
            "  _____     _            _____     ____        __         ___   \n" +
            " / ______  (____  ___   / ______  / / ___ ____/ /____ ___/ (_)  \n" +
            "/ /__/ _ \\/ / _ \\(_-<  / /__/ _ \\/ / / -_/ __/ __/ -_/ _  _     \n" +
            "\\___/\\___/_/_//_/___/  \\___/\\___/_/_/\\__/\\__/\\__/\\__/\\_,_(_)    \n" +
            "                                                                \n" +
            "\n";


    public String getCollectedCoins() {
        return collectedCoins;
    }

    private String collectedCoins;

    //GameOver title
    public String getGameOver() {
        return gameOver;
    }
    private String gameOver = "      ::::::::      :::       :::   :::   ::::::::::             ::::::::  :::     ::: :::::::::: ::::::::: \n" +
            "    :+:    :+:   :+: :+:    :+:+: :+:+:  :+:                   :+:    :+: :+:     :+: :+:        :+:    :+: \n" +
            "   +:+         +:+   +:+  +:+ +:+:+ +:+ +:+                   +:+    +:+ +:+     +:+ +:+        +:+    +:+  \n" +
            "  :#:        +#++:++#++: +#+  +:+  +#+ +#++:++#              +#+    +:+ +#+     +:+ +#++:++#   +#++:++#:    \n" +
            " +#+   +#+# +#+     +#+ +#+       +#+ +#+                   +#+    +#+  +#+   +#+  +#+        +#+    +#+    \n" +
            "#+#    #+# #+#     #+# #+#       #+# #+#                   #+#    #+#   #+#+#+#   #+#        #+#    #+#     \n" +
            "########  ###     ### ###       ### ##########             ########      ###     ########## ###    ###      \n" +
            "\n";

    //Entries on the Menu

    public List<String> getEntries() {
        return entries;
    }

    private List<String> entries;


    //Total score
    public String getTotalString() {
        return totalString;
    }
    public List<String> getTotalToShow() {
        return totalToShow;
    }

    public void setTotalToShow(List<String> totalToShow) {
        this.totalToShow = totalToShow;
    }

    private List<String> totalToShow = new ArrayList<>();
    private final String totalString = "\n" +
            "\n" +
            " ______    __       ___   \n" +
            "/_  _____ / /____ _/ (_)  \n" +
            " / / / _ / __/ _ `/ _     \n" +
            "/_/  \\___\\__/\\_,_/_(_)    \n" +
            "                          \n" +
            "\n";

    public String getTotal() {
        return total;
    }

    private String total;


    private int choice;

    public List<String> getDigits() {
        return digits;
    }

    private List<String> digits;

    public GameOver(String username, int meters, int collectedCoins){
        this.username = username;
        this.entries = Arrays.asList(" ____  ____  ___  ____   __    ____  ____ \n" +
                "(  _ \\( ___)/ __)(_  _) /__\\  (  _ \\(_  _)\n" +
                " )   / )__) \\__ \\  )(  /(__)\\  )   /  )(  \n" +
                "(_)\\_)(____)(___/ (__)(__)(__)(_)\\_) (__) \n" +
                "\n", " _____  __  __  ____  ____ \n" +
                "(  _  )(  )(  )(_  _)(_  _)\n" +
                " )(_)(  )(__)(  _)(_   )(  \n" +
                "(___/\\\\(______)(____) (__) \n" +
                "\n");
        this.choice = 0;
        this.collectedCoins = ("" + collectedCoins);
        this.meters_ = ("" + (meters / 20));
        this.total = ("" + (meters / 20 + 10 * collectedCoins));
        this.digits = Arrays.asList("\n" +
                "\n" +
                "  ___\n" +
                " <  /\n" +
                " / / \n" +
                "/_/  \n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "   ___ \n" +
                "  /_  /\n" +
                " / __/ \n" +
                "/____/ \n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "   ____\n" +
                "  /_  /\n" +
                " _/_ < \n" +
                "/____/ \n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "  ____\n" +
                " / / /\n" +
                "/_  _/\n" +
                " /_/  \n" +
                "      \n" +
                "\n", "\n" +
                "\n" +
                "   ____\n" +
                "  / __/\n" +
                " /__ \\ \n" +
                "/____/ \n" +
                "       \n" +
                "\n", "\n" +
                "\n" +
                "  ____\n" +
                " / __/\n" +
                "/ _ \\ \n" +
                "\\___/ \n" +
                "      \n" +
                "\n", "\n" +
                "\n" +
                " ____\n" +
                "/_  /\n" +
                " / / \n" +
                "/_/  \n" +
                "     \n" +
                "\n", "\n" +
                "\n" +
                "  ___ \n" +
                " ( _ )\n" +
                "/ _  |\n" +
                "\\___/ \n" +
                "      \n" +
                "\n", "\n" +
                "\n" +
                "  ___ \n" +
                " / _ \\\n" +
                " \\_, /\n" +
                "/___/ \n" +
                "      \n" +
                "\n", "\n" +
                "\n" +
                "  ___ \n" +
                " / _ \\\n" +
                "/ // /\n" +
                "\\___/ \n" +
                "      \n" +
                "\n");
    }

    public void nextChoice() {
        if(choice == 0)
            choice = 1;
        else if(choice == 1)
            choice = 0;
    }

    public void previousChoice() {
        if(choice == 0)
            choice = 1;
        else if(choice == 1)
            choice = 0;
    }

    public String getEntry(int i) {
        return entries.get(i);
    }

    public boolean isSelected(int i) {
        return choice == i;
    }

    public int getNumberEntries() {
        return this.entries.size();
    }
    public int getChoice() {
        return choice;
    }



}
