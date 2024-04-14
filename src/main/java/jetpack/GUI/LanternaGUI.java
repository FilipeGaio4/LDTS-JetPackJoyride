package jetpack.GUI;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFontConfiguration;
import jetpack.Model.Position;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;


public class LanternaGUI implements GUI {
    public Screen getScreen() {return screen;}

    private Screen screen;
    private TextGraphics tg;

    public LanternaGUI(Screen screen) {
        this.screen = screen;
        this.tg = screen.newTextGraphics();
    }

    public LanternaGUI(int width, int height) throws IOException, FontFormatException, URISyntaxException {
        AWTTerminalFontConfiguration fontConfig = loadSquareFont();
        Terminal terminal = createTerminal(width, height, fontConfig);
        this.screen = createScreen(terminal);
        this.tg = screen.newTextGraphics();
    }

    private Screen createScreen(Terminal terminal) throws IOException {
        final Screen screen;
        screen = new TerminalScreen(terminal);

        screen.setCursorPosition(null);
        screen.startScreen();
        screen.doResizeIfNecessary();
        return screen;
    }

    private Terminal createTerminal(int width, int height, AWTTerminalFontConfiguration fontConfig) throws IOException {
        TerminalSize terminalSize = new TerminalSize(width, height + 1);
        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
        terminalFactory.setForceAWTOverSwing(true);
        terminalFactory.setTerminalEmulatorFontConfiguration(fontConfig);
        Terminal terminal = terminalFactory.createTerminal();
        return terminal;
    }

    private AWTTerminalFontConfiguration loadSquareFont() throws URISyntaxException, FontFormatException, IOException {
        /*
        URL resource = getClass().getClassLoader().getResource("square.ttf");
        File fontFile = new File(resource.toURI());
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);

        Font loadedFont = font.deriveFont(Font.PLAIN, 25);
        AWTTerminalFontConfiguration fontConfig = AWTTerminalFontConfiguration.newInstance(loadedFont);

         */
        URL resource = getClass().getClassLoader().getResource("square.ttf");
        File fontFile = new File(resource.toURI());
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);
        DefaultTerminalFactory factory = new DefaultTerminalFactory();
        Font loadedFont = font.deriveFont(Font.PLAIN, 8);
        AWTTerminalFontConfiguration fontConfig = AWTTerminalFontConfiguration.newInstance(loadedFont);
        factory.setTerminalEmulatorFontConfiguration(fontConfig);
        factory.setForceAWTOverSwing(true);
        return fontConfig;
    }

    public ACTION getNextAction() throws IOException {
        KeyStroke keyStroke = screen.pollInput();
        if (keyStroke == null) return ACTION.NONE;

        if (keyStroke.getKeyType() == KeyType.EOF) return ACTION.QUIT;
        if (keyStroke.getKeyType() == KeyType.Escape) return ACTION.QUIT;
        if (keyStroke.getKeyType() == KeyType.ArrowUp) return ACTION.UP;
        if (keyStroke.getKeyType() == KeyType.ArrowRight) return ACTION.RIGHT;
        if (keyStroke.getKeyType() == KeyType.ArrowDown) return ACTION.DOWN;
        if (keyStroke.getKeyType() == KeyType.ArrowLeft) return ACTION.LEFT;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == ' ') return ACTION.BOOST;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'a') return ACTION.a;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'A') return ACTION.A;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'b') return ACTION.b;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'B') return ACTION.B;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'c') return ACTION.c;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'C') return ACTION.C;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'd') return ACTION.d;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'D') return ACTION.D;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'e') return ACTION.e;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'E') return ACTION.E;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'f') return ACTION.f;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'F') return ACTION.F;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'g') return ACTION.g;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'G') return ACTION.G;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'h') return ACTION.h;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'H') return ACTION.H;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'i') return ACTION.i;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'I') return ACTION.I;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'j') return ACTION.j;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'J') return ACTION.J;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'k') return ACTION.k;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'K') return ACTION.K;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'l') return ACTION.l;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'L') return ACTION.L;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'm') return ACTION.m;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'M') return ACTION.M;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'n') return ACTION.n;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'N') return ACTION.N;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'o') return ACTION.o;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'O') return ACTION.O;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'p') return ACTION.p;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'P') return ACTION.P;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'q') return ACTION.q;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'Q') return ACTION.Q;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'r') return ACTION.r;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'R') return ACTION.R;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 's') return ACTION.s;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'S') return ACTION.S;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 't') return ACTION.t;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'T') return ACTION.T;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'u') return ACTION.u;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'U') return ACTION.U;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'v') return ACTION.v;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'V') return ACTION.V;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'w') return ACTION.w;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'W') return ACTION.W;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'x') return ACTION.x;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'X') return ACTION.X;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'y') return ACTION.y;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'Y') return ACTION.Y;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'z') return ACTION.z;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'Z') return ACTION.Z;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '_') return ACTION.UNDERSCORE;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '1') return ACTION.ONE;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '2') return ACTION.TWO;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '3') return ACTION.THREE;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '4') return ACTION.FOUR;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '5') return ACTION.FIVE;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '6') return ACTION.SIX;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '7') return ACTION.SEVEN;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '8') return ACTION.EIGHT;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '9') return ACTION.NINE;
        if(keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '0') return ACTION.ZERO;
        if(keyStroke.getKeyType() == KeyType.Backspace) return ACTION.DELETE;
        if (keyStroke.getKeyType() == KeyType.Enter) return ACTION.SELECT;
        //YOUR CODE GOES HERE

        KeyStroke atual = screen.pollInput();
        while (atual != null) atual = screen.pollInput();

        return ACTION.NONE;
    }

    @Override
    public void drawBackground(int meters) {
        tg.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        changeBackgroundColor(meters);
        tg.setBackgroundColor(TextColor.Factory.fromString("#ba8749"));
        tg.fillRectangle(new TerminalPosition(1, 100), new TerminalSize(198, 16), ' ');
        tg.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        tg.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(1, 117), ' ');
        tg.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(200, 1), ' ');
        tg.fillRectangle(new TerminalPosition(199, 0), new TerminalSize(1, 117), ' ');
        tg.fillRectangle(new TerminalPosition(0, 116), new TerminalSize(200, 1), ' ');
    }
    @Override
    public void changeBackgroundColor(int metros)
    {
        if (metros / 20 >= 300) {
            tg.setBackgroundColor(TextColor.Factory.fromString("#2b2b2b"));
        }
        else if (metros / 20 >= 200) {
            tg.setBackgroundColor(TextColor.Factory.fromString("#32a852"));
        }
        else if (metros / 20 >= 100) {
            tg.setBackgroundColor(TextColor.Factory.fromString("#a6373a"));
        }
        //a cada passagem o ecra começa a piscar
        if (metros % 2000 > 0 && metros % 2000 < 100 && metros > 500){
            tg.enableModifiers(SGR.BLINK);
            tg.fillRectangle(new TerminalPosition(1, 1), new TerminalSize(198, 115), '+');
            tg.disableModifiers();
        }
        else{
            tg.fillRectangle(new TerminalPosition(1, 1), new TerminalSize(198, 115), ' ');
        }
    }
    @Override
    public void linesdraw(int meters){
        //Desenha linhas pelo campo que dão a senação de movimento
        tg.setBackgroundColor(TextColor.Factory.fromString("#62a5d1"));
        int metros = meters % 50;
        //Inicialmente nao tem linhas
        if (meters < 200){
            for (int y = 1; y < 100; y++) {
                int lineLength = 1;
                int startX = 199 - lineLength - meters;
                tg.drawLine(startX, y, startX, y, ' ');
            }
            if (meters > 50){
                for (int y = 1; y < 100; y++) {
                    int lineLength = 1;
                    int startX = 199 - lineLength + 50 - meters;
                    tg.drawLine(startX, y, startX, y, ' ');
                }
            }
            if (meters > 100){
                for (int y = 1; y < 100; y++) {
                    int lineLength = 1;
                    int startX = 199 - lineLength + 100 - meters;
                    tg.drawLine(startX, y, startX, y, ' ');

                }
            }
            if (meters > 150){
                for (int y = 1; y < 100; y++) {
                    int lineLength = 1;
                    int startX = 199 - lineLength + 150 - meters;
                    tg.drawLine(startX, y, startX, y, ' ');
                }
            }
        }
        else{
            for (int y = 1; y < 100; y++) {
                int lineLength = 1;
                int startX = 199 - lineLength - metros;
                tg.drawLine(startX, y, startX, y, ' ');
            }
            for (int y = 1; y < 100; y++) {
                int lineLength = 1;
                int startX = 199 - lineLength - 50 - metros;
                tg.drawLine(startX, y, startX, y, ' ');
            }
            for (int y = 1; y < 100; y++) {
                int lineLength = 1;
                int startX = 199 - lineLength - 100 - metros;
                tg.drawLine(startX, y, startX, y, ' ');
            }
            for (int y = 1; y < 100; y++) {
                int lineLength = 1;
                int startX = 199 - lineLength - 150 - metros;
                tg.drawLine(startX, y, startX, y, ' ');
            }
        }
    }

    @Override
    public void drawPlayer(Position position, boolean boost, ArrayList<Position> body) {
        if (boost){
            for (int i = 1; i <= 5; i++) {
                int x = position.getX() - i-1; // Adjust X-coordinate based on boost trail length
                int y = position.getY()+3+i;
                if (x >= 0) { // Ensure the boost trail is within the screen boundaries
                    tg.setBackgroundColor(TextColor.Factory.fromString("#d96d25"));
                    tg.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
                    tg.putString(new TerminalPosition(x, y), "*");
                    tg.putString(new TerminalPosition(position.getX()-2, y), "*");
                }
            }
            tg.setForegroundColor(TextColor.Factory.fromString("#000000"));
        }
        tg.setBackgroundColor(TextColor.Factory.fromString("#fcd874"));
        tg.putString(new TerminalPosition(position.getX(), position.getY()), " ");
        tg.enableModifiers(SGR.BOLD);
        //DESENHAR O CORPO DO PLAYER
        for (int i = 0; i < body.size(); i++){
            Position p = body.get(i);
            //HEAD
            if (i < 5){
                tg.setBackgroundColor(TextColor.Factory.fromString("#fcd874"));
                tg.putString(new TerminalPosition(p.getX(), p.getY()), " ");
            }
            //BODY
            else if(i < 17){
                tg.setBackgroundColor(TextColor.Factory.fromString("#161729"));
                tg.setBackgroundColor(TextColor.Factory.fromString("#1d1e42"));
                tg.putString(new TerminalPosition(p.getX(), p.getY()), " ");
            }
            //JETPACK
            else{
                tg.setBackgroundColor(TextColor.Factory.fromString("#494a5e"));
                tg.putString(new TerminalPosition(p.getX(), p.getY()), " ");
            }
        }
        tg.clearModifiers();
    }

    @Override
    public void drawCoins(Position position) {
        for (int i = -2; i <= 2; i++){
            for (int j = -2; j <= 2; j++){
                if (i > -2 &&  i < 2 && j > -2 && j < 2){
                    tg.setBackgroundColor(TextColor.Factory.fromString("#a88132"));//MUDAR COR
                }
                else{
                    tg.setBackgroundColor(TextColor.Factory.fromString("#a89d32"));
                }
                tg.putString(new TerminalPosition(position.getX() + i, position.getY() + j), " ");
            }
        }
    }

    @Override
    public void drawLazer(Position position, Position end, int type) {
//        if (!activeLazers.isEmpty()) {
//            Iterator<Lazer> iterator = activeLazers.iterator();
//            while (iterator.hasNext()){
//                Lazer l = iterator.next();
//                l.draw(bg);
//                l.collidesWithPlayer(player); // we can use return to change players state
//                if (l.end.getX() < -5) {
//                    iterator.remove();
//                }
//            }
//        }
        if (type == 3){
            for (int i = -2; i <= 2; i++){
                if (i == 0){
                    tg.setBackgroundColor(TextColor.Factory.fromString("#a83232"));
                }
                else{
                    tg.setBackgroundColor(TextColor.Factory.fromString("#eb7e3b"));
                }
                //tg.putString(new TerminalPosition(30, 30), String.valueOf(end.getX()) + String.valueOf(position.getX()));
                tg.drawLine(position.getX(), position.getY() + i, end.getX(),end.getY() + i, ' ');
            }
        }
        else{
            for (int i = -2; i <= 2; i++){
                if (i == 0){
                    tg.setBackgroundColor(TextColor.Factory.fromString("#a83232"));
                }
                else{
                    tg.setBackgroundColor(TextColor.Factory.fromString("#eb7e3b"));
                }
                //tg.putString(new TerminalPosition(30, 30), String.valueOf(end.getX()) + String.valueOf(position.getX()));
                tg.drawLine(position.getX() + i, position.getY(), end.getX() + i,end.getY(), ' ');
            }
        }
//        if (!alive) {
//            if (type == 0)bg.setBackgroundColor(TextColor.Factory.fromString("#3b4ceb"));
//            if (type == 1)bg.setBackgroundColor(TextColor.Factory.fromString("#43eb3b"));
//            if (type == 2)bg.setBackgroundColor(TextColor.Factory.fromString("#123456"));
//            if (type == 3)bg.setBackgroundColor(TextColor.Factory.fromString("#ffa1a1"));
//            bg.putString(new TerminalPosition(30, 30), "Morreu para um lazer tipo : " + String.valueOf(type)); //Debug message
//        }


    }

    @Override
    public void drawText(Position position, String text, TextColor.ANSI Fcolor, TextColor.ANSI Bcolor){
        String lines[] = text.split("\n");
        tg.setBackgroundColor(Bcolor);
        tg.setForegroundColor(Fcolor);
        for(int i = 0; i < lines.length; i++) {tg.putString(new TerminalPosition(position.getX(),  position.getY() + i), lines[i]);}
    }

    @Override
    public void drawTextfromCSV(Position position, String file, TextColor.ANSI color) {
        int i = 10;
        tg.setForegroundColor(color);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) { //Talvez por por ordem do high score
                String[] values = line.split(",");
                if (values.length >= 2) {
                    String s = values[0].trim();
                    String s2 = values[1].trim();
                    tg.putString(new TerminalPosition(position.getX(), position.getY() + i), s + " -> " + s2);
                    i += 4;
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void drawNum(char num, int pos) {
        int startX = 190 - 8 * pos;
        int startY = 10;
        tg.setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
        switch (num) {
            case '0':
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY, startX, startY + 15, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 15, ' ');
                break;
            case '1':
                tg.drawLine(startX + 3, startY, startX + 3, startY + 15, ' ');
                break;
            case '2':
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 7, ' ');
                tg.drawLine(startX, startY + 7, startX, startY + 15, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                break;
            case '3':
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                break;
            case '4':
                tg.drawLine(startX, startY, startX, startY + 7, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                break;
            case '5':
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX, startY, startX, startY + 7, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                tg.drawLine(startX + 6, startY + 7, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                break;
            case '6':
                tg.drawLine(startX, startY, startX, startY + 15, ' ');
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                tg.drawLine(startX, startY + 7, startX, startY + 15, ' ');
                tg.drawLine(startX + 6, startY + 7, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                break;
            case '7':
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX + 6, startY, startX + 3, startY + 15, ' ');
                break;
            case '8':
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY, startX, startY + 15, ' ');tg.drawLine(startX + 6, startY, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                break;
            case '9':
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                tg.drawLine(startX, startY, startX, startY + 7, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 15, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 7, ' ');
                break;
            default:
                // Handle other characters if needed
                break;

        }
    }
    @Override
    public void drawNum(String num, Position pos) {
        int startX = pos.getX();
        int startY = pos.getY();
        tg.setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
        tg.setForegroundColor(TextColor.Factory.fromString("#000000"));
        switch (num) {
            case "0":
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY, startX, startY + 15, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 15, ' ');
                break;
            case "1":
                tg.drawLine(startX + 3, startY, startX + 3, startY + 15, ' ');
                break;
            case "2":
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 7, ' ');
                tg.drawLine(startX, startY + 7, startX, startY + 15, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                break;
            case "3":
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                break;
            case "4":
                tg.drawLine(startX, startY, startX, startY + 7, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                break;
            case "5":
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX, startY, startX, startY + 7, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                tg.drawLine(startX + 6, startY + 7, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                break;
            case "6":
                tg.drawLine(startX, startY, startX, startY + 15, ' ');
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                tg.drawLine(startX, startY + 7, startX, startY + 15, ' ');
                tg.drawLine(startX + 6, startY + 7, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                break;
            case "7":
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX + 6, startY, startX + 3, startY + 15, ' ');
                break;
            case "8":
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX, startY + 15, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY, startX, startY + 15, ' ');tg.drawLine(startX + 6, startY, startX + 6, startY + 15, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                break;
            case "9":
                tg.drawLine(startX, startY, startX + 6, startY, ' ');
                tg.drawLine(startX, startY + 7, startX + 6, startY + 7, ' ');
                tg.drawLine(startX, startY, startX, startY + 7, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 15, ' ');
                tg.drawLine(startX + 6, startY, startX + 6, startY + 7, ' ');
                break;
            default:
                // Handle other characters if needed
                break;

        }
    }

    @Override
    public void drawNumCoin(char num, int pos) {
        int startX = 174 - 6 * pos;
        int startY = 37;
        tg.setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
        switch (num) {
            case '0':
                tg.drawLine(startX + 1, startY, startX + 3, startY, ' ');
                tg.drawLine(startX + 1, startY + 6, startX + 3, startY + 6, ' ');
                tg.drawLine(startX + 1, startY, startX + 1, startY + 6, ' ');
                tg.drawLine(startX + 3, startY, startX + 3, startY + 6, ' ');
                break;
            case '1':
                tg.drawLine(startX + 2, startY, startX + 2, startY + 6, ' ');
                break;
            case '2':
                tg.drawLine(startX + 1, startY, startX + 3, startY, ' ');
                tg.drawLine(startX + 3, startY, startX + 3, startY + 3, ' ');
                tg.drawLine(startX + 1, startY + 3, startX + 1, startY + 6, ' ');
                tg.drawLine(startX + 1, startY + 6, startX + 3, startY + 6, ' ');
                tg.drawLine(startX + 1, startY + 3, startX + 3, startY + 3, ' ');
                break;
            case '3':
                tg.drawLine(startX + 1, startY, startX + 3, startY, ' ');
                tg.drawLine(startX + 3, startY, startX + 3, startY + 6, ' ');
                tg.drawLine(startX + 1, startY + 3, startX + 3, startY + 3, ' ');
                tg.drawLine(startX + 1, startY + 6, startX + 3, startY + 6, ' ');
                break;
            case '4':
                tg.drawLine(startX + 1, startY, startX + 1, startY + 3, ' ');
                tg.drawLine(startX + 3, startY, startX + 3, startY + 6, ' ');
                tg.drawLine(startX + 1, startY + 3, startX + 3, startY + 3, ' ');
                break;
            case '5':
                tg.drawLine(startX + 1, startY, startX + 3, startY, ' ');
                tg.drawLine(startX + 1, startY, startX + 1, startY + 3, ' ');
                tg.drawLine(startX + 1, startY + 3, startX + 3, startY + 3, ' ');
                tg.drawLine(startX + 3, startY + 3, startX + 3, startY + 6, ' ');
                tg.drawLine(startX + 1, startY + 6, startX + 3, startY + 6, ' ');
                break;
            case '6':
                tg.drawLine(startX + 1, startY, startX + 1, startY + 6, ' ');
                tg.drawLine(startX + 1, startY, startX + 3, startY, ' ');
                tg.drawLine(startX + 1, startY + 3, startX + 3, startY + 3, ' ');
                tg.drawLine(startX + 1, startY + 3, startX + 1, startY + 6, ' ');
                tg.drawLine(startX + 3, startY + 3, startX + 3, startY + 6, ' ');
                tg.drawLine(startX + 1, startY + 6, startX + 3, startY + 6, ' ');
                break;
            case '7':
                tg.drawLine(startX + 1, startY, startX + 3, startY, ' ');
                tg.drawLine(startX + 3, startY, startX + 2, startY + 6, ' ');
                break;
            case '8':
                tg.drawLine(startX + 1, startY, startX + 3, startY, ' ');
                tg.drawLine(startX + 1, startY + 6, startX + 3, startY + 6, ' ');
                tg.drawLine(startX + 1, startY, startX + 1, startY + 6, ' ');
                tg.drawLine(startX + 3, startY, startX + 3, startY + 6, ' ');
                tg.drawLine(startX + 1, startY + 3, startX + 3, startY + 3, ' ');
                break;
            case '9':
                tg.drawLine(startX + 1, startY, startX + 3, startY, ' ');
                tg.drawLine(startX + 1, startY + 3, startX + 3, startY + 3, ' ');
                tg.drawLine(startX + 1, startY, startX + 1, startY + 3, ' ');
                tg.drawLine(startX + 3, startY, startX + 3, startY + 6, ' ');
                tg.drawLine(startX + 3, startY, startX + 3, startY + 3, ' ');
                break;
            default:
                // Handle other characters if needed
                break;
        }
    }

    @Override
    public void drawBorders() {
        tg.setBackgroundColor(TextColor.ANSI.MAGENTA_BRIGHT);
        tg.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(1, 117), ' ');
        tg.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(200, 1), ' ');
        tg.fillRectangle(new TerminalPosition(199, 0), new TerminalSize(1, 117), ' ');
        tg.fillRectangle(new TerminalPosition(0, 116), new TerminalSize(200, 1), ' ');
    }

    @Override
    public void clear() {
        screen.clear();
    }

    @Override
    public void refresh() throws IOException {
        screen.refresh();
    }

    @Override
    public void close() throws IOException {
        screen.close();
    }
    @Override
    public void drawLine(Position p1, Position p2){
        tg.setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
        tg.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY(), ' ');
    }
}
