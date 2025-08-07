package _Report;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Report_250807 {
	public static void main(String[] args) {
		new GregorianCalendar();
		Calendar c = Calendar.getInstance();
		
		String[] DayOfWeek = new String[] { "일", "월", "화", "수", "목", "금", "토" };
		String[] AMPM = new String[] { "오전", "오후" };
		
		
		String SelectedDayOfWeek = DayOfWeek[c.get(Calendar.DAY_OF_WEEK) - 1];
		String SelectedAMPM = AMPM[c.get(Calendar.AM_PM)];
		
		System.out.printf("%d-%02d-%02d (%s)\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE), SelectedDayOfWeek);
		System.out.printf("[%s] %02d:%02d:%02d", SelectedAMPM, c.get(Calendar.HOUR), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
		
	}
}
