package software_texting;

///����������
public class isoscele_striangle extends triangle{
	//��д���캯��
	public isoscele_striangle(double l1, double l2, double l3) {
		super(l1, l2, l3);

			this.line1=l1;
			this.line2=l2;
			this.line3=l3;
		// TODO Auto-generated constructor stub
	}
	//�����������ж�
	public boolean checktype_isoscele_striangle()
	{
		if(checktype_triangle())
		{
			if(line1==line2 || line2 ==line3 || line1==line3)
			{
				this.message="�߳����ڵ���������";
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
	
}
