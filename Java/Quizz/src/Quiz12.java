
public class Quiz12 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		do
		{
			System.out.print(num);
			if(num < 1000)
			{
				System.out.print("+");
			}
			sum = sum + num;
			num++;
		}while(num <= 1000);
		System.out.println("="+sum);
		

	}

}
