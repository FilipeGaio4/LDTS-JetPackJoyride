package jetpack.Controller;

import jetpack.Controller.EnterUsername.EnterUsernameController;
import jetpack.GUI.GUI;
import jetpack.GUI.LanternaGUI;
import jetpack.JetpackJoyride;
import jetpack.Model.EnterUsername.EnterUsername;
import jetpack.States.GameState;
import jetpack.States.MenuState;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnterUsernameControllerTest {
    private static class TestEnterUsernameController extends EnterUsernameController{
        public TestEnterUsernameController(EnterUsername model) {
            super(model);
        }

        @Override
        public void step(JetpackJoyride app, GUI.ACTION action, int meters) throws IOException {
            super.step(app, action, meters);
        }

        @Override
        protected void handleAlphabet(int index) {
            super.handleAlphabet(index);
        }

        @Override
        protected void handleUsername(char char_) {
            super.handleUsername(char_);
        }

        @Override
        protected String listToString(List<Character> charList) {
            return super.listToString(charList);
        }
    }
//    @Property
//    public void step(@ForAll GUI.ACTION action) throws IOException, URISyntaxException, FontFormatException {
//        EnterUsername model = new EnterUsername();
//        EnterUsernameController controller = new EnterUsernameController(model);
//        JetpackJoyride app = Mockito.mock(JetpackJoyride.class);
//        TestEnterUsernameController stub = Mockito.mock(TestEnterUsernameController.class);
//        List<Character> chars = Arrays.asList('u', 's', 'e', 'r', 'n', 'a', 'm', 'e');
//        model.setInsertedUsername(chars);
//        int meters = 100;
//        stub.step(app, action, meters);
//        switch (action) {
//            case a:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(0);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('a');
//                }
//                break;
//            case A:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(26);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('A');
//                }
//                break;
//            case b:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(1);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('b');
//                }
//                break;
//            case B:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(27);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('B');
//                }
//                break;
//            case c:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(2);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('c');
//                }
//                break;
//            case C:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(28);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('C');
//                }
//                break;
//            case d:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(3);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('d');
//                }
//                break;
//            case D:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(29);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('D');
//                }
//                break;
//            case e:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(4);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('e');
//                }
//                break;
//            case E:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(30);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('E');
//                }
//                break;
//            case f:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(5);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('f');
//                }
//                break;
//            case F:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(31);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('F');
//                }
//                break;
//            case g:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(6);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('g');
//                }
//                break;
//            case G:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(32);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('G');
//                }
//                break;
//            case h:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(7);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('h');
//                }
//                break;
//            case H:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(33);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('H');
//                }
//                break;
//            case i:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(8);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('i');
//                }
//                break;
//            case I:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(34);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('I');
//                }
//                break;
//            case j:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(9);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('j');
//                }
//                break;
//            case J:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(35);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('J');
//                }
//                break;
//            case k:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(10);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('k');
//                }
//                break;
//            case K:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(36);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('K');
//                }
//                break;
//            case l:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(11);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('l');
//                }
//                break;
//            case L:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(37);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('L');
//                }
//                break;
//            case m:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(12);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('m');
//                }
//                break;
//            case M:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(38);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('M');
//                }
//                break;
//            case n:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(13);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('n');
//                }
//                break;
//            case N:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(39);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('N');
//                }
//                break;
//            case o:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(14);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('o');
//                }
//                break;
//            case O:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(40);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('O');
//                }
//                break;
//            case p:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(15);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('p');
//                }
//                break;
//            case P:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(41);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('P');
//                }
//                break;
//            case q:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(16);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('q');
//                }
//                break;
//            case Q:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(42);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('Q');
//                }
//                break;
//            case r:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(17);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('r');
//                }
//                break;
//            case R:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(43);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('R');
//                }
//                break;
//            case s:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(18);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('s');
//                }
//                break;
//            case S:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(44);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('S');
//                }
//                break;
//            case t:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(19);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('t');
//                }
//                break;
//            case T:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(45);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('T');
//                }
//                break;
//            case u:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(20);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('u');
//                }
//                break;
//            case U:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(46);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('U');
//                }
//                break;
//            case v:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(21);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('v');
//                }
//                break;
//            case V:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(47);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('V');
//                }
//                break;
//            case w:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(22);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('w');
//                }
//                break;
//            case W:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(48);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('W');
//                }
//                break;
//            case x:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(23);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('x');
//                }
//                break;
//            case X:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(49);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('X');
//                }
//                break;
//            case y:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(24);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('y');
//                }
//                break;
//            case Y:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(50);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('Y');
//                }
//                break;
//            case z:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(25);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('z');
//                }
//                break;
//            case Z:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(51);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('Z');
//                }
//                break;
//            case ONE:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(53);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('1');
//                }
//                break;
//            case TWO:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(54);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('2');
//                }
//                break;
//            case THREE:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(55);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('3');
//                }
//                break;
//            case FOUR:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(56);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('4');
//                }
//                break;
//            case FIVE:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(57);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('5');
//                }
//                break;
//            case SIX:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(58);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('6');
//                }
//                break;
//            case SEVEN:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(59);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('7');
//                }
//                break;
//            case EIGHT:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(60);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('8');
//                }
//                break;
//            case NINE:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(61);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('9');
//                }
//                break;
//            case ZERO:
//                if(model.getInsertedUsername().size() <= 18)
//                {
//                    Mockito.verify(stub, Mockito.times(1)).handleAlphabet(62);
//                    Mockito.verify(stub, Mockito.times(1)).handleUsername('0');
//                }
//                break;
//            default:
//                break;
//        }
//    }

}
