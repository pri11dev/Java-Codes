import java.util.Scanner;
public class pattern_5 {

	public static void main(String[] args) {
		
		int n;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		int i=1;
		while(i<=n)
		{
			int j =1,num1=1,k=1;
			while(num1<=n-i) {
				System.out.print(" ");
				num1++;
			}
			while(j<=i)
			{
				System.out.print("*");
				j++;
				
			}
			while(k<i)
			{
				System.out.print("*");
				k++;
				
			}
			System.out.print('\n');
			i++;
		}
	}

}