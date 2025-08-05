package Train_20250805;

class Calculator4 {
	int k;
	static int a;
	static double d;
	static boolean b;
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}

public class ClaculatorExample4 {

	public static void main(String[] args) {
		System.out.println("i > " + Calculator4.a);
		System.out.println("d > " + Calculator4.d);
		System.out.println("b > " + Calculator4.b);
		System.out.println("pi > " + Calculator4.pi);

		System.out.println("PLUS > " + Calculator4.plus(10, 5));
		System.out.println("MINUS > " + Calculator4.minus(10, 5));
	}

}
