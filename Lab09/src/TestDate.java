
public class TestDate {

	public static void main(String[] args) {
		// Test constructors and toString()
		Date d1 = new Date(2023,2,8);
		System.out.println(d1);
				
		//Test setters and getters method
		d1.setYear(2023);
		d1.setMonth(12);
		d1.setDay(21);
		System.out.println(d1);
		
		System.out.println("Year is : "+d1.getYear()
						+ "\nMonth is : "+d1.getMonth()
						+ "\nDay is : "+d1.getDay());
		//Year is: 2012
		//Month is: 12
		//Day is: 23
		//Test setDate()
		d1.setdate(2004, 6, 27);
		System.out.println("The date of object d1 : "+d1);

	}

}
