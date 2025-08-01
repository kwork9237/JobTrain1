package Train_250801;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] j = new int[5];
		int sum = 0;
		
		System.out.println("점수입력 5개");
		for(int i = 0; i < j.length; i++) {
			j[i] += s.nextInt();
			sum += j[i];
		}
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.2f", (double)sum / 5);
			
	}

	public static void temp() {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++)
			sum += scores[i];
		
		double avg = (double) sum / 3;
		
		System.out.printf("avg : %.2f", avg);
	}
}
