package week3.day1;

public class Students {
	public void studentInfo( int id) {
		System.out.println("Id no:" +id);

	}
	public void studentInfo(int id,String name) {
		System.out.println("student :" +id );
		System.out.println("student name:" + name);

	}
	public void studentInfo(String email, String phonenumber) {
		System.out.println("student email:" +email);
		System.out.println("student phonenumber :" +phonenumber);

	}

	public static void main(String[] args) {
		Students std=new Students();
		std.studentInfo(17);
		std.studentInfo(17, "Dharseni");
		std.studentInfo("selva@gmail.com", "6789543210");
	}

		
	

}
