package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		CalculationApp test =new CalculationApp();
		int output=test.square(5);
		assertEquals(25, output);
	}

}
