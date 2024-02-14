import java.util.*;
import java.io.*;
public class ATMBanking {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(new File("d://txtfile//ATMBookBank.txt"));
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number : ");
		String number = input.nextLine();
		while( !(
				Character.isDigit(number.charAt(0)) &&
				number.substring(1,2).equals("-") &&
				Character.isDigit(number.charAt(2)) &&
				Character.isDigit(number.charAt(3)) &&
				Character.isDigit(number.charAt(4)) &&
				number.substring(5,6).equals("-") &&
				Character.isDigit(number.charAt(6)) &&
				Character.isDigit(number.charAt(7)) &&
				Character.isDigit(number.charAt(8)) &&
				number.substring(9, 10).equals("-") &&
				Character.isDigit(number.charAt(10)) &&
				Character.isDigit(number.charAt(11)) &&
				number.substring(12, 13).equals("-") &&
				Character.isDigit(number.charAt(13)) &&
				number.length() == 14 
				)) {
			System.out.print("Input wrong type, Enter account number : ");
			number = input.nextLine();
		}
		
		System.out.print("Enter password : ");
		String pass = input.nextLine();
		while(!(pass.length() == 4)) {
			System.out.print("Enter password : ");
			pass = input.nextLine();
			
		}
		
		System.out.print("Enter money : ");
		int money = input.nextInt();
		while(!(
				money > 0 &&
				money%1000 == 0 ||
				money%500 == 0 ||
				money%100 == 0 
				)) {
			System.out.print("Enter money : ");
			 money = input.nextInt();
		}
		System.out.println();
		
		ATMChecking bank = new ATMChecking(number,pass,money);
		int i = 0;
		while(read.hasNext()) {
			String id = read.next();
			String password = read.next();
			int moneyBank = Integer.parseInt(read.next());
			
			if( (number.equals(id)&&password.equals(pass)&&money<=moneyBank) 
					== bank.checkBookingBamnk()) {
				bank.show(moneyBank);
				i++;
			}
		}
		read.close();
		if(i == 0) {
			System.out.println("Sorry, you id or password is worng,"
					+ " or your amount not enogh.");
		}
		
		
		

	}

}