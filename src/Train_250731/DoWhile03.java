package Train_250731;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String input = null;
		
		System.out.println("메시지 입력");
		System.out.println("종료하려면 q 입력");
		
		do {
			input = s.nextLine();
			System.out.println("output > " + input);
		} while(input.equals("q"));
	}

}
