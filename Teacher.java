package OOPS2;

public class Teacher extends Employee {
	
	private int classes;
	private String classTeacher;
	
	public Teacher(int empID, int salary, int classes, String classTeacher ) {
		super(empID,salary);
		this.classes = classes;
		this.classTeacher= classTeacher;
	}
	public String toString() {
		return super.toString()+" "+classes+" "+classTeacher;
		
	}
				
	}


