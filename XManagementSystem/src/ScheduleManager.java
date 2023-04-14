import java.util.ArrayList;
import java.util.Scanner;

public class ScheduleManager {
	ArrayList<Schedule> schedules = new ArrayList<Schedule>();			// collection 선언
	Scanner input;			// ScheduleManager의 Scanner 필드
	
	ScheduleManager(Scanner input) {	// 이 코드로 Scanner 한 번만 만들어도 됨
		this.input = input;
	}
	
	// 객체 필드를 통해 값을 저장
	public void addSchedule() {
		Schedule schedule = new Schedule();		// 기본 생성자
		System.out.print("Schedule order:");
		schedule.scheduleOrder = input.nextInt();
		
		System.out.print("Schedule name:");
		schedule.scheduleName = input.next();

		System.out.print("Subject:");
		schedule.scheduleSubject = input.next();
 
		System.out.print("Dead Line:");
		schedule.deadLine = input.next();
		
		schedules.add(schedule);	// 리스트에 schedule 추가
	 
	}
	
	// 객체 필드를 통한 if 연산
	// 스케줄 삭제 함수
	public void deleteSchedule() {
		System.out.print("Schedule order:");
		int scheduleOrder = input.nextInt();
		int index = -1;
		for(int i = 0; i < schedules.size(); i++) {				
			if(schedules.get(i).scheduleOrder == scheduleOrder) {	// schedules.get(i).scheduleOrder와 scheduleOrder 같다면
				index = i;											
				break;
			}
		}
		
		if(index >= 0) {
			schedules.remove(index);
			System.out.println("the schedule " + scheduleOrder + " is deleted");
		}
		else {
			System.out.println("the student has not been registered");
		}
		
	}
	
	// 스케줄 수정함수
	public void editSchedule() {
		System.out.print("ScheduleOrder: ");
		int scheduleOrder = input.nextInt();
		for(int i = 0; i < schedules.size(); i++) {
			Schedule schedule = schedules.get(i);			// 계속 schedules.get(i)를 하면 불편하므로
			if(schedule.scheduleOrder == scheduleOrder) {
				int num = -1;
				while(num != 5) {
					System.out.println("** Student Info Edit Menu **");
					System.out.println(" 1. Edit Schedule order");
					System.out.println(" 2. Edit Shedule name");
					System.out.println(" 3. Edit Schedule subject");
					System.out.println(" 4. View Schedule");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 6: ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Schedule Order:");
						schedule.scheduleOrder = input.nextInt();
					}
					else if (num == 2) {
						System.out.println("Schedule name");
						schedule.scheduleName = input.next();
					}
					else if (num == 3) {
						System.out.println("Schedule subject");
						schedule.scheduleSubject = input.next();
					}
					else {
						continue;
					} // if
				} // while
				break;
			} // if
		} // while
	}
	
	// 스케줄 보는 함수
	public void viewSchedules() {
//		System.out.print("Schedule order");
//		int scheduleOrder = input.nextInt();
		for(int i = 0; i < schedules.size(); i++) {
			schedules.get(i).printInfo();
		}
	}
}
