import java.util.Scanner;
public class leap {
	public static void main(String[] args)
	{ int y;
	System.out.print("Enter the year: ");
	Scanner year = new Scanner(System.in);
	y = year.nextInt();
	if(y%4==0)
		System.out.println("It is a leap number");
	else
		System.out.println("It is not a leap number");
		}
}