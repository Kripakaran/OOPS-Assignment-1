package Employer;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee() {
		firstName=null;
		lastName=null;
		salary=0.0;
	}
	
	 public String getFirstName() {
		return firstName;
	}
	 
	 public String getLastName() {
		return lastName;
	}
	 
	 public double getSalary() {
		return salary;
	}
	 
	 public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	 
	 public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	 
	 public void setSalary(double salary) {
		this.salary = salary;
		
	}
}
