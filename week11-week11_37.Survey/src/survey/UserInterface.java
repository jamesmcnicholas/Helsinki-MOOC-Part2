package survey;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();

        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }


    public JFrame getFrame() {
        return frame;
    }

    public void createComponents(Container container){
        BoxLayout boxLayout = new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(boxLayout);

        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        container.add(new JLabel("Why?"));

        ButtonGroup bg = new ButtonGroup();

        JRadioButton nr = new JRadioButton("No reason.");
        JRadioButton bf = new JRadioButton("Because it is fun!");
        bg.add(nr);
        bg.add(bf);

        container.add(nr);
        container.add(bf);

        container.add(new JButton("Done!"));

    }
}
