package engine;

import base.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class QuadEngine implements ActionListener {
	private JFormattedTextField fieldA1;
	private JFormattedTextField fieldB1;
	private JFormattedTextField fieldC1;
	private JTextArea mainField;

	public QuadEngine(JFormattedTextField fieldA1, JFormattedTextField fieldB1, JFormattedTextField fieldC1,
			JTextArea mainField) {
		this.fieldA1 = fieldA1;
		this.fieldB1 = fieldB1;
		this.fieldC1 = fieldC1;
		this.mainField = mainField;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			double a = Double.parseDouble(fieldA1.getText());
			double b = Double.parseDouble(fieldB1.getText());
			double c = Double.parseDouble(fieldC1.getText());
			QuadraticEqu equ = new QuadraticEqu(a, b, c);
			mainField.append(equ.toString() + "\n");
			mainField.append(String.format("Root 1 = %.3f, Root 2 = %.3f  \n", equ.firstRoot(), equ.secondRoot()));
		} catch (IllegalArgumentException e) {
			mainField.setText(" < A > is not equal to 0 \n");
			throw e;
		} catch (ArithmeticException e) {
			mainField.setText("Unsolvable \n");
			throw e;
		}
	}
}
