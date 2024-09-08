package week3_Q1;

public class Bike extends Vehicals {
	int NoofGears;

	public Bike(String Company, String model, int TopSpeed, String color, String fuelType, int price, int mileage, int NoofGears) {
		super(Company, model, TopSpeed, color, fuelType, price, mileage);
		
		   
		        this.NoofGears = NoofGears;
		    }

		    
		    @Override
		    public void vehicalInfo() {
		        super.vehicalInfo(); // Call from parent class method
		        
		        
		        System.out.println("NumberOfGears: " + (NoofGears ));
		    }
		}



