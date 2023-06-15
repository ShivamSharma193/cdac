package employee;

public enum Dept {
	FINANCE(250000.0), HR(30000.0), OPERATIONS(25000.0), RND(30000.0) ;
	private Double MIN_SALARY ;
	Dept(Double MIN_SALARY) {
		this.MIN_SALARY = MIN_SALARY ;
	}
	public Double getMIN_SALARY() {
		return MIN_SALARY;
	}
	
	
	
}
