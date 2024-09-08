package week3_Q2;

public class Circle extends Shapes {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    //  taking user input and create a Circle object
    public static  Circle circleFromUser() {
    	
        // used Scanner from the Shapes class
    	
        System.out.println("You are Selectedt CIRCLE \r\n" 
        		+"PROPERTIES OF CIRCLE : A circle is a shape where every point on the boundary is equidistant from a central point (the center).\r\n"
                + "AREA FORMULA: Area = π×r×r   \r\n"
                + "r: The radius, or the distance from the center to any point on the circle.\r\n"
                + "Perimeter (Circumference) Formula:\r\n"
                + "Circumference=2×π×r\r\n"
                + "(The distance around the boundary of the circle.)");

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        return new Circle(radius);
    }
}
