package Train_250731;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int i = 1, inp;
		
		System.out.print("구구단 단 입력 > ");
		inp = s.nextInt();
		
		
		while(i <= 9) {
			System.out.println(inp + " * " + i + " = " + inp * i);
			
			i++;
		}
	}

}
