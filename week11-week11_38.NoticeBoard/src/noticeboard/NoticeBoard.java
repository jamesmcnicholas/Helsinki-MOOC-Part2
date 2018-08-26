package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();

        GridLayout gridLayout = new GridLayout(3,1);
        frame.setLayout(gridLayout);

        frame.setPreferredSize(new Dimension(600,200));

        createComponents(frame);

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {

        JTextField jtf = new JTextField();
        JButton button = new JButton("Copy!");
        JLabel label = new JLabel();

        ActionEventListener actionEventListener = new ActionEventListener(jtf,label);
        button.addActionListener(actionEventListener);

        container.add(jtf);
        container.add(button);
        container.add(label);


    }
}
