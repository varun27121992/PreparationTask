package OOPS2;

public class MathsTeacher extends Teacher {

 private String sub;
 private String geo;
 
 public MathsTeacher(int empID, int salary, int classes, String classTeacher, String sub, String geo ) {
	 super(empID,salary, classes,classTeacher);
	 this.sub=sub;
	 this.geo=geo;
 }
public String toString(){
	 return super.toString()+" "+sub+" "+geo;
	 
 }
 }



