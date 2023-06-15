package employee;

import custom_exceptions.InsufficientSalaryException;

public class AccountValidation {
	/*
	 * validateSalary => Check if the salary is larger than the min requirment
	 * according to the Dept and Designation
	 * 
	 */
	public static void validateSalary(Double sal, Dept dept, Desig desig) throws InsufficientSalaryException {
		if ((sal < desig.getMIN_SALARY()) && (sal < dept.getMIN_SALARY())) {
			throw new InsufficientSalaryException("Min required salary is. Designation" + desig.name() + " : "
					+ desig.getMIN_SALARY() + "\t" + dept.name() + " : " + dept.getMIN_SALARY());
		}
	}
}
