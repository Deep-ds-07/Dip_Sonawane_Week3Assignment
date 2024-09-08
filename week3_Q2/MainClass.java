package week3_Q2;

import java.util.Scanner;

public class MainClass {
    
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        
        Shapes.shapeInfo(); // Printed the shape information
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to find its area:");
        System.out.println("1. CIRCLE");
        System.out.println("2. RECTANGLE");
        System.out.println("3. TRIANGLE");
        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();

        Shapes shape = null;

        switch (choice) {
            case 1:
                shape = Circle.circleFromUser();
                break;

            case 2:
                shape = Rectangle.rectanglefromUser();
                break;

            case 3:
                shape = Triangle.triangleFromUser();
                break;

            default:
                System.err.println("Invalid Selection. Please select right one (1,2,3)");
                return; 
        }

        // If a valid shape was created, calculate and print its area
        if (shape != null) {
            System.out.println("The area of the selected shape is: " + shape.calculateArea());
        }

        scanner.close(); // Close scanner
    }
}

