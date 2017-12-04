import java.util.Scanner;

public class ALittleQuiz 
{ 
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String Answer1, Answer2, Answer3;
		int score;
		
		score = 0;
		
		//Question 1
		System.out.println("Q1: What is the capital of Russia?");
		System.out.println("	1) St. Petersburg");
		System.out.println("	2) Moscow");
		System.out.println("	3) Kiev");
		Answer1 = keyboard.next();
		
		if (Answer1.equals("2"))
		{
			System.out.println("That's correct!");
			
			score = score + 1;
		}
		else
		{ 
			System.out.println("Sorry, the correct answer is Moscow.");
		}
		
		
		//Question 2
		System.out.println("Q2: Who is Kylo Ren's father?");
		System.out.println("	1) Han Solo");
		System.out.println("	2) Luke Skywalker");
		System.out.println("	3) Anakin Skywalker");
		Answer2 = keyboard.next();
		
		if (Answer2.equals("1"))
		{
			System.out.println("That's correct!");
			
			score = score + 1;
		}
		else 
		{
			System.out.println("Sorry, the correct answer is Han Solo.");
		}
		
		
		//Question 3
		System.out.println("Q3: Which of the following is not a constellation?");
		System.out.println("	1) Taurus");
		System.out.println("	2) Aquila");
		System.out.println("	3) Betelguese");
		Answer3 = keyboard.next();
		
		if (Answer3.equals("3"))
		{
			System.out.println("That's correct!");
			
			score = score + 1;
		}
		else 
		{ 
			System.out.println("Sorry, the correct answer is Betelguese.");
		}
		
		//score
		System.out.println();
		System.out.println("Overall, you got " + score + " out of 3 correct.");
		System.out.println("Thanks for playing!");
	
		keyboard.close();
	}
}

