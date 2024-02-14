
public class Employee {
	private String dept;

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return this.dept;
	}

	public void header() {
		//System.out.println("*".repeat(88));
		for(int i =1 ; i<=44;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
