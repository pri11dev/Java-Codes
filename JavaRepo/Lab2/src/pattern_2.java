import java.util.Scanner;
public class pattern_2 {

	public static void main(String[] args) {
		int n;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(i);
			System.out.print("\n");
		}

	}

}
