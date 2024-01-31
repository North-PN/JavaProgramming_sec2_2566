import java.util.Scanner;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input title name : ");
		String title = scan.nextLine();
		
		System.out.print("Input book year : ");
		int year = scan.nextInt();
		scan.nextLine();
		
		FictionBook book = new FictionBook(title,year);
		
		do{
		System.out.print("Input author name : ");
		book.setAuthorName(scan.nextLine());
		
		System.out.print("Input email : ");
		book.setEmail(scan.nextLine());
		}while(!(book.checkFormatName()||book.checkEmail()));
		
		System.out.println();
		System.out.print(book);
		
		
	}

}
