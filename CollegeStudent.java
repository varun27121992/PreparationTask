package OOPS2;

public class CollegeStudent extends Student{
	private String dept;
	private int year;
	
	public CollegeStudent(String name, int id, String dept , int year) {
		super(name,id);
		this.dept=dept;
		this.year=year;
	}
	public String toString() {
		return super.toString()+" "+dept+" "+year;
	}
	
	}


