package software_texting;

///һ��������
public class triangle{
	//���߳�
	protected double line1;
	protected double line2;
	protected double line3;
	//���ؽ��
	protected String message="";
	//���캯��
	public triangle(double l1,double l2,double l3){
			this.line1=l1;
			this.line2=l2;
			this.line3=l3;
  }
	
	//���ߺ��ж�
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
	//���߲��ж�
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
	
	//�ж�һ��������
	public boolean checktype_triangle()
	{
		if(checksum(line1,line2,line3) && checkcha(line1,line2,line3))
		{
			this.message="�߳�����һ��������";
			return true;
		}
		else
		{
			this.message="�߳�������������";
			return false;
		}
	}
}