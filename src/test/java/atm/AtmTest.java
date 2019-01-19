package atm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AtmTest {
	
	@Test 
	public void shouldHaveDefaultBalanceOf100() {
		//arrange
		Atm underTest = new Atm(100,"");
		//act
		int balance = underTest.getBalance();
		//assert
		assertEquals(100, balance);
	}
	
	@Test 
	public void shouldHaveDefaultBalanceOf200() {
		//arrange
		Atm underTest = new Atm(200, "");
		//act
		int balance = underTest.getBalance();
		//assert
		assertEquals(200, balance);
	}
	@Test
	public void shouldHaveBalanceOf100AfterWithdrawOf100() {
		Atm underTest = new Atm(200, "");
		underTest.withdraw(100);
		int balance = underTest.getBalance();
		assertEquals(100, balance);
	}			
	@Test
	public void shouldHaveBalanceOf0AfterWithdrawOf300() {
		Atm underTest = new Atm(200, "");
		underTest.withdraw(300);
		int balance = underTest.getBalance();
		assertEquals(0, balance);
	}
	@Test
	public void shouldHaveBalanceOf200AfterDepositOf() {
		Atm underTest = new Atm (0, "");
		underTest.deposit (100);
		int balance = underTest.getBalance();
		assertEquals(100, balance);
	}
	@Test
	public void shouldAllowAccessByPin() {
		Atm underTest = new Atm(0, "1234");
		boolean access = underTest.allowAccess("1234");
		assertTrue(access);
			}
	@Test
	public void shouldDenyAccessByPin() {
		Atm underTest = new Atm(0, "1234");
		boolean access = underTest.allowAccess("1235");
		assertFalse(access);
			}
}
