package utils;


import custom_exceptions.InsufficientSalaryException;
import employee.Dept;
import employee.Desig;

public class AccountValidation {
	public static void validateSalary(Double sal, Dept dept, Desig desig) throws InsufficientSalaryException{
		if ((sal < desig.getMIN_SALARY()) && (sal < dept.getMIN_SALARY())) {
			throw new  InsufficientSalaryException("Min required salary is. Designation"+desig.name()+" : "+ desig.getMIN_SALARY() +"\t"+dept.name()+" : "+ dept.getMIN_SALARY() );
		}
	}
}
