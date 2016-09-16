package dto;

public class RegisterGetSet {

	private String Reg_Id;
	private String FirstName;
	private String lastName;
	private String Email;
	private String PassWord;
	private String PhoneNumber;
	private String AdditionDetails;
	private String Role;
	
	public String getReg_Id() {
		return Reg_Id;
	}
	public void setReg_Id(String reg_Id) {
		Reg_Id = reg_Id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAdditionDetails() {
		return AdditionDetails;
	}
	public void setAdditionDetails(String additionDetails) {
		AdditionDetails = additionDetails;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
}
