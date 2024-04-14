package jetpack.Controller.EnterUsername;

import jetpack.Controller.Controller;
import jetpack.GUI.GUI;
import jetpack.JetpackJoyride;
import jetpack.Model.EnterUsername.EnterUsername;
import jetpack.Model.Game.background.BackgroundBuilder;
import jetpack.Model.Menu.Menu;
import jetpack.States.GameState;
import jetpack.States.MenuState;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EnterUsernameController extends Controller<EnterUsername> {
    public EnterUsernameController(EnterUsername model) {
        super(model);
    }

    @Override
    public void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException {
        switch (action) {
            case QUIT:
                app.setState(new MenuState(new Menu()));
                break;
            case a:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(0);
                    handleUsername('a');
                }
                break;
            case A:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(26);
                    handleUsername('A');
                }
                break;
            case b:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(1);
                    handleUsername('b');
                }
                break;
            case B:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(27);
                    handleUsername('B');
                }
                break;
            case c:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(2);
                    handleUsername('c');
                }
                break;
            case C:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(28);
                    handleUsername('C');
                }
                break;
            case d:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(3);
                    handleUsername('d');
                }
                break;
            case D:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(29);
                    handleUsername('D');
                }
                break;
            case e:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(4);
                    handleUsername('e');
                }
                break;
            case E:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(30);
                    handleUsername('E');
                }
                break;
            case f:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(5);
                    handleUsername('f');
                }
                break;
            case F:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(31);
                    handleUsername('F');
                }
                break;
            case g:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(6);
                    handleUsername('g');
                }
                break;
            case G:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(32);
                    handleUsername('G');
                }
                break;
            case h:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(7);
                    handleUsername('h');
                }
                break;
            case H:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(33);
                    handleUsername('H');
                }
                break;
            case i:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(8);
                    handleUsername('i');
                }
                break;
            case I:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(34);
                    handleUsername('I');
                }
                break;
            case j:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(9);
                    handleUsername('j');
                }
                break;
            case J:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(35);
                    handleUsername('J');
                }
                break;
            case k:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(10);
                    handleUsername('k');
                }
                break;
            case K:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(36);
                    handleUsername('K');
                }
                break;
            case l:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(11);
                    handleUsername('l');
                }
                break;
            case L:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(37);
                    handleUsername('L');
                }
                break;
            case m:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(12);
                    handleUsername('m');
                }
                break;
            case M:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(38);
                    handleUsername('M');
                }
                break;
            case n:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(13);
                    handleUsername('n');
                }
                break;
            case N:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(39);
                    handleUsername('N');
                }
                break;
            case o:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(14);
                    handleUsername('o');
                }
                break;
            case O:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(40);
                    handleUsername('O');
                }
                break;
            case p:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(15);
                    handleUsername('p');
                }
                break;
            case P:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(41);
                    handleUsername('P');
                }
                break;
            case q:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(16);
                    handleUsername('q');
                }
                break;
            case Q:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(42);
                    handleUsername('Q');
                }
                break;
            case r:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(17);
                    handleUsername('r');
                }
                break;
            case R:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(43);
                    handleUsername('R');
                }
                break;
            case s:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(18);
                    handleUsername('s');
                }
                break;
            case S:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(44);
                    handleUsername('S');
                }
                break;
            case t:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(19);
                    handleUsername('t');
                }
                break;
            case T:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(45);
                    handleUsername('T');
                }
                break;
            case u:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(20);
                    handleUsername('u');
                }
                break;
            case U:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(46);
                    handleUsername('U');
                }
                break;
            case v:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(21);
                    handleUsername('v');
                }
                break;
            case V:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(47);
                    handleUsername('V');
                }
                break;
            case w:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(22);
                    handleUsername('w');
                }
                break;
            case W:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(48);
                    handleUsername('W');
                }
                break;
            case x:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(23);
                    handleUsername('x');
                }
                break;
            case X:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(49);
                    handleUsername('X');
                }
                break;
            case y:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(24);
                    handleUsername('y');
                }
                break;
            case Y:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(50);
                    handleUsername('Y');
                }
                break;
            case z:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(25);
                    handleUsername('z');
                }
                break;
            case Z:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(51);
                    handleUsername('Z');
                }
                break;
            case UNDERSCORE:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(52);
                    handleUsername('_');
                }
                break;
            case ONE:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(53);
                    handleUsername('1');
                }
                break;
            case TWO:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(54);
                    handleUsername('2');
                }
                break;
            case THREE:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(55);
                    handleUsername('3');
                }
                break;
            case FOUR:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(56);
                    handleUsername('4');
                }
                break;
            case FIVE:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(57);
                    handleUsername('5');
                }
                break;
            case SIX:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(58);
                    handleUsername('6');
                }
                break;
            case SEVEN:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(59);
                    handleUsername('7');
                }
                break;
            case EIGHT:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(60);
                    handleUsername('8');
                }
                break;
            case NINE:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(61);
                    handleUsername('9');
                }
                break;
            case ZERO:
                if(getModel().getInsertedUsername().size() <= 18)
                {
                    handleAlphabet(62);
                    handleUsername('0');
                }
                break;
            case DELETE:
                if(!getModel().getInsertIntoScreen().isEmpty())
                {
                    List<String> insertIntoScreenTemp = new ArrayList<>(getModel().getInsertIntoScreen());
                    insertIntoScreenTemp.remove(getModel().getInsertIntoScreen().size() - 1);
                    getModel().setInsertIntoScreen(insertIntoScreenTemp);

                    List<Character> insertedUsernameTemp = new ArrayList<>(getModel().getInsertedUsername());
                    insertedUsernameTemp.remove(insertedUsernameTemp.size()-1);
                    getModel().setInsertedUsername(insertedUsernameTemp);
                }
                break;
            case SELECT:
                String username = listToString(getModel().getInsertedUsername());
                if(!getModel().getInsertedUsername().isEmpty()) app.setState(new GameState(new BackgroundBuilder().createBackground(username)));
        }
    }

    protected String listToString(List<Character> charList) {
        StringBuilder sb = new StringBuilder(charList.size());
        for (Character character : charList) {
            sb.append(character);
        }
        return sb.toString();
    }

    protected void handleUsername(char char_){
        List<Character> insertedUsernameTemp = new ArrayList<>(getModel().getInsertedUsername());
        insertedUsernameTemp.add(char_);
        getModel().setInsertedUsername(insertedUsernameTemp);
    }
    protected void handleAlphabet(int index) {
        String char_ = getModel().getAlphabet().get(index);
        List<String> insertIntoScreenTemp = new ArrayList<>(getModel().getInsertIntoScreen());
        insertIntoScreenTemp.add(char_);
        getModel().setInsertIntoScreen(insertIntoScreenTemp);
    }
}
