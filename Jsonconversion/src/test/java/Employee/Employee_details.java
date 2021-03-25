package Employee;

public class Employee_details {
    
	
	 Employee_details() {
		
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public boolean isMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(boolean maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public int[] getMobile() {
		return mobile;
	}
	public void setMobile(int[] mobile) {
		this.mobile = mobile;
	}
	public Employee_details(String emp_name, int emp_id, boolean maritalstatus, int[] mobile) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.maritalstatus = maritalstatus;
		this.mobile = mobile;
	}
	String emp_name;
	int emp_id;
	boolean maritalstatus;
	int[] mobile;
	
	
	

}
