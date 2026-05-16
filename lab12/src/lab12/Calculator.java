package lab12;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    private JTextField input1 = new JTextField(10);
    private JTextField input2 = new JTextField(10);
    private JLabel resultLabel = new JLabel("Хариу: ");

    public Calculator() {
        setTitle("Тооны машин");
        setSize(350, 180);
        setLayout(new FlowLayout());

        JButton btnAdd = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnMul = new JButton("*");
        JButton btnDiv = new JButton("÷");

        btnAdd.addActionListener(e -> resultLabel.setText("Хариу: " + add()));
        btnSub.addActionListener(e -> resultLabel.setText("Хариу: " + subtract()));
        btnMul.addActionListener(e -> resultLabel.setText("Хариу: " + multiply()));
        btnDiv.addActionListener(e -> resultLabel.setText("Хариу: " + divide()));

        add(new JLabel("1-р гишүүн:"));
        add(input1);
        add(new JLabel("2-р гишүүн:"));
        add(input2);
        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);
        add(resultLabel);

        setVisible(true);
    }

    private double add()      { return Double.parseDouble(input1.getText()) + Double.parseDouble(input2.getText()); }
    private double subtract() { return Double.parseDouble(input1.getText()) - Double.parseDouble(input2.getText()); }
    private double multiply() { return Double.parseDouble(input1.getText()) * Double.parseDouble(input2.getText()); }
    private double divide()   { return Double.parseDouble(input1.getText()) / Double.parseDouble(input2.getText()); }
}