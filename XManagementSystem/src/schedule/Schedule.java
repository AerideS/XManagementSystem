package schedule;

import java.util.Scanner;

public class Schedule {
	protected String scheduleName;			// 스케줄 이름을 받기 위한 클래스의 필드
	
	protected int scheduleOrder;		 		// 스케줄 우선순위를 저장하기 위한 클래스의 필드
	protected String scheduleSubject; 		// 스케줄 과목을 저장하기 위한 클래스의 필드
	protected String deadLine;				// 스케줄 마감기한을 저장하기 위한 클래스의 필드
	protected ScheduleKind kind = ScheduleKind.Assignment;
	
	// 생성자 오버로딩
	// 인자가 없을 경우 이 생성자 호출
	public Schedule() {
		
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
	
	// 정보 출력 메소드
	public void printInfo() {
		System.out.println(" scheduleName:" + scheduleName + " scheduleOrder:" + scheduleOrder + " scheduleSubject:" +
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
