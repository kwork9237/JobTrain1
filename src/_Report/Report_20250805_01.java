package _Report;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MemberInfo1 {
	private String name;
	private int age;
	private String email;
	private String address;
	
//	public MemberInfo1(String name, int age, String email, String address) {
//		this.name = name;
//		this.age = age;
//		this.email = email;
//		this.address = address;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void PrintMemberInfo() {
		System.out.println("회원정보");
		System.out.printf("NAME    : %s\n", name);
		System.out.printf("AGE     : %d\n", age);
		System.out.printf("E-MAIL  : %s\n", email);
		System.out.printf("ADDRESS : %s\n", address);
		System.out.println();
	}
}

public class Report_20250805_01 {
	public static List<MemberInfo1> members = new ArrayList<MemberInfo1>();
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			PrintMenu();
			
			switch(s.nextInt()) {
				case 1:
					members.add(InputMember());
					System.out.println("회원정보 추가 완료");
					break;
					
				case 2:
					PrintMemberInMembers();
					break;
					
				case 3:
					PrintAllMembers();
					break;
					
				case 99:
					System.out.println("프로그램 종료");
					return;
			}
		}
	}
	
	public static void PrintMenu() {
		System.out.println("1. 멤버 데이터 입력");
		System.out.println("2. 멤버 데이터 출력");
		System.out.println("3. 모든 멤버 데이터 출력");
		System.out.println("99. 종료");
	}
	
	public static MemberInfo1 InputMember() {
		MemberInfo1 m = new MemberInfo1();
		
		System.out.print("이름 입력 : ");
		m.setName(s.next());
		
		while(true) {
			try {
				System.out.print("나이 입력 : ");
				m.setAge(s.nextInt());
				break;
			}
			catch(Exception e) {
				System.out.println("정수만 입력 가능합니다.");
				s.nextLine();
			}
		}
		
		System.out.print("메일 입력 : ");
		m.setEmail(s.next());
		
		System.out.print("주소 입력 : ");
		m.setAddress(s.next());
		
		return m;
	}
	
	public static void PrintMemberInMembers() {
		if(members.size() == 0) {
			System.out.println("회원정보가 없습니다.");
			return;
		}
		
		
		int tempNumber;
		
		System.out.println("회원 수 : " + members.size());
		System.out.print("몇 번째 회원을 출력하시겠습니까?");
		tempNumber = s.nextInt();
		
		if(tempNumber > members.size()) {
			System.out.println("존재하지 않는 회원입니다.");
			return;
		}
		
		members.get(tempNumber - 1).PrintMemberInfo();
	}
	
	public static void PrintAllMembers() {
		for(int i = 0; i < members.size(); i++)
			members.get(i).PrintMemberInfo();
	}
}
