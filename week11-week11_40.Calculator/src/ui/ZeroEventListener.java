package ui;

import logic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZeroEventListener implements ActionListener {

    private JTextField input;
    private JTextField output;
    private Calculator calculator;
    private  JButton zeroButton;

    public ZeroEventListener(JTextField input, JTextField output, Calculator calculator, JButton zeroButton) {
        this.input = input;
        this.output = output;
        this.calculator = calculator;
        this.zeroButton = zeroButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.zero();
        output.setText(String.valueOf(calculator.getValue()));

        input.setText("");

        zeroButton.setEnabled(false);
    }
}
