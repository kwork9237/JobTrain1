package Train_250731;

import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("정수 입력 : ");
		n = s.nextInt();
		
		if(n % 2 == 0)
			System.out.println("짝수임 > " + n);
		
		else
			System.out.println("홀수임 > " + n);
	}
}
