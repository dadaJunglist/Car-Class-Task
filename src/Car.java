
public class Car {
	
	public String brand;
	public String model;
	public int amountOfFuel;

	public void brake()
	{
		System.out.println("Car is breaking");
	}
	
	public void accelerate()
	{
		System.out.println("Car is accelerating");
	}
	
	public void printData()
	{
		System.out.println("Car's brand: " + brand);
		System.out.println("Car's model: " + model);
		System.out.println("Amount of fuel: " + amountOfFuel);
	}
	
}
