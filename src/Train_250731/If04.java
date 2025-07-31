package Train_250731;

import java.util.Scanner;

public class If04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("0 ~ 100 사이의 점수 입력");
		n = s.nextInt();
		
		if(n >= 90) System.out.println("A 학점");
		else if(n >= 80) System.out.println("B 학점");
		else if(n >= 70) System.out.println("A 학점");
		else if(n >= 60) System.out.println("D 학점");
		else System.out.println("F 학점");
	}
}
