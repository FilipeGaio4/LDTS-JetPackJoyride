package jetpack.Controller.Game;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.Game.background.Background;
import jetpack.Model.Game.elements.Lazer;
import jetpack.Model.GameOver.GameOver;
import jetpack.Model.Position;
import jetpack.States.GameOverState;

import java.io.*;
import java.util.Iterator;

public class LazerController extends GameController {

    public LazerController(Background model) {
        super(model);
    }

    @Override
    public void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException {
        if (!getModel().getActiveLazers().isEmpty()) {
            Iterator<Lazer> iterator = getModel().getActiveLazers().iterator();
            while (iterator.hasNext()){
                Lazer l = iterator.next();
                if (l.getEnd().getX() < -2) {
                    iterator.remove();
                    //System.out.println("deleted Lazer");
                }
            }
        }
        for (Lazer o : getModel().getActiveLazers()) {
            move(o);
            if(collidesWithPlayer(o)) {
                playSound();
                insertIntoCSV(getModel().getUsername(), meters); //+ coins * 10
                app.setState(new GameOverState(new GameOver(getModel().getUsername(), meters, getModel().getCollectedCoins())));
            }
        }
    }

    private void playSound() {
        String soundFilePath = "resources/dead.mp3"; // Replace with your MP3 file path
        try {
            FileInputStream fileInputStream = new FileInputStream(soundFilePath);
            Player player = new Player(fileInputStream);

            Thread playerThread = new Thread(() -> {
                try {
                    player.play();
                    player.close();
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            });

            // Start the player thread
            playerThread.start();

        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }
    }

    private void insertIntoCSV(String userReceived, int scoreReceived){
        int score = scoreReceived / 20 + getModel().getCollectedCoins() * 10;
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/highscores.csv"))) {
            try (FileWriter writer = new FileWriter("resources/highscores.csv", true)) {
                // Append a new line with values
                String values = userReceived + "," + String.valueOf(score);
                writer.append(values);
                writer.append("\n");
                //System.out.println("Value added to CSV file.");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
//        File tempFile = new File("resources/temp.csv");
//        try (BufferedReader in = new BufferedReader(new FileReader("resources/highscores.csv"));
//             PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("resources/temp.csv")))) {
//                int count = 0;
//                for (String s; (s = in.readLine()) != null; ) {
//                    String[] parts = s.split(",");
//                    if(count != 0)
//                    {
//                        String user = parts[0];
//                        int score = Integer.parseInt(parts[1]);
//                        if (count >= 10) {
//                            break;
//                        }
//                        if (scoreReceived > score) {
//                            out.println(userReceived + "," + scoreReceived);
//                        } else {
//                            out.println(user + "," + score);
//                        }
//                    }
//                    else{
//                        out.println(parts[0] + "," + parts[1]);
//                    }
//                    count++;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        boolean deleted = new java.io.File("resources/highscores.csv").delete();
//        if (!deleted) {
//            System.err.println("Failed to delete the file.");
//        }
//        boolean renamed = new java.io.File("resources/temp.csv").renameTo(new java.io.File("resources/highscores.csv"));
//        if (!renamed) {
//            System.err.println("Failed to rename the file.");
//        }

    }

    //Fazer o lazer movimentar-se
    private boolean move(Lazer lazer){
        lazer.setPosition(new Position(lazer.getX()-1, lazer.getY()));
        lazer.setEnd(new Position(lazer.getEnd().getX()-1, lazer.getEnd().getY()));
        return collidesWithPlayer(lazer);
    }

    private boolean collidesWithPlayer(Lazer lazer){
        int high = getModel().getPlayer().getY();
        if (lazer.getX() > 10)return false;
        if (lazer.getEnd().getX() < 10)return false;
        if (lazer.getType() == 0){ //Vertical
            if (lazer.getX() > 10 - lazer.getTolerance() && lazer.getX() < 10 + lazer.getTolerance()){
                if (high < lazer.getEnd().getY() + lazer.getTolerance() && high > lazer.getY() - lazer.getTolerance()){
                    return true;
                }
            }
            return false;
        }
        else if (lazer.getType() == 1){ //y = x
            if (high < lazer.getY() + lazer.getTolerance() && high > lazer.getEnd().getY() - lazer.getTolerance()){
                if (high <= lazer.getY() + lazer.getX() - 10 + lazer.getTolerance() && high >= lazer.getY() + lazer.getX() - 10 - lazer.getTolerance()){ //TOLERANCIA DE 3 ADICIONADA
                    return true;
                }
            }
            return false;
        }
        else if (lazer.getType() == 2){//y = -x
            if (high > lazer.getY() - lazer.getTolerance() && high < lazer.getEnd().getY() + lazer.getTolerance()){
                if (high <= lazer.getY() - lazer.getX() + 10 + lazer.getTolerance() && high >= lazer.getY() - lazer.getX() + 10 - lazer.getTolerance()){ //TOLERANCIA DE 3 ADICIONADA
                    return true;
                }
            }
            return false;
        }
        else{
            if (high > lazer.getY() - lazer.getTolerance() && high < lazer.getY() + lazer.getTolerance()){
                return true;
            }
        }
        return false;
    }
}
