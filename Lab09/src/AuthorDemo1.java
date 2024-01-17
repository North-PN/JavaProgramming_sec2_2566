import java.util.*;
public class AuthorDemo1 {
	
	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.print("Input author name   : ");
				String name = scan.nextLine();
				System.out.print("Input author e-mail : ");
				String email = scan.nextLine();
				System.out.print("Input author gender : ");
				char gender = scan.nextLine().charAt(0);
				System.out.println();
				Author a1 = new Author(name,email,gender);
				System.out.println(a1);
				
			}
	}

