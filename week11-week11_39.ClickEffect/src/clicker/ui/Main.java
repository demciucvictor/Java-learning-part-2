package clicker.ui;

import javax.swing.SwingUtilities;
import clicker.applicationlogic.PersonalCalculator;

public class Main {

    public static void main(String[] args) {
        PersonalCalculator pc=new PersonalCalculator();
        UserInterface ui = new UserInterface(pc);
        SwingUtilities.invokeLater(ui);
    }
}
