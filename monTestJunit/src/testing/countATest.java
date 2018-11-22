package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		CalculationApp myApp=new CalculationApp();
		int output1=myApp.countA("Friday");
		int output2=myApp.countA("Saturday");
		assertEquals(1,output1);
		assertEquals(2,output2);
	}

}
