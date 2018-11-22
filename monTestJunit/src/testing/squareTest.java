package testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


class squareTest {

	@Test
	void test() {
		CalculationApp test =new CalculationApp();
		int output=test.square(5);
		assertEquals(25, output);
	}

}
