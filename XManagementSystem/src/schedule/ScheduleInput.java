package schedule;

import java.util.Scanner;

import exception.ScheduleOrderException;

public interface ScheduleInput {
	
	public void setScheduleName(String scheduleName);
	public void printInfo();
	public void setScheduleOrder(int scheduleOrder) throws ScheduleOrderException;
	public void getUserInput(Scanner input);
	public int getScheduleOrder();
	public void setScheduleSubject(String scheduleSubject);
	public String getScheduleName();
	public String getScheduleSubject();
	public ScheduleKind getKind();
}