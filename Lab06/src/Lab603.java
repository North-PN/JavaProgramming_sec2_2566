import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name, separted by a space.");
		String fullname = scan.nextLine();
		System.out.println(abbreviatName(fullname));
	}
	public static String abbreviatName(String name) {
		String firstName = name.substring(0 , name.indexOf(' '));
		String middleName = name.substring(name.indexOf(' ') + 1, name.indexOf(' ') + 2);
		String lastName = name.substring(name.lastIndexOf(' ') + 1,name.lastIndexOf(' ') + 2);
		return middleName + "." + lastName + "." + firstName;
	}

}
