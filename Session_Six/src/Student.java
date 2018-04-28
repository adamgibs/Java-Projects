
public class Student extends Person {
	private String[] status = {"FRESHMAN", "SOPHMORE", "JUNIOR", "SENIOR"};
	private String classStatus;
	
	public Student(String lName, String fName, String address, String phone,String classStatus) {
		super(lName, fName, address, phone);
		
		setClassStatus(classStatus);
	}
	
	public String getClassStatus() {
		return classStatus;
	}
	
	public void setClassStatus(String classStatus){
		//Ensures that class status provided is one of the four items in the status list.
		//Provided class status is case-insensitive
		String classStatusCopy = classStatus.toUpperCase();
		for(int i = 0; i < status.length; i++) {
			if(classStatusCopy.equals(status[i])) {
				this.classStatus= classStatus;
				return;
			}
		}
		System.out.println("Please enter a valid class satus");
		
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%s: %s\n", 
				"Class Status", getClassStatus());
	}
}
