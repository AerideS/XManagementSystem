package schedule;

import java.util.Scanner;

public interface ScheduleInput {
	
	public void setScheduleName(String scheduleName);
	public void printInfo();
	public void setScheduleOrder(int scheduleOrder);
	public void getUserInput(Scanner input);
	public int getScheduleOrder();
	public void setScheduleSubject(String scheduleSubject);
}