import java.util.Scanner;
public class pattern_7 {

	public static void main(String[] args) {
		
		int n;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		int i=1,t=1;
		while(i<=n)
		{
			int j =1;
			while(j<=(2*i-1))
			{
				System.out.print(t+" ");
				t+=2;
				j++;
				
			}
			System.out.print('\n');
			i++;
		}
	}

}
