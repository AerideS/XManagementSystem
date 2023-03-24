import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		
		int scheduleId;		//Schedule id to distinguish each schedules
		String name;		//Schedule name
		int day;			//Schedule day
int time;			//Schedule time
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
				System.out.println("input schedule id");
				scheduleId = input.nextInt();
				System.out.println("input name");
				name = input.next();
				System.out.println("input day");
				day = input.nextInt();
				System.out.println("input time");
				time = input.nextInt();
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("What is the scheduleId?");
				scheduleId = input.nextInt();
				break;
			case 5:
				continue;
			case 6:
				return;
			}
		}
	}
}

