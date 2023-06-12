import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;
import schedule.ScheduleManager;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			//사용자로부터 입력을 받기 위한 Scanner 객체 생성
		ScheduleManager scheduleManager = getObject("schedulemanager.ser");
		if(scheduleManager == null) {
			scheduleManager = new ScheduleManager(input); // ScheduleManager 객체 생성
		}
		
		WindowFrame frame = new WindowFrame(scheduleManager);
		int num = -1;
		while(num != 5) {
			System.out.println("1. Add Schedule");
			System.out.println("2. Delete Schedule");
			System.out.println("3. Edit Schedule");
			System.out.println("4. View Schedules");
			System.out.println(". Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			
			// scheduleManager 객체의 메소드를 호출
			if(num == 1) {					// 1을 입력하였을 경우 addSchedule() 실행
				scheduleManager.addSchedule();				
				logger.log("add a schedule");
			}else if(num == 2) {			// 2를 입력하였을 경우 deleteSchedule() 실행
				scheduleManager.deleteSchedule();			
				logger.log("delete a schedule");
			}
			else if(num == 3) {				// 3을 입력하였을 경우 editSchedule() 실행
				scheduleManager.editSchedule();
				logger.log("edit a schedule");	
			}
			else if(num ==4) {				// 4를 입력하였을 경우 viewSchedule() 실행
				scheduleManager.viewSchedules();
				logger.log("view a list of schedule");

			}
				else 
				continue;
			putObject(scheduleManager, "schedulemanager.ser");
		}
	}


	public static void addSchedule() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Schedule order:");
		int scheduleOrder = input.nextInt();
		
		System.out.print("Schedule name:");
		String scheduleName = input.next();

		System.out.print("Subject:");
		String scheduleSubject = input.next();
 
		System.out.print("Dead Line:");
		String deadLine = input.next();
	 
	}
	
	public static void deleteSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.print("Schedule order");
		int scheduleOrder = input.nextInt();
	}
	
	public static void editSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.print("Schedule order");
		int scheduleOrder = input.nextInt();
	}
	
	public static void viewSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.print("Schedule order");
		int scheduleOrder = input.nextInt();
	}
	
	public static ScheduleManager getObject(String filename) {
		ScheduleManager scheduleManager = null;
		
		try {
			FileInputStream file  = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			scheduleManager = (ScheduleManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return scheduleManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scheduleManager;
	}
	
	public static void putObject(ScheduleManager scheduleManager, String filename) {
		try {
			FileOutputStream file  = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(scheduleManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

