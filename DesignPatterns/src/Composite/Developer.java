package Composite;

/*
 * 具体实现类
 */
public class Developer extends Employee {

	public Developer(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub

		if (this.employees.contains(employee)) {

			String newEmployee = employee.toString();
			System.out.println("exist: " + newEmployee);
		} else {

			this.employees.add(employee);
		}
	}

	@Override
	public void remove(Employee employee) {
		// TODO Auto-generated method stub

		if (this.employees.contains(employee)) {

			this.employees.remove(employee);
		} else {

			String newEmployee = employee.toString();
			System.out.println("not exist: " + newEmployee);
		}
	}

}
