package Train_250731;

import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("0 ~ 100 사이의 점수 입력");
		n = s.nextInt();
		
		if(n > 100) n = 100;
		
		switch(n / 10) {
			case 10:
			case 9:
				System.out.println("A 학점");
				break;
			case 8:
				System.out.println("B 학점");
				break;
			case 7:
				System.out.println("C 학점");
				break;
			case 6:
				System.out.println("D 학점");
				break;
			default:
				System.out.println("F 학점");
		}
	}
}
