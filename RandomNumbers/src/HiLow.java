import java.util.Random;
import java.util.Scanner;


public class HiLow 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int CPU, user;
		
		
		CPU = 1 + r.nextInt(100);
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		user = keyboard.nextInt();
		
		if (CPU == user)
		{
			System.out.println("That's it!");
		}
		else if (CPU > user)
		{
			System.out.println("Sorry that was too low. I was thinking of " + CPU);
		}
		else if (CPU < user)
		{
			System.out.println("Sorry that was too high. I was thinking of " + CPU);
		}
		
		keyboard.close();
	}

}
