package software_texting;

import static org.junit.Assert.*;

import org.junit.Test;

public class isoscele_striangleTest {



	@Test
	public void testChecktype_isoscele_striangle() {
		isoscele_striangle t1=new isoscele_striangle(2,4,4);
		
		boolean actual=t1.checktype_isoscele_striangle();
		boolean expected=true;
		assertEquals(expected,actual);
	}

}
