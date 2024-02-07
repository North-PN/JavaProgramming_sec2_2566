import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("D://txtfile//BookData.txt"));
		String temp = "";
		int countbook = 0, i = 1;
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			String title = data[0];
			String author = data[1];
			float rate = Float.parseFloat(data[2]);
			int year = Integer.parseInt(data[5]);
			System.out.println(i+". "+title+" ("+author+"), Rating "+rate+" publish on "+year);
			//System.out.println(data[0]+" ("+data[1]+"), Rating "+data[2]+" publish on " + data[5] );
			countbook++;
			i++;
		}
		read.close();
		System.out.println("=".repeat(70));
		System.out.println("Total number of book : "+countbook);
	}

}