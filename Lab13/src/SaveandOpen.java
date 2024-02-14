import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee{
	private String name;
	private String dept;

	public void insert() throws IOException{
		Scanner input = new Scanner(System.in);
		String answer;
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		do {
			header();
			System.out.print("Enter name      : ");
			name = input.next();
			System.out.print("Enter department : ");
			dept = input.next();
			writeFile.println(name +"\t"+ dept);
			System.out.print("Enter data again? : " );
			answer = input.next().toLowerCase();
		} while(answer.equals("y"));
		writeFile.close();
	}

	public void read() {
		try {
			//create object for read File using Scanner Class
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			int i = 0;
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i + ") " + name);
					check = true;
				}
			}
			if(check == false) {
				System.out.print("\nSorry, no dept : " + super.getDept() + " in file.");
			}
			if (i >0) {
				header();
				System.out.print("Employee in dept " + super.getDept() + " is " + i + " person.");
			}
		}
		catch(IOException e) {
			System.out.println("Sorry, file not found...");
		}

	}

}