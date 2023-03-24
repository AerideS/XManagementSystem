import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		
		int scheduleId;
		String name;
		int time;
		int day;
		
		while(true) {
			System.out.println("1. Add Schedules");
			System.out.println("2. Delete Schedules");
			System.out.println("3. Edit Schedules");
			System.out.println("4. View Schedules");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			
			select = input.nextInt();
			
			switch(select) {
			case 1:
				scheduleId = input.nextInt();
				name = input.next();
				day = input.nextInt();
				time = input.nextInt();
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("What is the scheduleId?");
				break;
			case 6:
				return;
			}
		}
	}
}
