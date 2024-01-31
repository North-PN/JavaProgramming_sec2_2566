import javax.swing.*;
public class RectangleDemo {

	public static void main(String[] args) {
		
		double InputWidth = Double.parseDouble
				(JOptionPane.showInputDialog("Input width"));
		double InputLength = Double.parseDouble
				(JOptionPane.showInputDialog("Input length"));
		String Inputcolor = JOptionPane.showInputDialog("Input color");
		//send 3 argument to Constructor
		Rectangle obj1 = new Rectangle(InputWidth,InputLength,Inputcolor);
		
		JOptionPane.showMessageDialog(null, obj1 + 
										"\nArea of Rectangle is "
										+obj1.getArea());
	}

}
