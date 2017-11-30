
public class VariablesAndNames 
{
	public static void main ( String[] args )
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		
		//This provides total amount of cars available 
		cars = 100;
		//This provides how many people each car can hold
		space_in_a_car = 4.0;
		//This provides how many drivers are available to actually drive
		drivers = 30;
		//This provides how many passengers that need to be transported
		passengers = 90;
		//This gives how many cars that will not be used because of the limited amount of drivers
		cars_not_driven = cars - drivers;
		//This gives how many cares will be used.
		cars_driven = drivers;
		//This gives how many spaces are available for passengers
		carpool_capacity = cars_driven * space_in_a_car;
		//This provides the math behind how many passengers need to be put in each car used.
		average_passengers_per_car = passengers / cars_driven;
		
		System.out.println("There are " + cars + " cars available. " );
		System.out.println("There are only " + drivers + " drivers available.");
		System.out.println("There will be " + cars_not_driven + " empty cars today.");
		System.out.println("We can transport " + carpool_capacity + " people today.");
		System.out.println("We have " + passengers + " to carpool today.");
		System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
		
		
		//A: the 4.0 is not necessary since the zero is an unneeded integer. It is used because the space_in_a_car is a double integer.
		//C: = provides a variable answer but == is an actual math equation that gives an integer value.
		
			
	}

}
