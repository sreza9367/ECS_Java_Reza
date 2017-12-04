import java.util.Scanner;

public class TwoQuestions 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String answer1, answer2;
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try and guess what it is!");
		
		System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
		answer1 = keyboard.next();
		
		System.out.println("Question 2) Is it bigger than a breadbox?");
		answer2 = keyboard.next();
		
		if (answer1.equals("animal") && answer2.equals("no"))
		{
			System.out.println("Is it a squirrel?");
		}
		else if (answer1.equals("animal") && answer2.equals("yes"))
		{
			System.out.println("Is it a moose?");
		}
		else if (answer1.equals("vegetable") && answer2.equals("no"))
		{
			System.out.println("Is it a carrot?");
		}
		else if (answer1.equals("vegetable") && answer2.equals("yes"))
		{
			System.out.println("Is it a watermelon?");
		}
		else if (answer1.equals("mineral") && answer2.equals("no"))
		{
			System.out.println("Is it a paper clip?");
		}
		else if (answer1.equals("mineral") && answer2.equalsIgnoreCase("yes"))
		{
			System.out.println("Is it a Camaro?");
		}
		
		keyboard.close();
	}

}
