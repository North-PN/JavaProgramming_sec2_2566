import java.util.*;
public class TestBook {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book b1 = new Book();
		System.out.print("Input book title   : ");
		b1.setTitle(scan.nextLine());
		System.out.print("Inptut book price  : ");
		b1.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		b1.setPublishyear(scan.nextInt());
		System.out.println("\n"+b1);

	}

}
