package base;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import engine.SymbolReplaceEngine;

public class SymbolReplaceFace {

	private JPanel windowContent;
	private JFormattedTextField field;
	private JLabel label1;
	private JLabel label2;
	private JSpinner symbNumber;
	private JTextArea mainField;
	private JButton start;
	private JButton clear;
	private JPanel p1;
	private JPanel p2;

	public SymbolReplaceFace() {
		windowContent = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		p1 = new JPanel();
		label1 = new JLabel("Choose symbol number:");
		label2 = new JLabel("Enter a string");
		symbNumber = new JSpinner();
		field = new JFormattedTextField();

		GridLayout gridLay = new GridLayout(2, 2);
		p1.setLayout(gridLay);
		p1.add(label1);
		p1.add(symbNumber);
		p1.add(label2);
		p1.add(field);
		windowContent.add("North", p1);
		mainField = new JTextArea();
		windowContent.add(mainField);

		p2 = new JPanel();
		GridLayout gridLayot = new GridLayout(1, 2);
		p2.setLayout(gridLayot);
		clear = new JButton("Clear");
		start = new JButton("GO");
		p2.add(start);
		p2.add(clear);
		windowContent.add("South", p2);

		JFrame frame = new JFrame("Symbol replace");
		frame.setContentPane(windowContent);
		frame.pack();
		frame.setVisible(true);

		SymbolReplaceEngine sre = new SymbolReplaceEngine(field, symbNumber, mainField, start, clear);
		start.addActionListener(sre);
		clear.addActionListener(sre);
	}

	public static void main(String[] args) {
		SymbolReplaceFace sfr = new SymbolReplaceFace();

	}

}
