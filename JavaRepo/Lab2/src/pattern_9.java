import java.util.Scanner;
public class pattern_9 {

	public static void main(String[] args) {
		
		int n;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		for(int i=n; i>0;i--)
		{
			for(int space = 0;space<=n-i;space++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j<2*i;j++)
				System.out.print("*");
			System.out.print("\n");
		}
		
	}

}
