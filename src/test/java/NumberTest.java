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
		Assertions.assertEquals(1,ob.checkPrime(11));
	}
	@Test
	public void checkPrimeReturnFalse() {
		Assertions.assertEquals(0, ob.checkPrime(10));
	}
	
	
	@AfterEach
	public void destroyNumberObject() {
		ob = null;
	}
}
