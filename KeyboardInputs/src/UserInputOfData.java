import java.util.Scanner;

public class UserInputOfData 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String firstName, lastName, login;
		int grade, studentID;
		double GPA;
		//Input area
		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		System.out.print("First name: ");
		firstName = keyboard.next();
		
		System.out.print("Last name: ");
		lastName = keyboard.next();
		
		System.out.print("Grade (9-12): ");
		grade = keyboard.nextInt();
		
		System.out.print("Student ID: ");
		studentID = keyboard.nextInt();
		
		System.out.print("Login: ");
		login = keyboard.next();
		
		System.out.print("GPA (0.0-4.0): ");
		GPA = keyboard.nextDouble();
	
		System.out.println();
		//Output area
		
		System.out.println("Your information:");
		
		System.out.println("Login: " + login);
		System.out.println("ID: " + studentID);
		System.out.println("Name: " + lastName + ", " + firstName);
		System.out.println("GPA: " + GPA);
		System.out.println("Grade: " + grade);
		
	}

}
