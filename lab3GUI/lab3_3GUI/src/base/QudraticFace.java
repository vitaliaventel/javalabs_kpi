package base;

import engine.QuadEngine;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class QudraticFace {

	private JPanel windowContent;
	private JFormattedTextField fieldA1;
	private JFormattedTextField fieldB1;
	private JFormattedTextField fieldC1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextArea mainField;
	private JButton start;
	private JPanel p1;

	public QudraticFace() {
		windowContent = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		p1 = new JPanel();
		label1 = new JLabel("EQU1 A=");
		label2 = new JLabel("EQU1 B=");
		label3 = new JLabel("EQU1 C=");
		fieldA1 = new JFormattedTextField();
		fieldB1 = new JFormattedTextField();
		fieldC1 = new JFormattedTextField();

		GridLayout gridLay = new GridLayout(1, 3);
		p1.setLayout(gridLay);
		p1.add(label1);
		p1.add(fieldA1);
		p1.add(label2);
		p1.add(fieldB1);
		p1.add(label3);
		p1.add(fieldC1);
		windowContent.add("North", p1);
		mainField = new JTextArea();
		windowContent.add(mainField);
		start = new JButton("GO");
		windowContent.add("South", start);

		JFrame frame = new JFrame("Quad Equ");
		frame.setContentPane(windowContent);
		frame.pack();
		frame.setVisible(true);

		QuadEngine qe = new QuadEngine(fieldA1, fieldB1, fieldC1, mainField);
		start.addActionListener(qe);
	}

	public static void main(String[] args) {
		QudraticFace equ = new QudraticFace();

	}

}
