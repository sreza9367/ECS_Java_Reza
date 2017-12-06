import java.util.Scanner;
import java.util.Random;

public class NumbGuessCount
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int real = 1 + r.nextInt(10);
		int tries = 0;
		int guess = 0;
		System.out.println("I have chosen a number between 1 and 10. Try to guess it." );

		
		do
		{
			
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
			System.out.println("That's incorrect. Guess Again.");
			tries++;
			
		} while (guess != real);
		
			
		System.out.println("That's right! You're a good guesser.");
		System.out.println("It only took you " + tries + " tries.");
		
		keyboard.close();
	}

}
