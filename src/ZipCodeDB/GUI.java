package ZipCodeDB;

import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CS219 Weather App");
        frame.add(new GUIPanel());
        frame.pack(); //makes JFrame the size of internal components
        frame.setVisible(true);
        // when user hits x on window bar, main program will quit
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
