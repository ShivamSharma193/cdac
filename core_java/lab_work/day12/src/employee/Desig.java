package employee;

public enum Desig {
	MANAGER(50000.0), SENIOR(60000.0), JUNIOR(40000.0), INTERN(30000.0);
	private Double MIN_SALARY;
	
	Desig (Double MIN_SALARY) {
		this.MIN_SALARY = MIN_SALARY;
	}

	public Double getMIN_SALARY() {
		return MIN_SALARY;
	}
	
	
}
