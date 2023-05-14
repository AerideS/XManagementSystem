package schedule;

import java.util.Scanner;

public class AssignmentSchedule extends Schedule implements ScheduleInput {

	public AssignmentSchedule() {
		super();
	}
	public AssignmentSchedule(ScheduleKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		System.out.print("Schedule order:");
		int scheduleOrder = input.nextInt();
		this.setScheduleOrder(scheduleOrder);
		
		System.out.print("Schedule name:");
		String scheduleName = input.next();
		this.setScheduleName(scheduleName);

		System.out.print("Subject:");
		String scheduleSubject = input.next();
		this.setScheduleSubject(scheduleSubject);
		
		char answer = 'x';
		while(answer != 'y' || answer != 'Y' || answer != 'n' || answer != 'N') {
			System.out.println("Does this have a dead line? ( Y / N )");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Dead Line:");
				String deadLine = input.next();
				this.setDeadLine(deadLine);
				break;
			}
			else if(answer == 'n' || answer == 'N') {			// deadline이 없다면 null 값 
				this.setDeadLine("");
				break;
			}
			else {
				}
		}
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Assignment:
			skind = "Assignment";
			break;
		case Lecture:
			skind = "Lecture";
			break;
		case Exam:
			skind = "Exam";
			break;
		case Nolecture:
			skind = "Nolecture";
			break;
			default:
				
		}
		System.out.println("kind:" + skind +" scheduleName:" + scheduleName + " scheduleOrder:" + scheduleOrder + " scheduleSubject:" +
				scheduleSubject);
	}
}
