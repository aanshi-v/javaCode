package code;

public class EmployeeSortDto {
	
	String name;
	Integer age;
	
	public EmployeeSortDto(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
//		return "EmployeeSortDto [name=" + name + ", age=" + age + "]";
		return "name= " + name + ", age= " + age;
	}
	
	

}
