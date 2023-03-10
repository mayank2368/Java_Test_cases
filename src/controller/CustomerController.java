package controller;

import java.util.ArrayList;

import model.Customer;

public class CustomerController {
	
	private ArrayList<Customer> customers;

	public CustomerController() {
		this.customers = new ArrayList<Customer>();
	}
	
	public boolean addNewCustomer(Customer customer) {
		for(Customer c: customers) {
			if(c.getCustomerId() == customer.getCustomerId()) {
				return false;
			}
		}
		customers.add(customer);
		return true;
	}
	
	public int totalCustomers() {
		return customers.size();
	}
	
	

}
