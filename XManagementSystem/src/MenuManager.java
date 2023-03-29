import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while(num != 6) {
			System.out.println("1. Add Schedules");
			System.out.println("2. Delete Schedules");
			System.out.println("3. Edit Schedules");
			System.out.println("4. View Schedules");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			
			if(num == 1)
				addSchedule();
			else if(num == 2)
				deleteSchedule();
			else if(num == 3)
				editSchedule();
			else if(num ==4)
				viewSchedule();
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

