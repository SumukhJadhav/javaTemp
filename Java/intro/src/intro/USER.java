package intro;

public class USER {
	public String fName;
	public String lName;
	public int age;
	
	public USER(String fName,String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		
		this.age = age;
	}
	
	public void getFullName() {
		System.out.println(this.fName + " " + this.lName);
	}
	
	public void changeLastName(String newLastName) {
		this.lName = newLastName;
	}
	
	
	
}
