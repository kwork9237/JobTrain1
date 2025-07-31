package Train_250731;

public class Oper10 {
	public static void main(String[] args) {
		int a, b, c, d;
		int a1, b1, c1, d1;
		
		a = b = c = d = 10;
		
		a1 = ++a;
		b1 = b++;
		c1 = --c;
		d1 = d--;
		
		System.out.println("a1 = " + a1 + " / a = " + a);
		System.out.println("b1 = " + b1 + " / b = " + b);
		System.out.println("c1 = " + c1 + " / c = " + c);
		System.out.println("d1 = " + d1 + " / d = " + d);
	}
}
