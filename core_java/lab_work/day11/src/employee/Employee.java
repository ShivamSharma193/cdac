package employee;

public class Employee {
	private Integer id ;
	private String name ;
	private int salary  ;
	private EmpDesig designation  ;
	
	public Employee(int id, String name, int salary, EmpDesig  desig) {
		this.id = id ;
		this.name = name ;
		this.salary = salary ;
		this.designation = desig ;
	}
	public Employee() {} ;
	
	@Override 
	public String toString() {
		return "Employee :" + this.id+" "+this.name+" "+ 
	            this.salary + " "+ this.designation   ;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	@Override 
	public boolean equals (Object o) {
		return this.id.equals(((Employee)o).id) ;
	}
	
}
