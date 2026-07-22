package rev;

import java.io.Serializable;

public class Emp implements Serializable
{

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private double salary;
    
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void display() {
        System.out.println("Employee Id : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }
    
}
