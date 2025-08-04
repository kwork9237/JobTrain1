package Train_250804;

class Car {
	String company = "현대";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
}

public class CarExample {	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		PrintSpec(c1);
		c1.speed = 120;
		
		System.out.println("변경후 속도 : " + c1.speed);
	}
	
	public static void PrintSpec(Car c) {
		System.out.println("제작회사 : " + c.company);
		System.out.println("모델명 : " + c.model);
		System.out.println("색깔 : " + c.color);
		System.out.println("최고속도 : " + c.maxSpeed);
		System.out.println("속도 : " + c.speed);
	}
}
