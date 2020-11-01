package software_texting;

///一般三角形
public class triangle{
	//三边长
	protected double line1;
	protected double line2;
	protected double line3;
	//返回结果
	protected String message="";
	//构造函数
	public triangle(double l1,double l2,double l3){
			this.line1=l1;
			this.line2=l2;
			this.line3=l3;
  }
	
	//两边和判断
	public boolean checksum(double l1,double l2,double l3)
	{
		if((l1+l2)>l3)
		{
			if((l2+l3)>l1)
			{
				if((l1+l3)>l2)
				{
					return true;
				}
			}
			
		}
		return false;
		
	}
	//两边差判断
	public boolean checkcha(double l1,double l2,double l3)
	{
		if((l1-l2)<l3)
		{
			if((l2-l3)<l1)
			{
				if((l1-l3)<l2)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	//判断一般三角形
	public boolean checktype_triangle()
	{
		if(checksum(line1,line2,line3) && checkcha(line1,line2,line3))
		{
			this.message="边长属于一般三角形";
			return true;
		}
		else
		{
			this.message="边长不构成三角形";
			return false;
		}
	}
}