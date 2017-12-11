import java.util.Scanner;

public class AreaCalculatorRepeat 

{
	
	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
	
		String shape = "0";
		double Area;
		
		while (shape.equals("0") || shape.equals("1") || shape.equals("2") || shape.equals("3") ||shape.equals("4"))
		{
		
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Circle");
		System.out.println("5) Quit");
		System.out.print("Which Shape: ");
		shape = keyboard.next();
		
		
			if (shape.equals("1"))
		
			{
				System.out.print("Base: ");
				int base = keyboard.nextInt();
				System.out.print("Height: ");
				int height = keyboard.nextInt();
				Area = triangle(base, height);
				System.out.println("The area is " + Area);
				System.out.println();
			}
			else if(shape.equals("2"))
			{
				System.out.print("Base: ");
				int base = keyboard.nextInt();
				System.out.print("Height: ");
				int height = keyboard.nextInt();
				Area = rectangle(base, height);
				System.out.println("The area is " + Area);
				System.out.println();
			}
			else if (shape.equals("3"))
			{
				System.out.print("Side: ");
				int side = keyboard.nextInt();
				Area = square(side);
				System.out.println("The area is " + Area);
				System.out.println();
			}
			else if (shape.equals("4"))
			{
				System.out.print("Radius: ");
				int radius = keyboard.nextInt();
				Area = circle(radius);
				System.out.println("The area is " + Area);
				System.out.println();
			}
		
		}
		System.out.println("Goodbye!!");
		keyboard.close();
	}
	
	public static double triangle(int a, int b)
	{
		double area = 0.5*a*b;
		
		return area;
	}
	
	public static double rectangle(int a, int b)
	{
		double area = a*b;
		
		return area;
	}
	
	public static double square(int a)
	{
		double area = a*a;
		
		return area;
		
	}
	
	public static double circle(int a)
	{
		double area = a*a*3.14;
		
		return area;
	}

}