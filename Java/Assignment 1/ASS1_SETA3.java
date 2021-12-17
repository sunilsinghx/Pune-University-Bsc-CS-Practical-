import java.util.Scanner;
public class ASS1_SETA3
{
	public static void main(String args[])
	{
		int choice;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("1. volume of cylinder");
			System.out.println("2. factorial of number");
			System.out.println("3. check the number is armstrong or not");
			System.out.println("4. exit");
			System.out.println("5. enter your choice");
			choice = in.nextInt();
		
			switch(choice)
			{
				case 1:
					System.out.print("height and radius of cylinder");
					int height=in.nextInt();
					int radius=in.nextInt();
					double pie=3.14285714286;
					double volume=pie*(radius*radius)*height;
					System.out.println("volumeof the cylinder"+volume);
					break;
				case 2:
					System.out.print("enter a number:");
					int n=in.nextInt();
					int factorial = 1;
					for(int i = 1; i <= n; ++i)
					{
						// factorial = factorial * i;
						factorial *= i;
					}
					System.out.println("factorial of "+n+" is: "+factorial);
					break;
				case 3:
					int number , originalNumber, remaider, result = 0;
					System.out.print("enter a number:");
					int num=in.nextInt();
					originalNumber = num;
					while (originalNumber !=0)	
					{
						remaider = originalNumber % 10;
						result += Math.pow(remaider, 3);
						originalNumber /=10;
					}
					if(result == num)
						System.out.println(num + " is an is armstrong number:");
					else
						System.out.println(num + " is not an armstrong number:");	
					break;
				default:
					System.out.println("wrong choice! please select from 1 or 2 or 3,");
			}
		}while(choice!=4);
	}
}

