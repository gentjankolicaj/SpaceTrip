package org.app.motion;
import org.junit.Before;
import org.junit.Test;

public class MotionFunctionTypeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetValue() {
		AlienMotionFunctionType[] array=AlienMotionFunctionType.values();
		
		for(AlienMotionFunctionType var:array)
			System.out.println(var.getValue());
	}

}
