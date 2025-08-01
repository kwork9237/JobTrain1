package Train_250731;

public class DoWhile02 {
	public static void main(String[] args) {
		int i = 1, a, b;
		a = b = 0;
		
		do {
			if(i % 2 == 0) a += i;
			else b += i;
			
			i++;
		} while(i <= 100);
		
		System.out.println("a > " + a);
		System.out.println("b > " + b);
	}
}
