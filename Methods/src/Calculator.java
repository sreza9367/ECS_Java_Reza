import java.util.Scanner;


public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int cont = 0;
		System.out.println("This is a calculator!");
		System.out.println("Insert you calculation as '### operator ###'");
		do 
		{System.out.print("> ");
		double num1 = keyboard.nextInt();
		String opp = keyboard.next();
		double num2 = keyboard.nextInt();
		
		if (opp.equals("+"))
		{
			double answer = addition(num1, num2);
			System.out.println(answer);
		}
		else if (opp.equals("-"))
		{
			double answer = subtraction(num1, num2);
			System.out.println(answer);
		}
		else if (opp.equals("*"))
		{
			double answer = multiplication(num1, num2);
			System.out.println(answer);
		}
		else if (opp.equals("/"))
		{
			double answer = division(num1, num2);
			System.out.println(answer);
		}
		else if (opp.equals("^"))
		{
			double answer = exponent(num1, num2);
			System.out.println(answer);
		}
		System.out.println();
		}while(cont == 0);
		
	keyboard.close();
	}
	
	public static double addition(double a, double b)
	{
		double c = a + b;
		
		return c;
	}
	
	public static double subtraction(double a, double b)
	{
		double c = a - b;
		
		return c;
	}
	
	public static double multiplication(double a, double b)
	{
		double c = a*b;
		
		return c;
		
	}

	public static double division(double a, double b)
	{
		double c = a/b;
		
		return c;

	}
	
	public static double exponent(double a, double b)
	{
		double c = Math.pow(a,b);
		
		return c;
	}
	
}
