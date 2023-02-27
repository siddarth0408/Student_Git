package git.student_git;

public class Student {
	// 01-- Create DB
	private int rollNo;
	private String  name;
	private int contactNo;
	private String city;
	private String email;
	private int standard;
	
	//02--- after data create contractor 
	
	public Student(int rn, String nm , int ctno, String ct, String em, int st)
	{
		
		rollNo=rn;
		name = nm;
		contactNo=ctno;
		city=ct;
		email=em;
		standard=st;
		
	}

	
	// to Get  getters and setters. Right click. Source. Generate getter and sitors. 
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}
	
	

}
