package model;

/**
 * represents a customer
 * 
 */
public class Customer {
	private int customerId;
	// the first name
	private String firstName;
	// the last name
	private String lastName;
	private int age;

	/**
	 * Constructor for objects of class Customer
	 * 
	 * @param id        id of the customer
	 * @param firstName the first name
	 * @param lastName  the last name
	 * 
	 */
	public Customer(int customerId, String firstName, String lastName, int age) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * returns the first name
	 * 
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * returns the last name
	 * 
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean checkAge(int age) {
		if (age >= 18) {
			return true;
		}
		return false;
	}

}
