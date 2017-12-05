import java.util.Scanner;

public class BMICalcBetter 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		double feet, inches, weight, weightkg, heightm, BMI;
		
		System.out.println("BMI (Body Mass Index) is a way of representing your size");
		System.out.println();
		
		System.out.println("How many feet tall are you?");
		feet = keyboard.nextInt();
		
		System.out.println("How many inches?");
		inches = keyboard.nextInt();
		
		System.out.println("How many pounds do you weigh?");
		weight = keyboard.nextInt();
		
		heightm = (feet*0.3048) + (inches*0.0254);
		weightkg = (weight*0.4536);
		
		BMI = (weightkg)/((heightm)*(heightm));
		
		System.out.println("Your BMI is: " + BMI);
		
		if (BMI < 18.5)
		{ 
			System.out.println("You are underweight.");
		}
		else if (BMI >= 18.5 && BMI < 25.0)
		{ 
			System.out.println("You are normal.");
		}
		else if (BMI >= 25.0 && BMI < 30.0)
		{
			System.out.println("You are overweight.");
		}
		else 
		{
			System.out.println("You are obese.");
		}
		
		keyboard.close();
	}
}
