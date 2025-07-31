package Train_250731;

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2, max, min;
		
//		max = Integer.MIN_VALUE;
//		min = Integer.MAX_VALUE;
		
		System.out.println("정수 2개 입력");
		n1 = s.nextInt();
		n2 = s.nextInt();
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		}
		
		else {
			max = n2;
			min = n1;
		}
		
		System.out.println("max > " + max);
		System.out.println("min > " + min);
	}
}
