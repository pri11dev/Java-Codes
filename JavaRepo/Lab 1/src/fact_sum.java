import java.util.Scanner;
public class fact_sum {

	public static void main(String[] args) {
		int n,sum=0,fact=1;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		for(int i=1;i<=n;i++)
		{
			int j =i;
			while(j>0)
			{
				fact*=j;
				j--;
			}
			sum+=fact;
			fact =1;
		}
		System.out.println("The sum of factorial series upto " + n + " = "+ sum );
	}

}
