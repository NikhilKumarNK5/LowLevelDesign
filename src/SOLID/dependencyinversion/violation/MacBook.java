package SOLID.dependencyinversion.violation;

import SOLID.dependencyinversion.utility.Keyboard;
import SOLID.dependencyinversion.utility.Mouse;
import SOLID.dependencyinversion.utility.WiredKeyboard;
import SOLID.dependencyinversion.utility.WiredMouse;

// VIOLATION OF DIP
// High-level module directly depending on low-level module
public class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    // Direct dependency on concrete class
    public MacBook(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) {
        keyboard = wiredKeyboard; // Tight coupling
        mouse = wiredMouse; // Tight coupling
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}