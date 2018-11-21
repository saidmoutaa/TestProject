package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		CalculationApp myApp=new CalculationApp();
		int output1=myApp.countA("Friday");
		int output2=myApp.countA("Saturday");
		assertEquals(1,output1);
		assertEquals(2,output2);
	}

}
