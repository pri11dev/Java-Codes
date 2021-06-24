import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		int n,rem=0,i,sum=0;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		i=n;
		while(i>0)
		{
			rem = i%10;
			sum+=(rem*rem*rem);
			i/=10;
		}
		if(sum==n)
		{
			System.out.println("It is a Armstrong number");
		}
		else
			System.out.println("Not a Armstrong number");
	}

}
