import static org.junit.Assert.*;

import org.junit.Test;

import model.Account;
import model.Bank;
import model.Customer;

import org.junit.BeforeClass;

/**
 *
 * @author dell
 */
public class AccountTest {

	private static Bank bank1;
	private static Bank bank2;
    private static Account account1;
    private static Account account2;
    private static Customer customer1;
    private static Customer customer2;
    
    public AccountTest() {
        
    }

    @BeforeClass
    public static void setUpClass() {
    	customer1 = new Customer(100, "Fernando", "Alonso", 24);
    	customer2 = new Customer(101, "John", "Doe", 24);
    	bank1 = new Bank("SP101", "Sparkasse");
    	bank2 = new Bank("COM212", "Commerz Bank");
        account1 = new Account(customer1, 1001, "debit", 1200, bank1);
        account2 = new Account(customer2, 1002, "debit", 850, bank2);
       
    }

    
//    @Test
//    public void testMakeTransaction() {
//        System.out.println("Transfer amount from one account to another");
//        //amount to be transferred
//        double amount = 50;
//        account1.transfer(account2, amount);
//        double account1Balance = 1145;
//        double account2Balance = 900;
//        
//        //check if the program calculates total balance correctly for account1
//        assertEquals(account1Balance, account1.getBalance(), 0.1);
//        //check if the program calculates total balance correctly for account2
//        assertEquals(account2Balance, account2.getBalance(), 0.1);
//    } 
    
    @Test
    public void testWithdrawAmount() {
    	System.out.println("Withdraw amount from self account");
    	//amount to be withdrawn
    	double amount = 100;
    	double remainingBalance = account1.getBalance() - amount;
    	account1.withdraw(amount, "SP101");
    	
    	assertEquals(remainingBalance, account1.getBalance(), 0.1);
    	account1.withdraw(amount, "COM212");
    	assertEquals(993, account1.getBalance(), 0.1);
    }
    
    @Test
    public void testDepositAmount() {
    	System.out.println("Deposit amount to self account");
    	//amount to be deposited
    	double amount = 100;
    	double updatedBalance = account1.getBalance() + amount;
    	account1.deposit(amount);
    	assertEquals(updatedBalance, account1.getBalance(), 0.1);
    }
    
}

