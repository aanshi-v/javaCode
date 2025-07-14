package code;

public class Find2ndHighestSalaryInListDto {
	
	private String name;
	private Integer salary;
	
	public Find2ndHighestSalaryInListDto(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
//		return "Find2ndHighestSalaryInListDto [name=" + name + ", salary=" + salary + "]";
		return "name = " + name + ", salary = " + salary;
	}
	
	
	
	
	

}
