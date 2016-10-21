package engine;

import sqreens.Student;
import sqreens.StudentsSearch;
import java.awt.event.ActionListener;
import java.awt.CheckboxGroup;
import java.awt.event.ActionEvent;

public class StudentsSearchEngine implements ActionListener {
	StudentsSearch parent;

	public StudentsSearchEngine(StudentsSearch parent) {
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		parent.mainField.setText("");
		String groupText = parent.group.getText();
		String departText = parent.depart.getText();
		int birthYearText = Integer.parseInt(parent.birthDay.getText());
		String allText = (String) parent.all.getSelectedItem();
		Student objtemp = new Student();
		if (objtemp.checkGroup(groupText) != null) {
			for (Student temp : objtemp.checkGroup(groupText)) {
				if (temp != null) {
					parent.mainField.setText(temp.toString());
				}
			}
		} else if(objtemp.checkBirthday(birthYearText) != null){
			for (Student temp : objtemp.checkBirthday(birthYearText)) {
				if (temp != null) {
					parent.mainField.setText(temp.toString());
				}
			}
		}
	}
}
