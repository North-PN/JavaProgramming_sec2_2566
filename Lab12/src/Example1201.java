import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException {
		/*File file0 = new File("D://txtfile//MemberLogin.txt");
		Scanner scan = new Scanner(file0);*/
		Scanner scan = new Scanner(new File("D://txtfile//MemberLogin.txt"));
		
		while(scan.hasNext()){
			String name = scan.next();
			scan.next();
			scan.next();
			String email = scan.next().toUpperCase();
			System.out.println(name+" ("+email+")");
		}
		scan.close();
	}
}