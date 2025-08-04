package _Report;

public class Report_0801_02 {

	public static void main(String[] args) {
		int[][] arr = {
			{ 85, 60, 70 },
			{ 90, 95, 80 },
			{ 75, 80, 100 },
			{ 80, 70, 95 },
			{ 100, 65, 80 },
		};
		
		int[] subject = new int[3];
		String[] subjectName = { "국어", "영어", "수학" };
		
		int[] student = new int[5];
		String[] studentName = { "A", "B", "C", "D", "E" };
		int i, j;
		
		// 학생 총점
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 3; j++) {
				student[i] += arr[i][j];
			}
		}
		
		// 과목 총점
		for(j = 0; j < 3; j++) {
			for(i = 0; i < 5; i++) {
				subject[j] += arr[i][j];
			}
		}
		
		// 학생별 총점
		for(i = 0; i < student.length; i++) {
			System.out.println(studentName[i] + "학생의 총점 : " + student[i]);
			
//			개별 성적임
//			System.out.println("과목별 성적");
//			
//			for(j = 0; j < 3; j++)
//				System.out.println(subjectName[j] + " : " + arr[i][j]);
//			
//			System.out.println();
		}
		
		// 과목별 총점
		for(i = 0; i < subject.length; i++) {
			System.out.println(subjectName[i] + "의 총점 : " + subject[i]);
		}
		
		
	}

}
