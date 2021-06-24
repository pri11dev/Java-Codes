import java.util.Scanner;
public class Odd_Even {
public static void main(String[] args)
{
	int n;
	System.out.print("Enter a number: ");
	Scanner inp = new Scanner(System.in);
	n = inp.nextInt();
	if(n%2==0)
		System.out.println("It is an even number");
	else
		System.out.println("It is an odd number");
}
}
