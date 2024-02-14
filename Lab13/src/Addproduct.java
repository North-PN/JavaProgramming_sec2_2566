import java.io.*;
import java.util.*;
public class Addproduct {

	public static void main(String[] args) throws IOException {
		// create object for write(save) data to File using PrintWriter Class
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product.txt",true));
		//create object for input data from keyboard(console)
		Scanner scan = new Scanner(System.in);
		//Display and input data from keyboard
		System.out.print("Input product id: ");
		String productId = scan.nextLine();
		System.out.print("Input product Name: ");
		String productName = scan.nextLine();
		System.out.print("Input product Unit: ");
		int productUnite = scan.nextInt();
		System.out.print("Input product Price: ");
		float productPrice = scan.nextFloat();
		//save data to file
		writeFile.println(productId+","+productName+","+productUnite+","+productPrice);
		System.out.println("Save file already...");
		writeFile.close();
		
	}

}
