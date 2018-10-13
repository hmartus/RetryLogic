package mytests;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTests {

	@Test
	public void Test1() {
		Assert.assertEquals(true, false);
		
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(true, false);
	}
}
