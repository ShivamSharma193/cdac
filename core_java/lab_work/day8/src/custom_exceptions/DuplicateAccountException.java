package custom_exceptions;

public class DuplicateAccountException extends Exception {
	public DuplicateAccountException(String message){
		super(message) ;
	}

}
