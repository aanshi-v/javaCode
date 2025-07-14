package comparableAndcomparator;

/**
 * <EmpDto> : it is showing that we are going to compare object of EmpDto class
 */
public class EmpDto implements Comparable<EmpDto> {
	
	private String name;
	private String phone;
	private Integer empid;
	
	//empid is comparing with o
	//if both object are equal then it will be 0
	//if this.empid > o.empid then +1
	//if this.empid < o.empid then -1
	@Override
	public int compareTo(EmpDto o) {
		return this.empid - o.empid;      
	}  
	
	public EmpDto(String name, String phone, Integer empid) {
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
		return "EmpDto [name=" + name + ", phone=" + phone + ", empid=" + empid + "]";
	}

	
	
	

}
