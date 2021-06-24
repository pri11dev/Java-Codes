import java.util.Scanner;
public class table {
public static void main(String[] args)
{
	int num;
	System.out.println("Enter the number for the table : ");
	Scanner n = new Scanner(System.in);
	num = n.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(num+"*"+i+"="+num*i);
	}
}
}
