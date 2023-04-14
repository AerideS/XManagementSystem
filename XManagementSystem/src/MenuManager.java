import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);			//사용자로부터 입력을 받기 위한 Scanner 객체 생성
		ScheduleManager scheduleManager = new ScheduleManager(input); // ScheduleManager 객체 생성
		
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
			if(num == 1)					// 1을 입력하였을 경우 addSchedule() 실행
				scheduleManager.addSchedule();				
			else if(num == 2)				// 2를 입력하였을 경우 deleteSchedule() 실행
				scheduleManager.deleteSchedule();			
			else if(num == 3)				// 3을 입력하였을 경우 editSchedule() 실행
				scheduleManager.editSchedule();
			else if(num ==4)				// 4를 입력하였을 경우 viewSchedule() 실행
				scheduleManager.viewSchedules();
			else 
				continue;

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
}

