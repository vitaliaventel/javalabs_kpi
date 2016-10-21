package base;

import engine.GeometryEngine;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class GeometryFace {

	JPanel windowContent;
	private JFormattedTextField squareName;
	private JSpinner heightRect;
	private JSpinner weightRect;
	private JSpinner squareSide;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JTextArea mainField;
	private JButton createRect;
	private JButton createSquare;
	private JButton clear;
	private JPanel p1;
	private JPanel p2;

	public GeometryFace() {
		windowContent = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		p1 = new JPanel();
		label1 = new JLabel("Rect height");
		label2 = new JLabel("Rect weight");
		label3 = new JLabel("Square side");
		label4 = new JLabel("Square name");
		squareName = new JFormattedTextField();
		heightRect = new JSpinner();
		weightRect = new JSpinner();
		squareSide = new JSpinner();

		GridLayout gridLay = new GridLayout(2, 4);
		p1.setLayout(gridLay);
		p1.add(label1);
		p1.add(heightRect);
		p1.add(label2);
		p1.add(weightRect);
		p1.add(label3);
		p1.add(squareSide);
		p1.add(label4);
		p1.add(squareName);
		windowContent.add("North", p1);
		mainField = new JTextArea();
		windowContent.add(mainField);

		p2 = new JPanel();
		GridLayout gridLayot = new GridLayout(1, 3);
		p2.setLayout(gridLayot);

		createRect = new JButton("Create Rect");
		createSquare = new JButton("Create Square");
		clear = new JButton("Clear");
		p2.add(createSquare);
		p2.add(createRect);
		p2.add(clear);
		windowContent.add("South", p2);

		JFrame frame = new JFrame("Geometry");
		frame.setContentPane(windowContent);
		frame.pack();
		frame.setVisible(true);

		GeometryEngine ge = new GeometryEngine(squareName, heightRect, weightRect, squareSide, mainField);
		createRect.addActionListener(ge);
		createSquare.addActionListener(ge);
		clear.addActionListener(ge);
	}

	public static void main(String[] args) {
		GeometryFace gf = new GeometryFace();

	}

}
