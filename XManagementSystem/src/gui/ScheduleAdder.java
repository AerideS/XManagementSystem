package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ScheduleAdder extends JPanel {
	
	WindowFrame frame;
	
	public ScheduleAdder(WindowFrame frame) {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelOrder = new JLabel("Order: ", JLabel.TRAILING);
		JTextField fieldOrder = new JTextField(10);
		labelOrder.setLabelFor(fieldOrder);
		panel.add(labelOrder);
		panel.add(fieldOrder);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelSubject = new JLabel("Subject: ", JLabel.TRAILING);
		JTextField fieldSubject = new JTextField(10);
		labelSubject.setLabelFor(fieldSubject);
		panel.add(labelSubject);
		panel.add(fieldSubject);
		
		JLabel labelKind = new JLabel("Kind: ", JLabel.TRAILING);
		JTextField fieldKind = new JTextField(10);
		labelKind.setLabelFor(fieldKind);
		panel.add(labelKind);
		panel.add(fieldKind);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel,  5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}
}
