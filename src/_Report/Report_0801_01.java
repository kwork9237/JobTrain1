package _Report;

import java.util.Arrays;
import java.util.Scanner;

public class Report_0801_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		int min, max;
		
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		
		System.out.println("숫자 5개 입력");
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		//방안 1
		for(int i=0; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
			
			if(arr[i] > max)
				max = arr[i];
		}
		
		//방안 2
//		Arrays.sort(arr);
//		max = arr[arr.length - 1];
//		min = arr[0];
		
		System.out.println("MIN : " + min);
		System.out.println("MAX : " + max);
	}
}
