package Train_250731;

import java.util.Scanner;

public class Oper07 {
	public static void main(String[] args) {
		// 5과목 점수 키보드 입력 > 합격및 불합격 처리
		// 과목당 과락 40, 평균 60점
		
		Scanner s = new Scanner(System.in);
		
//		v1(s);
		v2(s);
	}
	
	public static void v1(Scanner s)
	{
		int n1, n2, n3, n4, n5;
		double avg;
		
		// 초기화 (nextint써서 필요없음)
//		n1 = n2 = n3 = n4 = n5 = 0;
//		avg = 0.0;
		
		System.out.println("5과목 점수 입력");
		System.out.print("1번째 과목 점수 : ");
		n1 = s.nextInt();
		
		System.out.print("2번째 과목 점수 : ");
		n2 = s.nextInt();
		
		System.out.print("3번째 과목 점수 : ");
		n3 = s.nextInt();
		
		System.out.print("4번째 과목 점수 : ");
		n4 = s.nextInt();
		
		System.out.print("5번째 과목 점수 : ");
		n5 = s.nextInt();
		
		avg = (n1 + n2 + n3 + n4 + n5) / 5.0;
		
		if(n1 < 40 || n2 < 40 || n3 < 40 || n4 < 40 || n5 < 40)
			System.out.println("과목 중 과락 발생");
		
		else if(avg >= 60.0) {
			System.out.println("합격");
			System.out.println("평균점수 > " + avg);
		}
		
		else
			System.out.println("과목 평균점수 미달");
	}
	
	public static void v2(Scanner s) {
		int[] inp = new int[5];
		double tot = 0;
		
		for(int i = 0; i < inp.length; i++) {
			System.out.print((i + 1) + "번째 과목 점수 : ");
			inp[i] = s.nextInt();
			
			tot += inp[i];
		}
		tot = tot / 5.0;

		for(int i = 0; i < inp.length; i++) {
			if(inp[i] <= 40) {
				System.out.println("과락");
				return;
			}
		}
		
		if(tot >= 60) {
			System.out.println("합격");
			System.out.println("평균점수 > " + tot);
		}
		
		else
			System.out.println("평균점수 미달");
	}
}