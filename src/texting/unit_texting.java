package texting;
import software_texting.*;
public class unit_texting {
	public static void main(String[]args)
	{
		text_triangle text1=new text_triangle();
		text1.check(0,0,0);
		text1.check(1,2,3);
		text1.check(3,4,5);
		text_isoscele_striangle text2=new text_isoscele_striangle();
		text2.check(0,0,0);
		text2.check(2,2,3);
		text2.check(3,4,5);
		text_equilateral_striangle text3=new text_equilateral_striangle();
		text3.check(0,0,0);
		text3.check(2,2,2);
		text3.check(3,4,5);
		text_input text4 =new text_input();
		text4.check("", "", "");
		text4.check("awf", "wa", "w");
		text4.check("1", "-2", "3");
		text4.check("1", "2", "5");
		text4.check("3", "4", "5");
	}
}
//测试一般三角形
class text_triangle{
	public void check(double d1,double d2,double d3)
	{
		triangle t1=new triangle(d1,d2,d3);
		boolean result=t1.checktype_triangle();
		System.out.println(d1+","+d2+","+d3+"一般三角形判断结果为:"+result);
	}
}
//测试等腰三角形类
class text_isoscele_striangle
{
	public void check(double d1,double d2,double d3)
	{
		isoscele_striangle t1=new isoscele_striangle(d1,d2,d3);
		boolean result=t1.checktype_isoscele_striangle();
		System.out.println(d1+","+d2+","+d3+"等腰三角形判断结果为:"+result);
	}
}
//测试等边三角形类
class text_equilateral_striangle
{
	public void check(double d1,double d2,double d3)
	{
		equilateral_striangle t1=new equilateral_striangle(d1,d2,d3);
		boolean result=t1.checktype_equilateral_striangle();
		System.out.println(d1+","+d2+","+d3+"等边三角形判断结果为:"+result);
	}
}
//测试ui界面输入判断
class text_input
{
	public void check(String s1,String s2,String s3)
	{
		UI ui=new UI();
		boolean result=ui.setdata(s1, s2, s3);
		System.out.println(s1+","+s2+","+s3+"输入是否合法判断结果为:"+result);
	}
}