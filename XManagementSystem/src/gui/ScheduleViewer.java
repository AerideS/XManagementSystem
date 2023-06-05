package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ScheduleViewer extends JFrame {
	public ScheduleViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Order");
		model.addColumn("NAME");
		model.addColumn("Subject");
		model.addColumn("Kind");
		
		String column[] = {"Order", "NAME", "Subject", "Kind"};
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300, 300);;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);;
	}
}
