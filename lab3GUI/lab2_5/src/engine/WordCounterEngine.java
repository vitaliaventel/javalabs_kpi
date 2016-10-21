package engine;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import base.WordCounter;

public class WordCounterEngine implements ActionListener {

	private JFormattedTextField field;
	private JSpinner count;
	
	public WordCounterEngine(JFormattedTextField field, JSpinner count){
		this.field = field;
		this.count = count;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		if(src.getText().equals("Start")){
			WordCounter wc = new WordCounter(field.getText());
			count.setValue(wc.strCounter());
		} else if(src.getText().equals("Clear")){
			field.setText("");
			count.setValue(0);
		}
		
	}

}
