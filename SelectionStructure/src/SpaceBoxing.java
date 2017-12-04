import java.util.Scanner;

public class SpaceBoxing 
{
	public static void main(String[] args) 
	{ 
		Scanner keyboard = new Scanner(System.in);
		
		String planet;
		int weight;
		
		System.out.print("Please enter your current earth weight: ");
		weight = keyboard.nextInt();
		
		
		System.out.println();
		System.out.println("I have information for the following planets:");
		System.out.println("1. Venus    2. Mars    3. Jupiter");
		System.out.println("4. Saturn   5. Uranus  6. Neptune");
		
		
		System.out.println();
		System.out.println("Which planet are you visiting?");
		planet = keyboard.next();
		
		System.out.println();
		if (planet.equals("Venus"))
		{
			System.out.println("Your weight would be " + (weight * 0.78) + " pounds on that planet.");
		}
		else if (planet.equals("Mars"))
		{
			System.out.println("Your weight would be " + (weight * 0.39) + " pounds on that planet.");
		}
		else if (planet.equals("Jupiter"))
		{
			System.out.println("Your weight would be " + (weight * 2.65) + " pounds on that planet.");
		}
		else if (planet.equals("Saturn"))
		{
			System.out.println("Your weight would be " + (weight * 1.17) + " pounds on that planet.");
		}
		else if (planet.equals("Uranus"))
		{
			System.out.println("Your weight would be " + (weight * 1.05) + " pounds on that planet.");
		}
		else if (planet.equals("Neptune"))
		{
			System.out.println("Your weight would be " + (weight * 1.23) + " pounds on that planet.");
		}
	
		keyboard.close();
	}
	
}
