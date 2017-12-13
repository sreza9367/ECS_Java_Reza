import java.util.Scanner;


public class FindingPrimes 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int low, high;
		
		System.out.println("We are going to find some Primes!");
		System.out.println("What range would you like them in?");
		System.out.println("(only positive integers 2 or greater)");
		
		System.out.print("Low end: ");
		low = keyboard.nextInt();
		
		System.out.print("High end: ");
		high = keyboard.nextInt();
		
		for( int n = low ; n <= high ; n = n + 1 )
		{
			System.out.print(n + " ");
			String extra = prime(n);
			System.out.println(extra);

		}
		
		keyboard.close();
	}
	
	public static String prime(int a)
	{
		String b;
		if (a%2==0 && a != 2)
		{
			b = " ";
		}
		else if (a%3==0 && a != 3)
		{
			b = " ";
		}
		else if (a%5==0 && a != 5)
		{
			b = " ";
		}
		else if (a%7==0 && a != 7)
		{ 
			b = " ";
		}
		else
			b = "<";
		
		return b;
	}

}