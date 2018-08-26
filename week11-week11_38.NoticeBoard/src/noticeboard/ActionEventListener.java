package noticeboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventListener implements ActionListener {

    private JTextField source;
    private JLabel destination;

    public ActionEventListener(JTextField source, JLabel destination) {
        this.source = source;
        this.destination = destination;


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        destination.setText(source.getText());
        source.setText("");
    }
}
