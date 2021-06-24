import java.util.Scanner;
public class pattern_10 {

	public static void main(String[] args) {
		
		int n;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		int i=1;
		int n3 = (n+1)/2;
		while(i<=n3)
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
		int n2= n - n3;
		int p = n2;
		while(p>0)
		{
			int space = 1, r=1;
			while(space <= n2 - p +3)
			{
				System.out.print(" ");
				space++;
			}
			while(r <= ((2*p)-1))
			{
				System.out.print("*");
				r++;
				
			}
			System.out.print("\n");
			p--;
		}
		
	}

}