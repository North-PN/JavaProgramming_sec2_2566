
public class Theater extends Movie {
	private int theaterNo;
	
	Theater(String id,String name,Director director,int theaterNo){
		super(id,name,director);
		this.theaterNo = theaterNo;
	}
	Theater(){
		super();
		this.theaterNo = 0;
	}
	public String getTheaterName() {
		if(1<=this.theaterNo && this.theaterNo<=11) {
			return "Basic Theater"; 
		}
		else if(12<=this.theaterNo && this.theaterNo<=14) {
			return "Sweet Theater";
		}
		else if(this.theaterNo==15) {
			return "Premium Theater";
		}
		else {
			return "null";
		}
	}
	
	public String toString() {
		return getTheaterName()+" : "+super.toString(); 
	}
	
}