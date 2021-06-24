import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		int n,flag=0;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		if(n==1)
		{
			System.out.println("Neither prime nor composite");
		}
		else
		{
			for(int i =2;i<n;i++)
			{
				if(n%i==0)
				{
					flag =1;
					break;
				}
			}
		}
		if(flag == 0)
			System.out.println("It is prime");
		else
			System.out.println("Not prime");

	}

}
