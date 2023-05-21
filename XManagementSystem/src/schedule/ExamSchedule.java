package schedule;

import java.util.Scanner;

import exception.ScheduleOrderException;

public class ExamSchedule extends Schedule implements ScheduleInput{
	
	protected String dday;
	
	public String getDday() {
		return dday;
	}
	public void setDday(String dday) {
		this.dday = dday;
	}
	public ExamSchedule() {
		super();
	}
	public ExamSchedule(ScheduleKind kind) {
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
			System.out.println("Do you know when is exam day? ( Y / N )");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Exam dday:");
				String dday = input.next();
				this.setDday(dday);
				break;
			}
			else if(answer == 'n' || answer == 'N') {			// deadline이 없다면 null 값 
				this.setDday("");
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
				scheduleSubject + " exam dday:" + this.getDday());
	}
}
