import java.io.*;
import java.util.Scanner;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(new File("D://txtfile//student.txt"));
		Header();
		int i = 1;
		while(read.hasNext()) {
			String id = read.next();
			read.next();
			String fname = read.next();
			String lname = read.next();
			String name = fname.substring(0, 1).toUpperCase()+"."+lname;
			float grade = Float.parseFloat(read.next());
			read.next();
			System.out.println(i+"\t"+id+"\t"+Level(id)+"\t"+name+"\t"+grade+"\t"+Status(grade));
			i++;
		}
		read.close();
	}//end of Main method
	
	public static void Header() {
		System.out.println("No.\tID\t\tLevel\tName\tGrade\tstatus");
		System.out.println("*".repeat(57));
	}//end of Header method
	
	public static String Level(String id) {
		int year = 22 - Integer.parseInt(id.substring(0, 2));
		return Integer.toString(year)+"th";
	}//end of Level method
	
	public static String Status(float grade) {
		if(grade >= 2.00) {
			return "PASS";
		}
		else if(grade > 1.00 && grade < 2.00) {
			return "Critical";
		}
		else {
			return "retired";
		}
	}//end of Status method

}