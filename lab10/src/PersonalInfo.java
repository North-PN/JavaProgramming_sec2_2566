
public class PersonalInfo {
	private Person name;
	private Date dDay;
	private int personID;
	
	PersonalInfo(){
		this.name = new Person();
		this.dDay = new Date();
		this.personID = 0;
	}
	PersonalInfo(String first,String last,int month,int day,int year,int ID){
		name = new Person(first,last);
		dDay = new Date(month,day,year);
		personID = ID;
	}
	public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name = new Person(first,last);
		dDay = new Date(month,day,year);
		personID = ID;
	}
	public String toString() {
		return "Name: " + name.toString()+"\nDate of birth: "+dDay.toString()+
				"\nPersonal ID: "+personID;
	}
}
