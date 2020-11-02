package software_texting;

import static org.junit.Assert.*;

import org.junit.Test;

public class UITest {

//	@Test
//	public void testCreateAndShowGUI() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testAddZuJian() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSetAction() {
		UI ui=new UI();
		
		String actual=ui.addobj(3,4,4);
		String expected="边长属于等腰三角形";
		assertEquals(expected,actual);
	}

	@Test
	public void testSetdata() {
		UI ui=new UI();
		
		boolean actual=ui.setdata("-2","3","4");
		boolean expected=false;
		assertEquals(expected,actual);
	}

}
