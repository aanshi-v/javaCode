package comparableAndcomparator;

public class EmpDtoComparator {

	private String name;
	private String phone;
	private Integer empid;
	
	public EmpDtoComparator(String name, String phone, Integer empid) {
		super();
		this.name = name;
		this.phone = phone;
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "EmpDtoComparator [name=" + name + ", phone=" + phone + ", empid=" + empid + "]";
	}
	

}
