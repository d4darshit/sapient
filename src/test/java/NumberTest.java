import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sapient.Number;

class NumberTest {

	private Number ob;
	@BeforeEach
	public void setNumberObject() {
		
		ob = new Number();
	}
	
	@Test
	public void checkPrimeReturnTrue() {
		Assertions.assertEquals(true,ob.checkPrime(5));
	}
	
	@Test
	public void checkPrimeReturnFalse() {
		Assertions.assertEquals(false, ob.checkPrime(10));
	}
	
	@Test
	public void checkArmStrongWhenNumberIsArmstrong() {
		Assertions.assertEquals(true,ob.checkArmstrong(153));
	}
	
	
	@Test
	public void checkArmStrongWhenNumberIsNotAnArmstrong() {
		assertEquals(false,ob.checkArmstrong(150));
	}
	@Test
	public void checlPalindromeReturnTrueWehnPalindrom() {
		assertEquals(true, ob.checkPalindrome(121));
	}
	
	@AfterEach
	public void destroyNumberObject() {
		ob = null;
	}
}
