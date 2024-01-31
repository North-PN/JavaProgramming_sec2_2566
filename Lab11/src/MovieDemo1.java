import java.util.*;
public class MovieDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input movie id : ");
		String id = input.nextLine();
		System.out.print("Input movie name : ");
		String name = input.nextLine();
		System.out.println();
		
		System.out.print("Input director name : ");
		String direcName = input.nextLine();
		System.out.print("Input director email : ");
		String direcEmail = input.nextLine();
		System.out.print("Input director gender : ");
		char direcGender = input.nextLine().charAt(0);
		
		while(!(direcGender == 'f' ||direcGender == 'F' ||direcGender == 'm' ||direcGender == 'M')) {
			System.out.print("Input director gender, again : ");
			direcGender = input.nextLine().charAt(0);
		}
		Director direc = new Director(direcName,direcEmail,direcGender);
		Movie m1 = new Movie(id,name,direc);
		System.out.println();
		
		System.out.print("Input movie theater no. : ");
		int thearNo = input.nextInt();
		while(!(thearNo >= 1 && thearNo <= 15)) {
			System.out.print("Please input 1 - 15 only: ");
			thearNo = input.nextInt();
		}
		System.out.println();
		Theater tear = new Theater(id,name,direc,thearNo);
		
		System.out.println(tear);
		
		
	}

}