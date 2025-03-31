package Composite;

import java.util.ArrayList;
import java.util.List;

/*
 * 组件类
 */
public abstract class Employee {

	private String name;
	private int salary;
	protected List<Employee> employees;

	public Employee(String name, int salary) {

		this.name = name;
		this.salary = salary;

		this.employees = new ArrayList<Employee>();
	}

	public abstract void add(Employee employee);

	public abstract void remove(Employee employee);

	public List<Employee> getList(){
		
		return this.employees;
	}

	public String toString() {

		return ("Employee :[ Name : " + name + ", salary :" + salary + " ]");
	}
}
