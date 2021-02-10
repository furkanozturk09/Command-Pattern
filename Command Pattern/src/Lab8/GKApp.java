package Lab8;

import java.util.Arrays;
import java.util.List;


/*
* Gaming Keyboard Macros
*
* In this example you are expected to employ the Command Pattern. Example based on a real world example where
* gaming keyboards to have macro keys which executes multiple key commands in a pre-programmed order.
*
* You are given:
* - Command interface
* - Pushable interface
* - GKApp class
*
* You should not modify Command and Pushable interfaces. Additionally you are expected to add a macro for a frequently
* you use daily to GKApp class(keep the existing content, add your own macro below it...).
*
* For this reason you are expected to implement:
*
* - Pushable interface for each Key. (If your macro includes mouse buttons you may just consider them as Keys)
* - KeyUp and KeyDown commands for a given Key.
* - A NoCommand class (which does nothing) for empty slots.
* - Delay command which apply to a TimeDelayMillSeconds
* - Macro class which is also a command that takes a list of commands and execute them in order.
* - GamingKeyboard class. Can have as many slots as you like but it is generally limited to 5 or 10.
*   - Macro slots are initially empty.
*   - There should be a assignMacro method for assigning given Command to the slot which index has given.
*   - There should be a pressMacroKey method for executing a command stored in the macro key with given index.
*   - toString method should print out all the macros stored in the macro key slots.
*
*
* */
public class GKApp {

    public static void main(String[] args) {

        GamingKeyboard logiKeyboard = new GamingKeyboard();

        Key eKey = new Key("E");
        Key sKey = new Key("S");
        Key rightMouseButton = new Key("Right Click");
        Key shiftKey = new Key("Shift");

        TimeMilliSeconds fiftyMSec = new TimeMilliSeconds(50);
        Delay delayFiftySec = new Delay(fiftyMSec);

        KeyDown keyDownEKey = new KeyDown(eKey);
        KeyUp keyUpEKey = new KeyUp(eKey);

        KeyDown keyDownRightClick = new KeyDown(rightMouseButton);
        KeyUp keyUpRightClick = new KeyUp(rightMouseButton);

        KeyDown keyDownSKey = new KeyDown(sKey);
        KeyDown keyDownShiftKey = new KeyDown(shiftKey);
        KeyUp keyUpShiftKey = new KeyUp(shiftKey);
        KeyUp keyUpSKey = new KeyUp(sKey);

        List commandSequence = Arrays.asList(
                keyDownEKey,
                keyUpEKey,
                delayFiftySec,
                keyDownRightClick,
                keyUpRightClick,
                delayFiftySec,
                delayFiftySec,
                keyDownSKey,
                keyDownShiftKey,
                keyUpShiftKey,
                keyUpSKey
        );

        Macro mcreeEscape = new Macro(commandSequence);

        logiKeyboard.assignMacro(0, mcreeEscape);

        logiKeyboard.pressMacroKey(0);

    }

}
