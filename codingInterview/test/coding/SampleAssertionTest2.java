package coding;

import junit.framework.TestCase;

public class SampleAssertionTest2 extends TestCase {

	public void testAssertEquals()
	{
		assertEquals("test", "test");
		
	}
	public void testAssertEqual()
	{
		
		assertEquals("Failure strings are not equal", "Paggy", "Britt");
	}
}
