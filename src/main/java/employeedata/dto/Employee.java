package employeedata.dto;

public class Employee {
	
   private int empid;
   private String empName;
   private String empEmail;
   private long contact;
   private String password;
   
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}

}