import java.util.Scanner;

public class prime_factorial {

	public static void main(String[] args) {
		int n,flag=0,mul=1;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		for(int i = 2;i<n;i++)
		{
			if(n%i==0)
			{
				for(int j =2; j<i;j++)
				{
					if(i%j==0)
					{
						flag = 1;
						break;
					}
					
				}
				if(flag==0)
					mul = mul*i;
			}
		}
		System.out.println("The prime factorial of "+n+" = "+mul);
	}

}
