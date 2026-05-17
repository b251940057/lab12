package lab12;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

	private JTextField input1 = new JTextField(10);
	private JTextField input2 = new JTextField(10);

	private JLabel resultLabel = new JLabel("Хариу: "); 

	public Calculator()
	{
		setTitle("Тооны машин");
		setSize(350, 180);
		setLayout(new FlowLayout());

		JButton btnnemeh = new JButton("+");
		JButton btnhasah = new JButton("-");
		JButton btnvrjih = new JButton("*");
		JButton btnhuwaah = new JButton("/");

		btnnemeh.addActionListener(e -> {
			double hariu = nemeh();
			resultLabel.setText("Хариу: " + hariu);
		});

		btnhasah.addActionListener(e -> {
			double hariu = hasah();
			resultLabel.setText("Хариу: " + hariu);
		});

		btnvrjih.addActionListener(e -> {
			double hariu = vrjih();
			resultLabel.setText("Хариу: " + hariu);
		});

		btnhuwaah.addActionListener(e -> {
			double hariu = huwaah();
			resultLabel.setText("Хариу: " + hariu);
		});

		add(new JLabel("1-р гишүүн:"));
		add(input1);
		add(new JLabel("2-р гишүүн:"));
		add(input2);
		add(btnnemeh);
		add(btnhasah);
		add(btnvrjih);
		add(btnhuwaah);
		add(resultLabel);

		setVisible(true);
	}

	private double nemeh()
	{
		double num1 = Double.parseDouble(input1.getText());
		double num2 = Double.parseDouble(input2.getText());
		double result = num1 + num2;
		return result;
	}

	private double hasah()
	{
		double num1 = Double.parseDouble(input1.getText());
		double num2 = Double.parseDouble(input2.getText());
		double result = num1 - num2;
		return result;
	}

	private double vrjih()
	{
		double num1 = Double.parseDouble(input1.getText());
		double num2 = Double.parseDouble( input2.getText() );
		double result = num1 * num2;
		return result;
	}

	private double huwaah()
	{
		double num1 = Double.parseDouble(input1.getText());
		double num2 = Double.parseDouble(input2.getText());
		double result = num1 / num2;   
		return result;
	}
}
