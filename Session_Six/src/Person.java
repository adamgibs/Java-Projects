/*
 * Author: Adam Gibson
 * Date: 04/14/2018
 * Description: This is a class for a person obeject. It is the superclass to the Employee and Student objects.
 * */
import java.util.regex.Pattern;

public class Person {
	private String fName;
	private String lName;
	private String address;
	private String phone;
	
	public Person(String lName, String fName, String address, String phone) {
		this.lName = lName;
		this.fName = fName;
		this.address = address;
		setPhone(phone);
		
	}
	
	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		
		return phone;
	}


	public void setPhone(String phone) {
		//Validates phone # string. Must be in xxx-xxx-xxxx format and area code must begin with number 2-9
		Pattern pattern = Pattern.compile("[2-9][0-9]{2}-[1-9][0-9]{2}-[0-9]{4}");
		if(pattern.matcher(phone).matches()) {
			this.phone = phone;
		}else {
			System.out.println("Phone # must be in xxx-xxx-xxxx format and begin area code with digit 2-9");
		}
		
	}

	
	@Override
	public String toString() {
		return String.format("%s: %s, %s\n%s: %s\n%s: %s\n", 
				"Name", lName, fName,
				"Address", address, 
				"Phone", phone);
	}
}
