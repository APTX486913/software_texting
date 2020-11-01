package software_texting;


///等边三角形
public class equilateral_striangle extends isoscele_striangle{
	//重写构造函数
	public equilateral_striangle(double l1, double l2, double l3) {
		super(l1, l2, l3);

			this.line1=l1;
			this.line2=l2;
			this.line3=l3;
		// TODO Auto-generated constructor stub
	}
	//等边三角形判断
	public boolean checktype_equilateral_striangle()
	{
		if(checktype_isoscele_striangle())
		{
			if(line1==line2 && line2 ==line3)
			{
				this.message="边长属于等边三角形";
				return true;
			}
			else 
			{
				return false;
			}
			
		}
		else 
		{
			return false;
		}
	}
	
	//获取结果
	public String getMessage()
	{
		return message;
	}
	
}