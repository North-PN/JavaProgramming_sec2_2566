
public class TestCircle {

	public static void main(String[] args) {
		/*
		// declare two objects reference from Class Circle
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		//assign radius to the first circle and show all data
		c1.radius = 12.5 ;
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		//assign radius to the second circle and show area
		c2.radius = 5.5;
		System.out.println(c2.getArea());
		*/
		
		
		// declare two objects reference from Class Circle
		Circle_1 c1 = new Circle_1();
		Circle_1 c2 = new Circle_1();
		//assign radius to the first circle and show area
		//(using non-static method)
		c1.setRadius(12.5);
		System.out.println("Circle 1 \n"+"Area = "+c1.getArea());
		//invoke a method name 'showColor' (using static method)
		System.out.println(showColor("Rad"));
		//assign radius to the second circle and show area and color
		c2.setRadius(2.0);
		c2.setColor("red");
		System.out.println("Circle 2 \n"+"Area = "+c2.getArea()+"\nAnd the color is "+c2.getColor());
	}
	
	//declare a static method to show circle's color
	public static String showColor(String color) {
		return "The color is " + color;
	}

	}


