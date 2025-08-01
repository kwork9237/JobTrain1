package _Report;

import java.util.Scanner;

public class Report_250731_01 {
	public static void main(String[] args) {
		// 입력 > 팩토리얼
		// 1번 과제
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		// 오버플로나면 알아서 0 출력됨
		System.out.println("결과 : " + factorial_1(s.nextInt()));
	}
	
	// 재귀호출
	public static int factorial_1(int input) {		
		if(input > 0)
			return input * factorial_1(input - 1);
		else
			return 1;
		
		// 0보다 크면 -1 해서 factorial 호출
		// input가 5일때
		// return 5 * factorial(5 - 1);
		// return 4 * factorial(4 - 1);
		// return 3 * factorial(3 - 1);
		// return 2 * factorial(2 - 1);
		// return 1 * factorial(1 - 1);  // 이거 이후로는 input > 0 조건에 걸려서 1 리턴
		// return 1;
		
		// 거슬러 올라간다
		// 1 * 1 리턴
		// 2 * 1 리턴
		// 2 * 3 리턴
		// 4 * 6 리턴
		// 5 * 24 리턴
	}
	
	
	// FOR 방식
	public static int factorial_2(int input) {
		int temp = 1;
		
		for(int i = input; i >= 1; i--)
			temp *= i;
		
		return temp;
	}
}
