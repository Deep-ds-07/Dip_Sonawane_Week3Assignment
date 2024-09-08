package week3_Q1;

public class MainClass {
	public static void main(String[] args) {
		Vehicals cr = new Car("Mahindra", "Thar", 220, "Black", "Diesel", 1900000, 18, 3,3);

		Bike bk = new Bike("Yamaha", "FZ", 180, "Red", "Petrol", 180000, 55, 5);
	
		System.out.println("‼️‼️ MY CAR INFORMATION ‼️‼️");
		cr.vehicalInfo();

		System.out.println();
		
		System.out.println("‼️‼️ MY SPORT BIKE INFORMATION ‼️‼️");
		bk.vehicalInfo();
	}
}
