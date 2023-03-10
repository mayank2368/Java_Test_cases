package model;


/**
 * represents a bank account
 *
 */
public class Account {

	// the customer
	private Customer customer;
	// the account number
	private int accountNumber;
	// type of the account (saving, current)
	private String accountType;
	// the account balance
	private double balance;
	private Bank bank;

	private static final int DEDUCTION = 5;

	/**
	 * Constructor for objects of class Account
	 *
	 * @param customer      the customer object
	 * @param accountNumber the account number
	 */
	public Account(Customer customer, int accountNumber, String accountType, double balance, Bank bank) {
		this.customer = customer;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.bank = bank;
	}

	/**
	 * returns the account number
	 *
	 * @return the account number
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * returns the customer full name
	 *
	 * @return the customer full name
	 */
	public String getCustomerName() {
		return (customer.getFirstName() + " " + customer.getLastName());
	}

	/**
	 * returns the balance
	 *
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	// *********************************

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount, String bankId) {
		if (amount > balance) {
			System.out.println("Insufficient funds.");
			return;
		}
		if (bankId != null) {
			if (!(this.bank.getBankId().equals(bankId))) {
				if (amount <= 50) {
					balance -= 5;
				} else if (amount > 50 && amount <= 100) {
					balance -= 7;
				} else if (amount > 100 && amount <= 500) {
					balance -= 10;
				}
				else {
					balance -= 12;
				}
			}
		}

		balance -= amount;
	}

	public void transfer(Account other, double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds.");
			return;
		}
		if (!(this.bank.getBankId().equals(other.bank.getBankId()))) {
			deductCharges();
		}
		withdraw(amount, null);
		other.deposit(amount);
		System.out.println(
				"$" + amount + " transferred from account " + accountNumber + " to account " + other.accountNumber);
	}

	private void deductCharges() {
		balance -= DEDUCTION;
	}

}