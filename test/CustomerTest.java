import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import controller.CustomerController;
import model.Customer;

public class CustomerTest {

	private static Customer customer;
	private static Customer customer2;
	private static CustomerController cust;
;

	@BeforeClass
	public static void setUpClass() {
		customer= new Customer(100, "Mayank", "Parvatia", 24);
		cust = new CustomerController();
	}
	@Test
	public void testAgeIsPositive() {
		int age= customer.getAge();
		assertEquals(1, Integer.signum(age));
	}
	
	@Test
	public void testValidAge() {
		int age= customer.getAge();
		assertEquals(true, customer.checkAge(age));
	}
	
	@Test
	public void testAddNewCustomer() {
		customer2 = new Customer(101, "Ahmed", "Hasan", 24);
		
		assertEquals(true, cust.addNewCustomer(customer2));
	}
	@Test
	public void testAddNewCustomer2() {
		customer2 = new Customer(101, "Ahmed", "Hasan", 24);
		
		assertEquals(true, cust.addNewCustomer(customer2));
	}
	
}
