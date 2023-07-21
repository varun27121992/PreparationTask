package composition;

public class Students {
	private String name;
	private int id;
	private long mobileNo;
	private int marks;
	
	public void setName(String name) {
		this.name=name;
	}

	public String getName(){
		return name;
		
	}
	public void setId(int id)
	{
		this.id=id;
		
	}
	public int getId() {
		return id;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo=mobileNo;
			}
	public long getMobileNo(){
		return mobileNo;
	}
	public void setMarks( int marks) {
		this. marks= marks;
		
	}
	public int getMarks() {
		return marks;
	}
	
}
