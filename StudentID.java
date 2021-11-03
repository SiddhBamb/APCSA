public class StudentID
{
	private String studentFirstName;
	private String studentLastName;
	private String studentID;
	
	public StudentID(String firstName, String lastName, int ID)
	{
		studentID = "" + ID;
		studentFirstName = firstName;
		studentLastName = lastName;
	}
	
	public StudentID(){
		studentFirstName = "John";
		studentLastName = "Doe";
		studentID = "12345678";
	}
	
	public String getPassword()
	{
		String password = new String("" + studentLastName.charAt(0) + studentID + studentLastName.charAt(studentLastName.length()-1));
		return password;
	}
	public String toString(){
		String printer = new String("Name = " + studentFirstName + " " + studentLastName + "  Student ID = " + studentID);
		return printer;
	}
}