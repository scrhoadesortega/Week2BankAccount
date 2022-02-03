import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Sofia Rhoades Ortega - scrhoadesortega
 * CIS175 - Fall 2021
 * Feb 2, 2022
 */

public class BankTest1 {
	String name = "Jesse";
	double initalBalence = 24.73;
	boolean premiumAccount = false;
	BankAccount account = new BankAccount(name, initalBalence, premiumAccount);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWithdraw() {
		double balence = account.getBalence();
		double withdrawAmt = 12.5;
		account.withdraw(withdrawAmt);
		assertEquals(balence-withdrawAmt, account.getBalence(), 0.0);
	}
	
	@Test
	public void testDeposit() {
		double balence = account.getBalence();
		double depositAmt = 10.5;
		account.deposit(depositAmt);
		assertEquals(balence+depositAmt, account.getBalence(), 0.0);
	}
	
	@Test
	public void testToStringNotNull() {
		assertNotNull(account.toString());
	}

}
