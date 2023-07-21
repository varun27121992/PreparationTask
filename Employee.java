package OOPS2;

public class Employee {
	private int empID;
	private int salary;
	
	public String dept(String b) {
		return b;
	}
	public Employee( int empID, int salary)	{
		this.empID = empID;
		this.salary=salary;
	}
		public String toString() {
			return empID+" "+salary;
		}
	

}
