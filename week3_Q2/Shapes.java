package week3_Q2;

import java.util.Scanner;

public abstract class Shapes {

    protected static Scanner sc = new Scanner(System.in);

    public static void shapeInfo() {
    	System.out.println("‼️‼️‼️ HERE'S THE SOME INFORMATION ABOUT THE SHAPE ‼️‼️‼️");
    	
        System.out.println("shapes are geometric figures that have areas.");

        System.out.println("<<<<<<<[ 1. TRIANGLE ]>>>>>>\r\n"
                + "A polygon with three sides and three angles.\r\n"
                + "Triangle Types: Equilateral, Isosceles, Scalene, and Right-Angled.\r\n"
                + "Area Formula: 1/2×Base×Height");

        System.out.println();
        System.out.println("<<<<<<<[ 2. CIRCLE ]>>>>>>>\r\n"
                + "A round shape with all points equidistant from the center.\r\n"
                + "Area Formula: π×r×r\r\n"
                + "Circumference Formula: 2×π×r");

        System.out.println();
        System.out.println("<<<<<<<<[ 3. RECTANGLE ]>>>>>>>\r\n"
                + "A four-sided shape with opposite sides equal and all angles 90°.\r\n"
                + "Area Formula: Length×Width\r\n"
                + "Perimeter Formula: 2×(Length+Width)");

        System.out.println();
        System.out.println("<<<<<<<<[ 4. SQUARE ]>>>>>>>>>\r\n"
                + "A special type of rectangle where all four sides are equal.\r\n"
                + "Area Formula: Side×Side\r\n"
                + "Perimeter Formula: 4×Side");
    }

    // Abstract method that must be implemented by subclasses
   public abstract double calculateArea();
}
