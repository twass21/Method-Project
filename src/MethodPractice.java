import java.util.Scanner;

public class MethodPractice 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = in.nextLine();
		greeting(name);
		System.out.print("Enter a number to double: ");
		int myNum = in.nextInt();
		in.nextLine();
		
		int myDouble = doubleInt(myNum);
		System.out.println("My number Doubled: " + myDouble);
		System.out.println(sumThree(1,2,3));
	}
	
	public static void greeting(String arg1)
	{
		// arg1 = "Tyler";
		System.out.println("Hello, " + arg1);
		System.out.println("I hope you have a nice day");
	}
	
	public static int doubleInt(int num)
	{
		int newNum = num * 2;
		return newNum;
	}
	public static int sumThree(int num1, int num2, int num3)
	{
		int sum = num1 + num2 + num3;
		return sum;
	}
	
}
