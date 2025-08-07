package Train_250806;

import java.util.Scanner;

public class NewCheckString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] identifyString = new String[2];
		int identifyNumber = -1;
		
		
		while(true) {
			try {
				System.out.print("주민번호 앞자리 (6자) 입력 : ");
				identifyString[0] = s.next();
				
				System.out.print("주민번호 뒷자리 (7자) 입력 : ");
				identifyString[1] = s.next();
				
				if(identifyString[0].length() != 6 || identifyString[1].length() != 7) {
					System.out.println("올바르지 않은 주민번호 입력");
				}

				else {
					identifyNumber = Integer.parseInt(identifyString[1].substring(0, 1));
					break;
				}
				
			}
			catch(Exception e) {
				System.out.println("!!!!");
			}
		}
		
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
