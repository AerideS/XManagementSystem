package schedule;

import java.util.Scanner;
// 추가된 부분
public class LectureSchedule extends Schedule implements ScheduleInput{
	
	protected String professorName;
	
	public LectureSchedule() {
		super();
	}

	public LectureSchedule(ScheduleKind kind) {
		super(kind);
	}
	
	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
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
			System.out.println("Do you know the professor's name? ( Y / N )");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("professor's name:");
				String professorName = input.next();
				this.setProfessorName(professorName);
				break;
			}
			else if(answer == 'n' || answer == 'N') {			// deadline이 없다면 null 값 
				this.setProfessorName("");
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
				scheduleSubject + " professorName:" + professorName);
	}
}
