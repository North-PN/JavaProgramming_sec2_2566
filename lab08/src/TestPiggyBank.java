import java.util.*;
public class TestPiggyBank {
	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);
		System.out.println();*/
		inputCoin();
	}
	
	public static void inputCoin() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of Piggy Bank : ");
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your Piggybank:"+pb.getPiggyBank());
		MainMenu();
	}
	
	public static void MainMenu() {
		int choice;
		while(true) {
		System.out.println( "\n=======================\n"
							+ "Menu of PiggyBank\n"
							+ "=======================\n"
							+ "[1] one baht.\n"
							+ "[2] two baht.\n"
							+ "[3] five baht\n"
							+ "[4] ten baht.\n"
							+ "[5] Exit\n"
							+ "=======================");
		System.out.print("Please Select Menu [1-5] : ");
		choice = scan.nextInt();
		
		if(choice == 1) {
			System.out.print("Insert 1 Baht Money : ");
			pb.addOne(scan.nextInt());	
		}//end of if
		else if (choice == 2) {
			System.out.print("Insert 2 Baht Money : ");
			pb.addTwo(scan.nextInt());
		}//end of else if [2]
		else if (choice == 3) {
			System.out.print("Insert 5 Baht Money : ");
			pb.addFive(scan.nextInt());
		}//end of else if [3]
		else if (choice == 4) {
			System.out.print("Insert 10 Baht Money : ");
			pb.addTen(scan.nextInt());
		}//end of else if [4]
		else if(choice == 5) {
			System.out.println("Bye Bye");
			break;
		}//end of else if [5] and exit while loop
		System.out.println("Money Total : " + pb.getTotal());
		}
	}

}
