
public class Rectangle2 implements Shape2{
	private double width;
	private double length;
	
	Rectangle2(double width,double length,String color){
		this.width = width;
		this.length = length;
	}
	
	public double getWild() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	
	public double getArea() {
		return this.width * this.length;
	}
	
	public String toString() {
		return "Rectangle[wild = "+getWild()+" ,length = "+getLength()+",color = "+color+"]";
	}
	
}