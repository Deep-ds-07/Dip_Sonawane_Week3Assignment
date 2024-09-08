package week3_Q1;

public class Vehicals {
    // Attributes
    String Company;
    String model;
    int TopSpeed;
    String color;
    String fuelType;
    int price;
    int mileage;
    
    // Constructor
    public Vehicals(String Brand, String model, int TopSpeed, String color, String fuelType, int price, int mileage) {
        
    
        this.Company = Brand;
        this.model = model;
        this.TopSpeed = TopSpeed;
        this.color = color;
        this.fuelType = fuelType;
        this.price = price;
        this.mileage = mileage;
    }
    
    // Method to display vehicle information
    public void vehicalInfo() {
    	System.err.println("‼️‼️⚠️⚠️ Please Maintain your Speed while you are riding ⚠️⚠️‼️‼️");
    	
        
        System.out.println("Company: " + Company);
        System.out.println("Model: " + model);
        System.out.println("Top Speed: " + TopSpeed + "Km/h");
        System.out.println("Color: " + color);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage + "Km/l");
    }

	
}