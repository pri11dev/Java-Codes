import java.util.Scanner;
public class perfect_num {

	public static void main(String[] args) {
		int n,i,sum=0;
		System.out.println("Enter the number");
		Scanner j = new Scanner(System.in);
		n = j.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println("It is a perfect  number");
		else
			System.out.println("Not a perfect number");
	}

}
