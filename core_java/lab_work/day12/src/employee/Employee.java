package employee;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable {
	private Integer id;
	private String name;
	private Dept dept;
	private Double salary;
	private Desig designation;

	public Employee(Integer id, String name, Dept dept, Double salary, Desig designation) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public boolean equals(Object o) {
		return (this.id).equals(((Employee) o).id);
	}

	@Override
	public int compareTo(Employee anotherEmp) {
		return (this.id).compareTo(anotherEmp.id);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", designation="
				+ designation + "]\n";
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Desig getDesignation() {
		return designation;
	}

	public void setDesignation(Desig designation) {
		this.designation = designation;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
