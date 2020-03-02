package tmproject;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("TIMER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel Buttons = new Panel();
        frame.add(Buttons);
        frame.pack();
        frame.setVisible(true);
    }
}
