import java.util.Scanner;

public class HowOldSpecifically 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("Hey, what's your name? ");
		name = keyboard.next();
		
		System.out.println("Ok " + name + ", how old are you?");
		age = keyboard.nextInt();
		
		if ( age < 16)
		{ 
			System.out.println("You cannot drive, " + name + ".");
		}
		else if (age >= 16 && age < 18)
		{
			System.out.println("You can drive but not vote, " + name + ".");
		}
		else if (age >= 18 && age < 25)
		{
			System.out.println("You can vote but not rent a car, " + name + ".");
		}
		else 
		{
			System.out.println("You can pretty much do whatever you want, " + name + ".");
		}
		
		keyboard.close();
	}

}
