package ui;

import logic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionEventListener implements ActionListener {

    private JTextField input;
    private JTextField output;
    private Calculator calculator;
    private JButton zeroButton;

    public AdditionEventListener(JTextField input, JTextField output, Calculator calculator, JButton zeroButton) {
        this.input = input;
        this.output = output;
        this.calculator = calculator;
        this.zeroButton = zeroButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            int value = Integer.parseInt(input.getText());
            calculator.add(value);

            output.setText(String.valueOf(calculator.getValue()));

            if (calculator.getValue() == 0) {
                zeroButton.setEnabled(false);
            } else {
                zeroButton.setEnabled(true);
            }

            input.setText("");
        } catch (NumberFormatException nfe){
            input.setText("");
        }
    }
}
