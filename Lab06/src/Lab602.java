import javax.swing.*;
public class Lab602 {

	public static void main(String[] args) {
		
		int year = Integer.parseInt(JOptionPane.showInputDialog("input years"));
		while(!checkYears(year))
		{
			year = Integer.parseInt(JOptionPane.showInputDialog("input years, again"));
			
		}
		JOptionPane.showMessageDialog(null, year +" is "+ (isLeapYear(year)? "Leap Year":"NOT Leap year"));
		/* 
		 * if(isLeapYear(year)==true){
		 * JOptionPane.showMessageDialog(null, year + "is Leap Year" );
		 * }
		 * else{
		 * JOptionPane.showMessageDialog(null, year + "is not Leap Year" );
		 * }
		 * 
		 * 
		 * */
	}
 
	
	public static boolean isLeapYear(int year) {
		if ((year%4 == 0 && year%100 != 0) || ((year%100 == 0) && (year%400 == 0)))
			return true;
		
	 return false;
	}
	
	public static boolean checkYears(int year) {
		if(year>=1000&&year<=3000)
			return true;
		
		return false;
	}

}
