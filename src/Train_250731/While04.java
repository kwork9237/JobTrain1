package Train_250731;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		
		i = 2;
		
		while(i <= 9) {
			j = 1;
			
			System.out.println(i + "단");
			
			while(j <= 9) {
				System.out.println(i + " * " + j + " = " + i * j);
				j++;
			}
			
			i++;
			System.out.println();
		}
	}

}
