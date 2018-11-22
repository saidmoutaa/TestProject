package testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class squareTest {

	@Test
	public void test() {
		CalculationApp test =new CalculationApp();
		int output=test.square(5);
		assertEquals(25, output);
	}

}
