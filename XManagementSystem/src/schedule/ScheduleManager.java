package schedule;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.Scanner;

import exception.ScheduleOrderException;

public class ScheduleManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6578351335933347577L;
	ArrayList<ScheduleInput> schedules = new ArrayList<ScheduleInput>();			// collection 선언
	transient Scanner input;			// ScheduleManager의 Scanner 필드
	
	public ScheduleManager(Scanner input) {	// 이 코드로 Scanner 한 번만 만들어도 됨
		this.input = input;
	}
	
	// 객체 필드를 통해 값을 저장
	public void addSchedule() {
		int kind = 0;
		ScheduleInput scheduleInput;
		while(kind != 1 && kind != 2) { 
			System.out.print("1 for Assignment, ");
			System.out.print("2 for Lecture, ");
			System.out.print("3 for Eaxm, ");
			System.out.print("4 for NoLecture, ");
			System.out.print("Select num for Schedule Kind between 1 - 4: ");
			kind = input.nextInt();
			// 바뀐 부분
			if(kind == 1) {
				scheduleInput = new AssignmentSchedule(ScheduleKind.Assignment);			//Assignment 저장
				scheduleInput.getUserInput(input);
				schedules.add(scheduleInput);	// 리스트에 schedule 추가
				break;
			}
			else if (kind == 2) {
				scheduleInput = new LectureSchedule(ScheduleKind.Lecture);		//Lecture 저장
				scheduleInput.getUserInput(input);
				schedules.add(scheduleInput);	// 리스트에 schedule 추가
				break;
			}
			else if (kind == 3) {
				scheduleInput = new ExamSchedule(ScheduleKind.Exam);		//Exam 저장
				scheduleInput.getUserInput(input);
				schedules.add(scheduleInput);	// 리스트에 schedule 추가
				break;
			}
			else if (kind == 4) {
				scheduleInput = new NoLecture(ScheduleKind.Nolecture);		//Exam 저장
				scheduleInput.getUserInput(input);
				schedules.add(scheduleInput);	// 리스트에 schedule 추가
				break;
			}
			else {
				System.out.print("Select num for Schedule Kind between 1 - 4: ");
			}
		}
	}
	
	// 객체 필드를 통한 if 연산
	// 스케줄 삭제 함수
	public void deleteSchedule() {
		System.out.print("Schedule order:");
		int scheduleOrder = input.nextInt();
		int index = -1;
		for(int i = 0; i < schedules.size(); i++) {				
			if(schedules.get(i).getScheduleOrder() == scheduleOrder) {	// schedules.get(i).scheduleOrder와 scheduleOrder 같다면
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
			ScheduleInput scheduleInput = schedules.get(i);			// 계속 schedules.get(i)를 하면 불편하므로
			if(scheduleInput.getScheduleOrder() == scheduleOrder) {
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
						// 예외처리
						int order = -1;
						while(scheduleOrder < 0) {
							System.out.print("Schedule order:");
							order = input.nextInt();
							try {
								scheduleInput.setScheduleOrder(order);
							} catch(ScheduleOrderException e) {
								System.out.println("Incorrect schedule order number. put the number over -1");
							}		
						}
						
					}
					else if (num == 2) {
						System.out.println("Schedule name");
						String name = input.next();
						scheduleInput.setScheduleName(name); 	//setter 활용
					}
					else if (num == 3) {
						System.out.println("Schedule subject");
						String subject = input.next();
						scheduleInput.setScheduleSubject(subject);	//setter 활용
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
		System.out.println("# of registered schedules:" + schedules.size());
		for(int i = 0; i < schedules.size(); i++) {
			schedules.get(i).printInfo();
		}
	}
	
	public int size() {
		return schedules.size();
	}
	
	public ScheduleInput get(int index) {
		return (ScheduleInput) schedules.get(index);
	}
}
