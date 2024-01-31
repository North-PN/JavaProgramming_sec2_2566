import javax.swing.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		double InputWidth = Double.parseDouble
				(JOptionPane.showInputDialog("Input width"));
		double InputLength = Double.parseDouble
				(JOptionPane.showInputDialog("Input length"));
		String Inputcolor = JOptionPane.showInputDialog("Input color");
		Rectangle2 obj2 = new Rectangle2(InputWidth,InputLength,Inputcolor);
		JOptionPane.showMessageDialog(null, obj2
					+"\nArea of rectangle is "+obj2.getArea());
	}

}