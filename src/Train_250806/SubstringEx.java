package Train_250806;

import java.util.Scanner;

public class SubstringEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String jbun = null;
		int identify;
		
		System.out.println("주민번호 입력 : ");
		jbun = s.next();
		
		identify = Integer.parseInt(jbun.substring(jbun.indexOf("-") + 1, jbun.indexOf("-") + 2));
//		System.out.println();
		
		
		// v1
		if(identify == 1 || identify == 3)
			System.out.println("남자");
		
		else if (identify == 2 || identify == 4)
			System.out.println("여자");
		
		else
			System.out.println("Unknown");
		
		
		// v2
		char c = jbun.charAt(jbun.indexOf("-") + 1);
		
		if(c == '1' || c == '3')
			System.out.println("남자");
		
		else if (c == '2' || c == '4')
			System.out.println("여자");
		
		else
			System.out.println("Unknown");
	}
}
