package Train_250806;

import java.util.Scanner;

public class CheckString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String identifyString;
		String[] splitResult;
		
		while(true) {
			try {
				System.out.println("주민번호 입력 : ");
				identifyString = s.next();
				splitResult = identifyString.split("-");
				
				if(splitResult.length == 2) {
					if(splitResult[0].length() == 6 && splitResult[1].length() == 7) {
						break;
					}
				}
				
				System.out.println("주민번호 형식대로 입력하세요.");
				System.out.println("XXXXXX-XXXXXXX\n");
			}
			catch (Exception e) {
				System.out.println("주민번호 형식대로 입력하세요.");
				System.out.println("XXXXXX-XXXXXXX\n");
			}
		}
		
		
		int identifyNumber = Integer.parseInt(splitResult[1].substring(0, 1));
		
		if(identifyNumber == 1 || identifyNumber == 3) {
			System.out.println("남");
		}
		else if(identifyNumber == 2 || identifyNumber == 4) {
			System.out.println("여");
		}
		else {
			System.out.println("??");
		}
	}
}
