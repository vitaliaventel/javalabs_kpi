package base;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import engine.*;


public class WordCounterFace {
	
	private JFormattedTextField field;
	private JPanel windowContent;
	private JPanel p1;
	private JPanel p2;
	private JSpinner count;
	private JButton start;
	private JButton clear;
	
	public WordCounterFace(){
		windowContent = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		p1 = new JPanel();
		JLabel label1 = new JLabel("Enter your string: ");
		label1.setHorizontalAlignment(JLabel.CENTER);
		JLabel label2 = new JLabel("Word count: ");
		label2.setHorizontalAlignment(JLabel.CENTER);
		field = new JFormattedTextField();
		count = new JSpinner();
		count.setEnabled(false);
		GridLayout gridLay = new GridLayout(2, 2);
		p1.setLayout(gridLay);
		p1.add(label1);
		p1.add(field);
		p1.add(label2);
		p1.add(count);

		windowContent.add("North", p1);


		p2 = new JPanel();
		GridLayout gridLayot = new GridLayout(1, 3);
		p2.setLayout(gridLayot);
		start = new JButton("Start");
		clear = new JButton("Clear");
		p2.add(start);
		p2.add(new JLabel());
		p2.add(clear);
		windowContent.add(p2);

		JFrame frame = new JFrame("Word counter");
		frame.setContentPane(windowContent);
		frame.setPreferredSize(new Dimension(300,100));
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);

		WordCounterEngine ge = new WordCounterEngine(field,count);
		start.addActionListener(ge);
		clear.addActionListener(ge);
	}

	public static void main(String[] args) {
		new WordCounterFace();
	}

}
