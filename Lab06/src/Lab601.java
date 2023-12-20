import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		
		/*String email = JOptionPane.showInputDialog("Input your e-mail");
		//String email = JOptionPane.showInputDialog("Input your e-mail").toLowerCase();
		while(!checkEmail(email.toLowerCase()))
		{
			JOptionPane.showMessageDialog(null , "Your e-mail is not hotmail or gmail ");
			email = JOptionPane.showInputDialog("Input your e-mail, again");			
		}
		JOptionPane.showMessageDialog(null , "your e-mail is " + email);*/
		inputEmail();	
	}
		
		public static void inputEmail()
	{
			String email = JOptionPane.showInputDialog("Input your e-mail");
			//String email = JOptionPane.showInputDialog("Input your e-mail").toLowerCase();
			while(!checkEmail(email.toLowerCase()))
			{
				JOptionPane.showMessageDialog(null , "Your e-mail is not hotmail or gmail ");
				email = JOptionPane.showInputDialog("Input your e-mail, again");			
			}
			JOptionPane.showMessageDialog(null , "your e-mail is " + email);
		
	} 
	
	
	public static boolean checkEmail(String email)
	{
		/*if(email.endWith("hotmail.com")||email.endWith("gmail.com"))
		{
			return true;
			
		}
		else return false;
		*/
		
		if(email.startsWith(" ")|| email.startsWith("@")||email.endsWith("@gmail.com")||email.endsWith("@hotmail.com"))
		return true;
		
		else return false ;
		
		
	}

}
