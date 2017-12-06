import java.util.Random;

public class ShorterDoubleDice 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		
		int one, two;
		
		System.out.println("Here comes the dice!");
		
		do
		{
			one = 1 + r.nextInt(6);
			two = 1 + r.nextInt(6);
			System.out.println("Roll #1: " + one);
			System.out.println("Roll #2: " + two);
			System.out.println("The total is " + (one + two));
		} while ( one != two);
		
	}

}
