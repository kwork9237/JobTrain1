package Train_250731;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd = 0, even = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) odd += i;
			else even += i;
		}
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
