package sqreens;

import engine.StudentsSearchEngine;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class StudentsSearch {

	JPanel windowContent;
	JPanel p1;
	public JFormattedTextField group;
	public JFormattedTextField depart;
	public JFormattedTextField birthDay;
	public JComboBox all;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	public JTextField mainField;
	JButton search;

	public StudentsSearch() {
		windowContent = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		p1 = new JPanel();
		GridLayout gridLay = new GridLayout(2, 4);
		p1.setLayout(gridLay);
		
		label1 = new JLabel("Enter group");
		p1.add(label1);
		group = new JFormattedTextField();
		p1.add(group);
		
		label2 = new JLabel("Enter depart");
		p1.add(label2);
		depart = new JFormattedTextField();
		p1.add(depart);
		
		label3 = new JLabel("Enter birthYear");
		p1.add(label3);
		birthDay = new JFormattedTextField();
		p1.add(birthDay);
		
		label4 = new JLabel("Choose all?");
		p1.add(label4);
		String[] list = {
				"NO",
				"YES"
		};
		all = new JComboBox(list);
		all.setEditable(true);
		p1.add(all);
		
		windowContent.add("North", p1);

		mainField = new JTextField();
		windowContent.add("Center", mainField);

		search = new JButton("Search");
		windowContent.add("South", search);

		JFrame frame = new JFrame("Students Search");
		frame.setContentPane(windowContent);
		frame.pack();
		frame.setVisible(true);

		StudentsSearchEngine sse = new StudentsSearchEngine(this);
		search.addActionListener(sse);
	}

	public static void main(String[] args) {
		StudentsSearch studs = new StudentsSearch();
		Student[] students = {
				new Student(101, "Newvell", "Garry", "Sergeevich", 1994, "G street", "543-43-43", "FASS", 4, "VA22"),
				new Student(102, "Borha", "Valeriy", "Petrovich", 1994, "Yann street", "511-54-22", "FASS", 4, "VV22"),
				new Student(103, "Kovac", "Ladislaw", "Andreevich", 1994, "Peremohi street", "533-13-87", "FASS", 4,
						"VA22"),
				new Student(1021, "Leshchenko", "Vtlc", "Sergeevich", 1995, "G street", "543-43-43", "FIOT", 3, "VF33"),
				new Student(1023, "Borzi", "Gennadiy", "Albertovich", 1996, "Yann street", "511-54-22", "FIOT", 2,
						"VF42"),
				new Student(1012, "Nolik", "Odin", "Dva", 1996, "Yann street", "511-54-22", "FIOT", 2, "VF42"),
				new Student(1043, "Help", "Chemp", "Andreevich", 1993, "Peremohi street", "533-13-87", "FASS", 5,
						"VA22"),
				new Student(1302, "Djaliv", "Valeriy", "Petrovich", 1995, "Yann street", "511-54-22", "FASS", 3,
						"VV22"),
				new Student(1013, "Some", "Ladislaw", "Andreevich", 1994, "Peremohi street", "533-13-87", "FASS", 4,
						"VA22"),
				new Student("Vitalich", "Papich", 1994, "VV22"), };

		Student obj = new Student();
		obj.setStuds(students);
	}
}
