import java.util.*;
import java.io.*;
public class Example1202 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in); 
		System.out.print("Input Section : ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
	}
	
	public static void Header(int section) {
		System.out.println("*".repeat(64));
		System.out.println("\t\tList of Data for Section "+section);
		System.out.println("*".repeat(64));
	}
	
	public static void showListStudent(int section) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("D://txtfile//List107.txt"));
		String temp = "";
		while((temp = read.readLine())!= null) {
			String[] data = temp.split("\t");
			String id = data[0];
			String name = data[2];
			int sec = Integer.parseInt(data[3]);
			double midscore = Double.parseDouble(data[4]);
			double finalscore = Double.parseDouble(data[5]);
			if(sec == section) {
				System.out.println(id+"\t"+name+"\t"+midscore+"\t"+finalscore+"\t"
									+findResult(midscore,finalscore));
			}
		}
		read.close();
	}
	
	public static String findResult(double midscore, double finscore) {
		return (midscore+finscore>=40? "PASS":"FAIL");
	}
	
	

}