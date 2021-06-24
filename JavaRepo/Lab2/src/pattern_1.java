import java.util.Scanner;
public class pattern_1 {

	public static void main(String[] args) {
		int n;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.print("\n");
		}

	}

}
