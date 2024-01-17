import java.util.*;
public class AuthoorDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Author[] authors = new Author[4];
		for(int i=0;i<authors.length;i++) {
			System.out.println("Information Author "+(i+1));
			System.out.println("--------------------------------------------");
			System.out.print("Input author name  : ");
			String name = scan.nextLine();
			System.out.print("Input author email : ");
			String email = scan.nextLine();
			System.out.println("--------------------------------------------");
			authors[i] = new Author(name,email);
		}
		int i = 1 ;
		//use foreach loop
		System.out.println();
		for(Author _authors : authors) {
			System.out.println(i+""+_authors);
			i++;
		}	
		

	}

}
