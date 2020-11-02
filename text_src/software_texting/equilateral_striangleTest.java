package software_texting;

import static org.junit.Assert.*;

import org.junit.Test;
//等边三角形测试类
public class equilateral_striangleTest {


	//是否为等边三角形测试类
	@Test
	public void testChecktype_equilateral_striangle() {
		equilateral_striangle t1=new equilateral_striangle(4,4,4);
		
		boolean actual=t1.checktype_equilateral_striangle();
		boolean expected=true;
		assertEquals(expected,actual);
	}
	//返回文字结果测试类
	@Test
	public void testGetMessage() {
		equilateral_striangle t1=new equilateral_striangle(4,4,4);
		t1.checktype_equilateral_striangle();
		String actual=t1.getMessage();
		String expected="边长属于等边三角形";
		assertEquals(expected,actual);
	}
}
