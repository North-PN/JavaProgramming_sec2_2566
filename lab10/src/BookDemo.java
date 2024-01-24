import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name : ");
		String name = scan.nextLine();
		System.out.print("Input author email : ");
		String email = scan.nextLine();
		Author author = new Author(name,email);
		
		System.out.println();
		
		System.out.print("Input book title : ");
		String title = scan.nextLine();
		System.out.print("Input book page : ");
		int page = scan.nextInt();
		Book b1 = new Book(title,author,page);
		System.out.print("\n"+b1);
	}

}
