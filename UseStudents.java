package composition;

public class UseStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students();
		s1.setName("Varun");
		System.out.println(s1.getName());
		s1.setId(25);
		s1.setMobileNo(369852741587784l);
		s1.setMarks(75);
		System.out.println(s1.getId() + " " + s1.getMarks() + " " + s1.getMobileNo());

	}

}
