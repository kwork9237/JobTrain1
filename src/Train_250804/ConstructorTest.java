package Train_250804;

class MyDate0 {
	private int year;
	private int month;
	private int day;
	
	// 마우스 우클릭 > Source > 하단 3번째 선택 (Generate constructor using fields)
	public MyDate0(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void print() {
		System.out.printf("%d / %d / %d\n", year, month, day);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		MyDate0 m = new MyDate0(2025, 8, 4);
		
		m.print();
		
		m.setYear(2026);
		m.setMonth(12);
		m.setDay(25);
		m.print();
		
		m.getYear();
	}
}
