
public class Date {
	private int dDay;
	private int dMonth;
	private int dYear;
	
	Date(){
		dDay = 1;
		dMonth = 1;
		dYear = 1990;
	}
	Date(int month ,int day,int year){
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	public void setData(int month,int day,int year) {
		this.dDay = day;
		this.dMonth = month;
		this.dYear = year;
	}
	public int getMonth() {
		return this.dMonth;
	}
	public int getDay() {
		return this.dDay;
	}
	public int getYear() {
		return this.dYear;
	}
	public String toString() {
		return dMonth + "-" + dDay + "-" + dYear;
	}
}
