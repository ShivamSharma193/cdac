package custom_exceptions;

public class InsufficientSalaryException extends Exception{
	public InsufficientSalaryException(String message) {
		super(message) ;
	}
}
