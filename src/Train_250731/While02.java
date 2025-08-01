package Train_250731;

public class While02 {
	public static void main(String[] args) {
		int a, b, i;
		
		a = b = 0;
		i = 1;
		
		while(i <= 100)
		{
			if(i % 2 == 0) a += i;
			else b += i;
			
			i++;
		}
		
		System.out.println("a > " + a);
		System.out.println("b > " + b);
	}
}
