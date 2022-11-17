
public class CarApp {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.brand ="Fiat";
		car1.model="Punto";
		car1.amountOfFuel=100;
		car1.printData();
		car1.accelerate();
		car1.Break();
		car1.printData();
		car1.refuel(100);
		car1.printData();		
				}

}
