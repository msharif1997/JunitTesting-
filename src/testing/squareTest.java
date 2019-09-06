package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class squareTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);
		
//		int expacted = 5;
//		int actual = 2;
//		
//		Assert.assertSame(expacted, actual);
	}

}
