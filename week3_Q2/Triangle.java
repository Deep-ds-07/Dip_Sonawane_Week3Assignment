package week3_Q2;

class Triangle extends Shapes {
	
    double base; 
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    
    public static Triangle triangleFromUser() {
    	
    	   System.out.println("You are Selected TRIANGLE\r\n"
           		+ "A polygon with three sides and three angles.\r\n"
           		+ "Types: Equilateral, Isosceles, Scalene, and Right-Angled.\r\n"
           		+ "Area Formula: 1/2×Base×Height"  	);
    	   
    	
        System.out.print("Enter the BASE of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the HEIGHT of the triangle: ");
        double height = sc.nextDouble();
        
        return new Triangle(base, height);
        
    }   
    @Override
	
    public double calculateArea() {
        return 0.5 * base * height;  // 1/2*base*height
    }
    
}
