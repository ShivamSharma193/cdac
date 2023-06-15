package customer;

public class Customer {
	// Instance variables
	int id ;	
	String name ;
	String address ;
	
	// Constructor 
	public Customer(int id, String name, String address) {
		this.id = id ;
		this.name = name ;
		this.address = address ;
	}
	
	@Override
	public String toString() {
		return this.id +" " + this.name +"  "+this.address ; 
	}
	
}
