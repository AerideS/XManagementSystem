
public class Schedule {
	String scheduleName;			// 스케줄 이름을 받기 위한 클래스의 필드
	int scheduleOrder;		 		// 스케줄 우선순위를 저장하기 위한 클래스의 필드
	String scheduleSubject; 		// 스케줄 과목을 저장하기 위한 클래스의 필드
	String deadLine;				// 스케줄 마감기한을 저장하기 위한 클래스의 필드
	
	
	// 생성자 오버로딩
	// 인자가 없을 경우 이 생성자 호출
	public Schedule() {
		
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
}
