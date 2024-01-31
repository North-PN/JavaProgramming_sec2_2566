
public abstract class Shape {
	private String color;
	
	public Shape(String color){
		this.color = color ;
	}
	Shape(){
		this.color = "";	//return null;
	}
	
	public abstract double getArea();
	
	public String toString() {
		return "Color("+color+")";
	}
}