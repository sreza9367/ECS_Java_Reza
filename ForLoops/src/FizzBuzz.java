
public class FizzBuzz 
{
	public static void main(String[] args) 
	{
		for ( int n = 0; n <= 100; n = n + 1)
		{
			if (n%15==0)
			{
				System.out.println("FizzBuzz");
			}
			else if (n%3==0)
			{
				System.out.println("Fizz");
			}
			else if (n%5==0)
			{
				System.out.println("Buzz");
			}
			else 
			{ 
				System.out.println(n);
			}
			
		}
	}

}