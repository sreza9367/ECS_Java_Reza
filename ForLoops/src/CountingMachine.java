import java.util.Scanner;

public class CountingMachine 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Count to: ");
		int to = keyboard.nextInt();
		
		for (int n = 0; n <= to; n = n + 1)
		{
			System.out.print(n + " ");
		}
		keyboard.close();
		
	}

}