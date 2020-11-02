package software_texting;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {
	
	@Test
	public void testChecksum() {
		triangle t1=new triangle(0,0,0);
		
		boolean actual=t1.checksum(3,4,5);
		boolean expected=true;
		assertEquals(expected,actual);
	}

	@Test
	public void testCheckcha() {
		triangle t1=new triangle(1,2,4);
		
		boolean actual=t1.checkcha(1,1,1);
		boolean expected=true;
		assertEquals(expected,actual);
	}

	@Test
	public void testChecktype_triangle() {
		triangle t1=new triangle(3,4,5);
		
		boolean actual=t1.checktype_triangle();
		boolean expected=true;
		assertEquals(expected,actual);
	}

}
