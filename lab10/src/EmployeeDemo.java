import java.util.*;
import java.text.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input employee id     : ");
		String id = scan.nextLine();
		System.out.print("Input employee name   : ");
		String name = scan.nextLine();
		System.out.print("Input employee salary : ");
		double salary = scan.nextDouble();
		System.out.print("Input employee sales  : ");
		double sales = scan.nextDouble();
		
		Sales s1 = new Sales(id,name,sales,salary);
		
		System.out.println("\n"+s1);
		System.out.println("Total salary "+
							frm.format((s1.getSalary()+s1.getCommission()))+
							" baht.");
	}

}
