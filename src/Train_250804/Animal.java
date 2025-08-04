package Train_250804;

public class Animal {
	int age;
	
	public Animal() {
		System.out.println("생성자 호출");
	}
	
	public static void main(String[] args) {
		int a = 30;
		
		String str = "JAVA";
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		System.out.println(a1.age);
		a1.age = 1000;
		System.out.println(a2.age);
		
		if(a1 == a2) {
			System.out.println("TEST");
		}
	}
}
