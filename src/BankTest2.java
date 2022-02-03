import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Sofia Rhoades Ortega - scrhoadesortega
 * CIS175 - Fall 2021
 * Feb 2, 2022
 */

public class BankTest2 {
	String name = "Sage";
	double initalBalence = 172.03;
	boolean premiumAccount = true;
	BankAccount account = new BankAccount(name, initalBalence, premiumAccount);
	
	@Before
	public void setUp() throws Exception {	
	}

	@Test
	public void testIntialBalence() {
		double balence = account.getBalence();
		assertEquals(initalBalence, balence, 0.0);
	}
	
	@Test
	public void testIfPremium() {
		assertTrue(account.isPremiumAccount());
	}

}
