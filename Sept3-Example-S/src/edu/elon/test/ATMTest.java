/**
 * 
 */
package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mlee21
 *
 */
public class ATMTest {

	ATM atm;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		atm = new ATM(5);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		atm = null;
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#deposit(double)}.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testDeposit() {
		double amount = 1.0;
		double expected = 1.0 + 5;
		atm.deposit(amount);
		double testBalence = atm.getBalance();
		assertEquals(expected,testBalence, 0);
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#deposit(double)}.
	 */
	//@SuppressWarnings("deprecation")
	@Test(expected = IllegalArgumentException.class)
	public void testDeposit2() {
		double amount = -1.0;
		atm.deposit(amount);
	}
	
	/**
	 * Test method for {@link edu.elon.test.ATM#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		double expected = 5;
		double actual = atm.getBalance();
		assertEquals(expected,actual,0);
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#toString()}.
	 */
	@Test
	public void testToString() {
		String expected = "Amount balance is $5.00";
		String actual = atm.toString();
		assertEquals(expected,actual);
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#withdraw(double)}.
	 */
	@Test
	public void testWithdraw() {
		double amount = 1;
		double expected = 5 - amount;
		atm.withdraw(amount);
		double actual = atm.getBalance();
		assertEquals(expected,actual,0);
	}
	
	/**
	 * Test method for {@link edu.elon.test.ATM#withdraw(double)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testWithdraw2() {
		double amount = -1;
		atm.withdraw(amount);
	}
	
	/**
	 * Test method for {@link edu.elon.test.ATM#withdraw(double)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testWithdraw3() {
		double amount = 10;
		atm.withdraw(amount);
	}

}
