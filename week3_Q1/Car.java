package week3_Q1;

public class Car extends Vehicals {
	// Car-specific attribute
	int numberOfDoors;
	int seats;

	// Constructor
	public Car(String brand, String model, int topSpeed, String color, String fuelType, int price, int mileage,
			int numberOfDoors, int seats) {

		super(brand, model, topSpeed, color, fuelType, price, mileage);
		this.numberOfDoors = numberOfDoors;
		this.seats= seats;
	}

	// Overriding the displayInfo method
	@Override
	public void vehicalInfo() {
		super.vehicalInfo(); // Call from parent class method

		System.out.println("Number of Doors: " + numberOfDoors);
		System.out.println("Number of Seats in car: " + seats); 
	}
}
