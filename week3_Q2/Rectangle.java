package week3_Q2;

public class Rectangle extends Shapes {
	
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
   public double calculateArea() {
        return length * width;
    }
    
    public static Rectangle rectanglefromUser() {
    	System.out.println("You are Selected RECTANGLE\r\n"
    			+ "A four-sided shape with opposite sides equal and all angles 90°.\r\n"
    			+ "Area Formula:  Length×Width  \r\n"
    			+ "Perimeter Formula: 2×(Length+Width)\n"
    			+ "2×(Length+Width).");
    	
        System.out.print("Enter the LENGTH of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the WIDTH of the rectangle: ");
        double width = sc.nextDouble();

        return new Rectangle(length, width);
    }
}



