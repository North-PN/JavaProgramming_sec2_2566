import java.time.*;
public class FictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		return this.author_name.indexOf(" ") > 0;
	}
	public boolean checkEmail() {
		return (email.startsWith(" ")
				|| email.startsWith("@")
				|| (email.endsWith("@hotmail.com")
				|| (email.endsWith("@windowslive.com"))));
	}
	@Override
	public String getTitle() {
		return this.title;
	}
	@Override
	public int totalPublishYear() {
		return Year.now().getValue() - this.publicYear;
	}
	@Override
	public String getLastName() {
		return this.author_name.substring(this.author_name.indexOf(" "))
										  .trim().toUpperCase();
	}
	@Override
	public String getFirstName() {
		return this.author_name.substring(0,this.author_name.indexOf(" "))
										  .trim().toUpperCase();
	}
	public String toString() {
		return getTitle()+" write by "+getLastName().substring(0,1)+"."+getFirstName()
				+"("+this.email+")\nPubliched for "+totalPublishYear()+" years.";
	}
	
	
	
	
}