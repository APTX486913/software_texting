package software_texting;

import static org.junit.Assert.*;

import org.junit.Test;
//�ȱ������β�����
public class equilateral_striangleTest {


	//�Ƿ�Ϊ�ȱ������β�����
	@Test
	public void testChecktype_equilateral_striangle() {
		equilateral_striangle t1=new equilateral_striangle(4,4,4);
		
		boolean actual=t1.checktype_equilateral_striangle();
		boolean expected=true;
		assertEquals(expected,actual);
	}
	//�������ֽ��������
	@Test
	public void testGetMessage() {
		equilateral_striangle t1=new equilateral_striangle(4,4,4);
		t1.checktype_equilateral_striangle();
		String actual=t1.getMessage();
		String expected="�߳����ڵȱ�������";
		assertEquals(expected,actual);
	}
}
