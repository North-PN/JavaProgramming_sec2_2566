import java.util.*;
import java.io.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data? : ");
		choice = input.next().toLowerCase();

		while(!(choice.equals("insert") || choice.equals("read"))) {
			System.out.print("Please type Insert or Read data?,again : ");
			choice = input.next().toLowerCase();
		}

		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert"))
			obj.insert(); //call insert method method from class SaveandOpen
		else if(choice.equals("read")) {
			System.out.print("\nEnter department: ");
			department = input.next();
			obj.header();
			obj.setDept(department);//sent department to setDept() method from class Employee
			obj.read(); //call read method from class SaveandOpen
		}

	}

}