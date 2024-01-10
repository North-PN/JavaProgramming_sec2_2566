
public class TestCircleA {

	public static void main(String[] args) {
		// declare two objects reference from Class Circle
			Circle_1 c1 = new Circle_1();
			Circle_1 c2 = new Circle_1();
			Circle_1 c3 = new Circle_1();
			//assign radius to the first circle and show area
			//(using non-static method)
			c1.setRadius(2.0);
			c1.setColor("Blue");
			System.out.println("Circle 1 \n"+"Area = "+c1.getArea()+"\nAnd the color is "+c1.getColor());
			System.out.println();
			
			//assign radius to the second circle and show area and color
			c2.setRadius(12.5);
			c2.setColor("Red");
			System.out.println("Circle 2 \n"+"Area = "+c2.getArea()+"\nAnd the color is "+c2.getColor()); 
			System.out.println();
			
			//assign radius to the Third circle and show area and color
			c3.setRadius(3.14);
			c3.setColor("Blue");
			System.out.println("Circle 3 \n"+"Area = "+c3.getArea()+"\nAnd the color is "+c3.getColor()); 
	}
	
	
}
