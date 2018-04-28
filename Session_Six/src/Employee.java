/*
 * Employee class. Subclass of the Person class.
 * */
public class Employee extends Person {
	String office;
	double salary;
	Date hireDate;
	
	public Employee(String lName, String fName, String address, String phone, String office, Double salary, int hireMonth, int hireDay, int hireYear) {
		super(lName, fName, address, phone);
		this.hireDate = new Date(hireMonth, hireDay, hireYear);//Creates instance of the Date class from our text
		this.office = office;
		setSalary(salary);
		
		
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		//Validates salary by checking that it is a positive number
		if(salary > 0) {
			this.salary = salary;
		}else {
			System.out.println("Salary must be positive.");
		}
		
	}

	public Date getHireDate() {
		return hireDate;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%s: %s\n%s: $%.2f\n%s: %s\n", 
				"Office", getOffice(),
				"Salary", getSalary(),
				"Hire Date", getHireDate());
	}

	
	
}
