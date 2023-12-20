import java.util.*;
public class Lab604 {
	
	static Scanner scan = new Scanner(System.in);
	static String studentId,strSubjectID ;
	static int subjectId;
	
	
	public static void main(String[] args) {
		InputStudent();
		
		
	}
	
	public static boolean isITstudent(String id) 
	{
		if(id.substring(0,3).equals("211") && id.substring(3,6).equals("311")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void InputStudent() 
	{
		do{
			System.out.print("Enter Student ID: ");
			studentId = scan.next();
			System.out.print("Enter Subject ID: ");
			subjectId = scan.nextInt();
			//convert subjectId from Integer to String (SunjectID)
			strSubjectID = subjectId+"";
		}while(!(isLenght(studentId,strSubjectID)));
		System.out.println();
		displayData(isITstudent(studentId),isITSubject(strSubjectID));
		
	}//end Method
	
	public static boolean isLenght(String id , String subid) 
	{
		if(id.length()==10&&subid.length()==7) 
		{
			return true;	
		}
		return false;
	}//end Method isLenght
	
	public static boolean isITSubject(String sub_id) 
	{
		if(sub_id.substring(0,2).equals("21") && sub_id.substring(4,5).equals("1")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void displayData(boolean sid, boolean subid) 
	{
		if(sid) {
			System.out.println("student id: "+studentId+"1'st year student in IT");
		}else {
			System.out.println("student id: "+studentId+"is not 1'st year student in IT");
		}
		if(sid) {
			System.out.println("Enroll in course for year 1");
		}else {
			System.out.println("not enroll in course for year 1");
		}
	}
	
	
	
	

}
