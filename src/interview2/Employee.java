package interview2;

public class Employee {
	
	private Integer id;
	private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    

    public Employee(Integer id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
    
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    
 // Getter
    public double getSalary() {
        return salary;
    }

}
