package software_texting;


///�ȱ�������
public class equilateral_striangle extends isoscele_striangle{
	//��д���캯��
	public equilateral_striangle(double l1, double l2, double l3) {
		super(l1, l2, l3);

			this.line1=l1;
			this.line2=l2;
			this.line3=l3;
		// TODO Auto-generated constructor stub
	}
	//�ȱ��������ж�
	public boolean checktype_equilateral_striangle()
	{
		if(checktype_isoscele_striangle())
		{
			if(line1==line2 && line2 ==line3)
			{
				this.message="�߳����ڵȱ�������";
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
	
	//��ȡ���
	public String getMessage()
	{
		return message;
	}
	
}