package testing;

import static org.junit.Assert.*;
import org.junit.Test;


public class SquareTest {

	@Test
	public void test() {
		CalculationApp test =new CalculationApp();
		int output=test.square(5);
		assertEquals(25, output);
	}

}
