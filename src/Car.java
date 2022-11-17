
public class Car {
	
	public String brand;
	public String model;
	public int amountOfFuel;

	
	public Car()
	{
		brand="";
		model="";
		amountOfFuel=0;
	}
	
	public Car(String brand, String model, int fuel)
	{
		this.brand=brand;
		this.model=model;
		this.amountOfFuel=fuel;
	}
	
	public void Break()
	{
		System.out.println("Car is breaking");
	}
	
	public void accelerate()
	{
		if(amountOfFuel > 0)
			{
				System.out.println("Car is accelerating");
				amountOfFuel--;
			}
		else
			{
			System.out.println("Car can't accelerate, lack of fuel");
			}
	}
	
	public void printData()
	{
		System.out.println("Car's brand: " + brand);
		System.out.println("Car's model: " + model);
		System.out.println("Amount of fuel: " + amountOfFuel);
	}
	
	public void refuel(int amount)
	{
		System.out.println("Fuel on the tank: " + amountOfFuel);
		System.out.println("Refuel: " + amount);
		amountOfFuel += amount;
		System.out.println("Fuel on the tank after the refuel: " + amountOfFuel);
	}
}
