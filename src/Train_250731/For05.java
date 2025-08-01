package Train_250731;

import java.util.Scanner;

public class For05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("구구단 입력");
		int d = s.nextInt();
		
		for(int i = 1; i <= 9; i++)
			System.out.println(d + " * " + i + " = " + i * d);
	}
}
