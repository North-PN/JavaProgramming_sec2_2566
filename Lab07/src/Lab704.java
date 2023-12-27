import javax.swing.*;
public class Lab704 {

	public static void main(String[] args) {
		String[] goodWord = {"Good Morning", "Good Afternoon", "Good Evening" ,"Good Night"};
		String word = "";
		for(String Word : goodWord)
		{
			word += "- "+Word+"\n";
		}
		
		JOptionPane.showMessageDialog(null, "The greating word in English:\n"+word);
		
	}
}
