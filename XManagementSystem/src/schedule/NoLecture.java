package schedule;

import java.util.Scanner;

public class NoLecture extends Schedule {
	private String noclassday;
	
	public String getNoclassday() {
		return noclassday;
	}

	public void setNoclassday(String noclassday) {
		this.noclassday = noclassday;
	}
	
	public NoLecture() {
		super();
	}
	public NoLecture(ScheduleKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Schedule order:");
		int scheduleOrder = input.nextInt();
		this.setScheduleOrder(scheduleOrder);
		
		System.out.print("Schedule name:");
		String scheduleName = input.next();
		this.setDeadLine(scheduleName);

		System.out.print("Subject:");
		String scheduleSubject = input.next();
		this.setScheduleSubject(scheduleSubject);
		
		char answer = 'x';
		while(answer != 'y' || answer != 'Y' || answer != 'n' || answer != 'N') {
			System.out.println("Do you know when is noclass day? ( Y / N )");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("no class day:");
				String noclassday = input.next();
				this.setNoclassday(noclassday);
				break;
			}
			else if(answer == 'n' || answer == 'N') {			// deadline이 없다면 null 값 
				this.setNoclassday("");
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
				scheduleSubject + " noLecture day:" + this.getNoclassday());
	}
}
