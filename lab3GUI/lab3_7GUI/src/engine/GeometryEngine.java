package engine;

import base.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class GeometryEngine implements ActionListener {

	private JFormattedTextField squareName;
	private JSpinner heightRect;
	private JSpinner weightRect;
	private JSpinner squareSide;
	private JTextArea mainField;

	public GeometryEngine(JFormattedTextField squareName, JSpinner heightRect, JSpinner weightRect, JSpinner squareSide,
			JTextArea mainField) {
		this.squareName = squareName;
		this.heightRect = heightRect;
		this.weightRect = weightRect;
		this.squareSide = squareSide;
		this.mainField = mainField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		if (src.getText().equals("Create Rect")) {
			Rectangle rect = new Rectangle();
			rect.setParam((Integer) heightRect.getValue(), (Integer) weightRect.getValue());
			for (int i = 0; i < rect.getHeight(); i++) {
				for (int j = 0; j < rect.getWeight(); j++) {
					mainField.append("#  ");
				}
				mainField.append("\n");
			}
			mainField.append("\n");
		} else if (src.getText().equals("Create Square")) {
			Square square = new Square();
			square.setParam((Integer) squareSide.getValue(), squareName.getText());
			mainField.append(squareName.getText() + "\n");
			for (int i = 0; i < square.getSquareSide(); i++) {
				for (int j = 0; j < square.getSquareSide(); j++) {
					mainField.append("#  ");
				}
				mainField.append("\n");
			}
			mainField.append("\n");
		} else if (src.getText().equals("Clear")) {
			mainField.setText("");
		}

	}

}
