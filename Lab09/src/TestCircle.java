
public class TestCircle {

	public static void main(String[] args) {
		// Test all constructors and toString()
		Circle c1 = new Circle(1.1, "blue");
		System.out.println(c1+"\n");
		// implicitly run toString()
		//System.out.println(c1.toString);
		
		//Circle[radius=1.1, color=blue]
		Circle c2 = new Circle(2.2);
		System.out.println(c2+"\n");
		//Circle[radius=2.2, color=red]
		
		Circle c3 = new Circle();//1st (default Constructor)
		System.out.println(c3+"\n");
		//Circle[radius=1.0, color=red]
		
		// Test Setters and Getter
		System.out.println("Test Setters and Getters");
		c1.setRadius(3.3);
		c1.setColor("Green");
		System.out.println(c1);
		System.out.println("The Radius of c1 is: "+c1.getRadius());
		System.out.println("The Color  of c1 is: "+c1.getColor());
		//Test getArea() and getCircumference()
		//printf(C code) => format number
		//System.out.println("", );
		System.out.printf("The Area is : %.2f%n",c1.getArea());//%.2f->0.00 & %n->\n
		System.out.printf("the Circumference is : %.3f",c1.getCircumference());
	}

}
