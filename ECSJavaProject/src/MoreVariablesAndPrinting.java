
public class MoreVariablesAndPrinting 
{
	
	public static void main(String[] args) 
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
	
		
		myName = "Zed A. Shaw";
		myAge = 16;     // not a lie
		myHeight = 64;  // inches
		myWeight = 163; // lbs
		myEyes = "Blue";
		myTeeth = "White";
		myHair = "Brown";
		
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches (or " + (myHeight * 2.54) + " cm) tall.");
		System.out.println("He's " + myWeight + " pounds (or " + (myWeight * 0.454) + " kg) heavy.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + myEyes + " eyes and " +  myHair + " hair.");
		System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");
		
		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + "."  );
		
		//A: The String variables all allow word answers to any wanted variables. We can assign words to certain terms. 
		
		
	}

}
