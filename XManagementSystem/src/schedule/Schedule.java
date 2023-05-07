package schedule;

import java.util.Scanner;

public class Schedule {
	protected String scheduleName;			// 스케줄 이름을 받기 위한 클래스의 필드
	
	protected int scheduleOrder;		 		// 스케줄 우선순위를 저장하기 위한 클래스의 필드
	protected String scheduleSubject; 		// 스케줄 과목을 저장하기 위한 클래스의 필드
	protected String deadLine;				// 스케줄 마감기한을 저장하기 위한 클래스의 필드
	protected ScheduleKind kind = ScheduleKind.Assignment;
	// 기존 배열의 총 길이를 저장했던 변수 삭제 *어레이 리스트객체에서 길이 확인 가능
	
	// 생성자 오버로딩
	// 인자가 없을 경우 이 생성자 호출
	public Schedule() {
		
	}
	
	public Schedule(ScheduleKind kind) {
		this.kind = kind;
	}
	// Getter, Setter 는 생성자 아래가 관례적
	public String getScheduleName() {
		return scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	public int getScheduleOrder() {
		return scheduleOrder;
	}

	public void setScheduleOrder(int scheduleOrder) {
		this.scheduleOrder = scheduleOrder;
	}

	public String getScheduleSubject() {
		return scheduleSubject;
	}

	public void setScheduleSubject(String scheduleSubject) {
		this.scheduleSubject = scheduleSubject;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}

	public ScheduleKind getKind() {
		return kind;
	}

	public void setKind(ScheduleKind kind) {
		this.kind = kind;
	}

	
	// 인자로 scheduleName, scheduleOrder를 받을 경우 호출
	public Schedule(String scheduleName, int scheduleOrder) {
		this.scheduleName = scheduleName;	// 오브젝트 변수와 매개변수를 구변하기 위해 this 사용
		this.scheduleOrder = scheduleOrder;
	}
	
	// 인자로 scheduleName, scheduleOrder, scheduleSubject, deadLine을 받을 경우 호출
	public Schedule(String scheduleName, int scheduleOrder, String scheduleSubject, String deadLine) {
		this.scheduleName = scheduleName;
		this.scheduleOrder = scheduleOrder;
		this.scheduleSubject = scheduleSubject;
		this.deadLine = deadLine;
	}
	
	// 달라진 부분
	// 메소드 오버로딩 인자로 scheduleKind를 받을 경우 이 생성자 호출
	public Schedule(ScheduleKind kind,String scheduleName, int scheduleOrder, String scheduleSubject, String deadLine) {
		this.kind = kind;
		this.scheduleName = scheduleName;
		this.scheduleOrder = scheduleOrder;
		this.scheduleSubject = scheduleSubject;
		this.deadLine = deadLine;
	}
	
	// 달라진 부분
	// 정보 출력 메소드
	
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
				scheduleSubject + " deadLine:" + deadLine);
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
		
		System.out.print("Dead Line:");
		String deadLine = input.next();
		this.setDeadLine(deadLine);
	}
}
