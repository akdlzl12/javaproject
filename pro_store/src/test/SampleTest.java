package test;

import org.junit.Assert;
import org.junit.Test;

public class SampleTest {
	
	@Test
	public void testPlus() {
		SampleCalculator cal = new SampleCalculator();
		int result = cal.plus(3,5);
		
		
		Assert.assertEquals(7, result);
	}
	
	@Test
	public void testMinuse() {
		SampleCalculator cal = new SampleCalculator();
		int result = cal.minus(5, 2);
		
		
		Assert.assertEquals(3, result);
	}
	
}
