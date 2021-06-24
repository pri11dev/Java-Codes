import java.util.Scanner;
public class square_series {

	public static void main(String[] args) {
		int n, sum_of_squares=0;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		for(int i=1;i<=n;i++)
			sum_of_squares+= i*i;
		System.out.println("The sum of squares upto "+ n+"="+sum_of_squares);
	}

}
