package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        GridLayout gridLayout = new GridLayout(2,1);
        frame.setLayout(gridLayout);

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {

        JLabel jLabel = new JLabel("0");
        JButton button = new JButton("Click!");

        button.addActionListener(new ClickListener(new PersonalCalculator(),jLabel));

        container.add(jLabel);
        container.add(button);

    }

    public JFrame getFrame() {
        return frame;
    }
}
