package schedule;

import java.util.Scanner;

import exception.ScheduleOrderException;

public class NoLecture extends Schedule implements ScheduleInput{
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
		// 예외처리
		int scheduleOrder = -1;
		while(scheduleOrder < 0) {
			System.out.print("Schedule order:");
			scheduleOrder = input.nextInt();
			try {
				this.setScheduleOrder(scheduleOrder);
			} catch(ScheduleOrderException e) {
				System.out.println("Incorrect schedule order number. put the number over -1");
			}
		}
		
		System.out.print("Schedule name:");
		String scheduleName = input.next();
		this.setScheduleName(scheduleName);

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
