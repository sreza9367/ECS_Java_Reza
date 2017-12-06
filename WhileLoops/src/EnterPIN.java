import java.util.Scanner;

public class EnterPIN 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		
		System.out.println("Welcome to the Bank of Mitchell.");
		System.out.print("Enter your PIN: ");
		int entry = keyboard.nextInt();
		
		while ( entry != pin)
		{ 
			System.out.println("\nIncorrect PIN. Try again.");
			System.out.print("Enter your PIN: "); 
			entry = keyboard.nextInt();
		}
		
		System.out.println("\nPIN accepted. You not have acess to your account.");
		
		keyboard.close();
		
		
	}

}
