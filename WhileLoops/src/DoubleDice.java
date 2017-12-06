import java.util.Random;

public class DoubleDice 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		
		int one, two;
		
		one = 1 + r.nextInt(6);
		two = 1 + r.nextInt(6);
		
		System.out.println("Here comes the dice!");
		
		while ( one != two)
		{
		System.out.println("Roll #1: " + one);
		System.out.println("Roll #2: " + two);
		System.out.println("The total is " + (one + two));
		one = 1 + r.nextInt(6);
		two = 1 + r.nextInt(6);
		}
		
		System.out.println("Roll #1: " + one);
		System.out.println("Roll #2: " + two);
		System.out.println("The total is " + (one + two));
	}

}
