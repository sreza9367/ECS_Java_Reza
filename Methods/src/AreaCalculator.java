import java.util.Scanner;

public class AreaCalculator 

{
	
	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Circle");
		System.out.println("5) Quit");
		System.out.print("Which Shape: ");
		String shape = keyboard.next();
		
		if (shape.equals("1"))
		{
			System.out.print("Base: ");
			int base = keyboard.nextInt();
			System.out.print("Height: ");
			int height = keyboard.nextInt();
			triangle(base, height);
			
		}
		else if(shape.equals("2"))
		{
			System.out.print("Base: ");
			int base = keyboard.nextInt();
			System.out.print("Height: ");
			int height = keyboard.nextInt();
			rectangle(base, height);
		}
		else if (shape.equals("3"))
		{
			System.out.print("Side: ");
			int side = keyboard.nextInt();
			square(side);
		}
		else if (shape.equals("4"))
		{
			System.out.print("Radius: ");
			int radius = keyboard.nextInt();
			circle(radius);
		}
		
		keyboard.close();
	}
	
	public static double triangle(int a, int b)
	{
		double area = 0.5*a*b;
		System.out.println("The area is " + area);
		return area;
	}
	
	public static double rectangle(int a, int b)
	{
		double area = a*b;
		System.out.println("The area is " + area);
		return area;
	}
	
	public static double square(int a)
	{
		double area = a*a;
		System.out.println("The area is " + area);
		return area;
		
	}
	
	public static double circle(int a)
	{
		double area = a*a*3.14;
		System.out.println("The area is " + area);
		return area;
	}

}
