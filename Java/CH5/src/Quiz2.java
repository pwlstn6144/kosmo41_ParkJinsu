import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		int score;
		int sum = 0;
		
		Scanner a = new Scanner(System.in);
		System.out.println("횟수를 입력하시오");
		int num1 = a.nextInt();

		/*while(num2 <= num1)
		{
			System.out.println("수를 입력하시오");
			score = a.nextInt();
			sum = sum + score;
			num2++;
		}
		*/
		for(int num2 = 1; num2 <= num1; num2++)
		{
			System.out.println("수를 입력하시오");
			score = a.nextInt();
			sum = sum + score;
		}
		double avg = (double)sum / (double)num1;
		System.out.println("입력하신 정수의 평균 값은 " + avg + "입니다");
		
		

	}

}
