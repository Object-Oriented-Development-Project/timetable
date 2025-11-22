package one.group.controller;
import one.group.viewer.Menu;

/** The class for the controller segment of the programme. */
public class Run {
    /**
     * The main method for the controller.
     * @param args the command line arguments.
     * Uses the boolean value for 'go' sustain a while loop, the Classes single method returns false on user quit.
     */
    public static void main(String[] args){
        Menu menu = new Menu();

        boolean go = true;

        while(go){
            go = menu.runMenu();
        }
    }
}