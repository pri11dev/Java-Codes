import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int n,i,fact =1;
		System.out.println("Enter the number");
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		i = n;
		while(i>0)
		{
			fact*=i;
			i--;
		}
		System.out.println("The factorial of "+n+"="+fact );
	}

}
