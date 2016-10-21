package engine;

import base.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SymbolReplaceEngine implements ActionListener {
	
	private JFormattedTextField field;
	private JSpinner symbNumber;
	private JTextArea mainField;
	private JButton start;
	private JButton clear;

	public SymbolReplaceEngine(JFormattedTextField field, JSpinner symbNumber,JTextArea mainField, JButton start, JButton clear) {
		this.field = field;
		this.symbNumber = symbNumber;
		this.mainField = mainField;
		this.start = start;
		this.clear = clear;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == start){
		SymbolReplace obj = new SymbolReplace();
		obj.setK((Integer) symbNumber.getValue());
		obj.setArray(field.getText());
		mainField.append("Entered string = " + field.getText() + "\n");
		mainField.append("Result string = " + obj.strReplace() + "\n");
		}else if(src == clear){
			mainField.setText("");
		}

	}

}
