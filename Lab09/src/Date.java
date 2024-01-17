
public class Date {
	private int year;
	private int month;
	private int day;
	//Constructors with given year,month, and year
	Date(int year , int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//The public getter/setter for the private attributes
	//Return the year
	public int getYear() {
		return year;
	}
	//Return the month
	public int getMonth() {
		return month;
	}
	//Return the day
	public int getDay() {
		return day;
	}
	//Set the year
	public void setYear(int year) {
		this.year = year;
	}
	//Set the month
	public void setMonth(int month) {
		this.month = month;
	}
	//Set the day
	public void setDay(int day) {
		this.day = day;
	}
	//Return a string in the form "MM/DD/YYYY" with leading zero
	public String toString() {
		//use built-in function String.format() to from a formatted String
		//Specifier "0" to print leading zero => 01/02/2024
		return String.format("%02d/%02d/%04d", month,day,year);
	}
	//Set year , month , day
	public void setdate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day ;
	}
}
