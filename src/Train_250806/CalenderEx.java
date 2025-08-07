package Train_250806;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderEx {
	public static void main(String[] args) {
		new GregorianCalendar();
		Calendar c = Calendar.getInstance();
		
		System.out.printf("%s - %d - %d\n", c.get(c.YEAR), c.get(c.MONTH)+1, c.get(c.DATE));
		System.out.printf("%s > %d:%d:%d", c.get(c.AM_PM) == 0 ? "오전" : "오후", c.get(c.HOUR), c.get(c.MINUTE), c.get(c.SECOND));
	}
}

