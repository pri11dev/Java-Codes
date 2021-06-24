import java.util.Scanner;
public class frac_sum {

	public static void main(String[] args) {
		double n;double sum=0.0;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		if(n>1)
		{
			for(int i=1;i<n-1;i++)
			{
				System.out.print(i+"/"+(i+1)+"+");
				sum+=(double)(i)/(double)(i+1);
			}
			System.out.print(n-1+"/"+n +" =" );
			sum+= (double)(n-1)/(double)(n);
			System.out.print('\n');
			System.out.printf("%.2f",sum);
		}

	}

}
