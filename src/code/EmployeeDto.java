package code;

public class EmployeeDto {

	private int empId;
    private String empName;
    private String empCity;
    private String empCountry;
    private double empSalary;
    private String empDepartmentName;
    
	public EmployeeDto(int empId, String empName, String empCity, String empCountry, double empSalary,
			String empDepartmentName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empCountry = empCountry;
		this.empSalary = empSalary;
		this.empDepartmentName = empDepartmentName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpCountry() {
		return empCountry;
	}

	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDepartmentName() {
		return empDepartmentName;
	}

	public void setEmpDepartmentName(String empDepartmentName) {
		this.empDepartmentName = empDepartmentName;
	}

	@Override
	public String toString() {
		return "EmployeeDto [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", empCountry="
				+ empCountry + ", empSalary=" + empSalary + ", empDepartmentName=" + empDepartmentName + "]";
	}
	
	
    
    
}
