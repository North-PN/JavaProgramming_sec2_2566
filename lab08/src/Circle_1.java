
public class Circle_1 {
		//declare attribute name 'radius'
		private double radius;
		private String color;
		//declare two no-static method in Class Circle
		public void setRadius(double r) {
			radius = r;
		}
		
		public double getArea() {
			return Math.PI * Math.pow(radius, 2);
		}
		
		public void setColor(String co) {
			color = co;
		}
		
		public String getColor() {
			return color;
		}
}
