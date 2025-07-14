package interview;

public class EmployeeDto {
	
	String name;
    String department;
    int salary;

    EmployeeDto(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

	public EmployeeDto(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeDto [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}



}
