package ui;

import logic.Calculator;

import java.awt.*;

import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    private Calculator calculator;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setPreferredSize(new Dimension(300,150));
        calculator = new Calculator();

        GridLayout gridLayout = new GridLayout(3,1);
        frame.setLayout(gridLayout);

        createComponents(frame);
        frame.pack();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

    private void createComponents(Container container) {

        JTextField outputJTextField = new JTextField("0");
        outputJTextField.setEnabled(false);

        JTextField inputJtextField = new JTextField("");


        container.add(outputJTextField);
        container.add(inputJtextField);
        container.add(createPanel(inputJtextField,outputJTextField));
    }

    public JFrame getFrame() {
        return frame;
    }

    public JPanel createPanel(JTextField input, JTextField output){
        JPanel panel = new JPanel(new GridLayout(1, 3));

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton zero = new JButton("Z");

        zero.setEnabled(false);

        plus.addActionListener(new AdditionEventListener(input,output,calculator, zero));
        minus.addActionListener(new SubtractionEventListener(input,output,calculator, zero));
        zero.addActionListener(new ZeroEventListener(input,output,calculator, zero));

        panel.add(plus);
        panel.add(minus);
        panel.add(zero);
        return panel;
    }
}
