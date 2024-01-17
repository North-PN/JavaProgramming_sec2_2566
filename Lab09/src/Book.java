import java.time.Year;
public class Book {
	private String title;
	private float price;
	private int publishYear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(float price) {
		this.price = price ;
	}
	public float gerPrice() {
		return price;
	}
	public void setPublishyear(int publishYear) {
		this.publishYear = publishYear ;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public int getTotalYear() {
		return Year.now().getValue()-getPublishYear() ;
	}
	public String toString() {
		return "Title: "+title+" published for "+getTotalYear()+" year ("+price+" baht).";
	}
	
}
