import java.util.Scanner;

public class MethodPass 
{
	public static void main(String[] args) 
	
	{
		Scanner keyboard =  new Scanner(System.in);
		
		System.out.println("Pick a number: ");
		int value = keyboard.nextInt();
		pass(value);
		
	
		keyboard.close();
		
	}
	
	public static void pass(int a)
	{
		
		
		if(a%3==0)
		{
			System.out.println("I like that number!"); 
		}
		else if(a%3!=0)
		{
			System.out.println("That number is gross...");
		}
		
		return ;
	}

}
