package org.app.motion;
import org.app.entities.MotionFunctionType;
import org.junit.Before;
import org.junit.Test;

public class MotionFunctionTypeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetValue() {
		MotionFunctionType[] array=MotionFunctionType.values();
		
		for(MotionFunctionType var:array)
			System.out.println(var.getValue());
	}

}
