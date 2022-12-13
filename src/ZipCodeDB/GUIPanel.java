package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPanel extends JPanel { //JPanel is the base class. GUIPanel is the derived class
    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;

    private JButton northernmost;

    private Database db;     // the zipcode database

    public GUIPanel(){
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);

        this.submit = new JButton("submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());

        this.output = new JTextArea(5,20);
        this.add(this.output);

        this.db = new Database(); // load zipcodes

        this.northernmost = new JButton("Northernmost Zipcode");
        this.add(this.northernmost);
    }

    class SubmitButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // function will get called when user presses submit

            // get the zipcode out of the text field
            String code = zipcode.getText();
            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
        }

    }

}
