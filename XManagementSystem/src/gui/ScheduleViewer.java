package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import schedule.ScheduleInput;
import schedule.ScheduleManager;

public class ScheduleViewer extends JPanel {
	WindowFrame frame;
	
	ScheduleManager scheduleManager;
	public ScheduleViewer(WindowFrame frame, ScheduleManager scheduleManager) {
		this.frame = frame;
		this.scheduleManager = scheduleManager;
		
		System.out.println("***" + scheduleManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Order");
		model.addColumn("NAME");
		model.addColumn("Subject");
		model.addColumn("Kind");
		for (int i = 0; i < scheduleManager.size(); i++) {
			Vector row = new Vector();
			ScheduleInput si= scheduleManager.get(i);
			row.add(si.getScheduleOrder());
			row.add(si.getScheduleName());
			row.add(si.getScheduleSubject());
			row.add(si.getKind());
			model.addRow(row);
		}
		
		String column[] = {"Order", "NAME", "Subject", "Kind"};
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
