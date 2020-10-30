//����
//2020.10.30
//�޸���������ݣ�����߼�������

package software_texting;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//����
public class software_texting {

    public static void main(String[]args) {
        // ��ʾӦ�� GUI
    	UI ui=new UI();
        ui.createAndShowGUI();
        ui.addZuJian();
        ui.setAction();
    }
}
//ui������
class UI
{
		//�����������ֵ
		static double num1;
		static double num2;
		static double num3;
		//ҳ�����
		private static JFrame frame = new JFrame("�����������ж�");
		private static JPanel main_panal=new JPanel();
		private static JPanel  top_panal=new JPanel();
		private static JPanel  bottom_panal=new JPanel();
		
		private static JLabel label = new JLabel("���������߳�");
		private static JButton buttom=new JButton("���");
		private static JTextField result=new JTextField(30);
		private static JTextField line1 = new JTextField(); // ����һ�����������
		private static JTextField line2 = new JTextField(); // ����һ�����������
		private static JTextField line3 = new JTextField(); // ����һ�����������
		//ҳ�洴������
	    public static void createAndShowGUI() {
	        frame.setSize(500, 300);
	        
	    	line1.setEditable(true); // �������������༭
	    	line1.setColumns(11); // ���������ĳ���Ϊ11���ַ�
	    	main_panal.add(line1); // ���������ӵ��������
	    	
	    	
	    	line2.setEditable(true); // �������������༭
	    	line2.setColumns(11); // ���������ĳ���Ϊ11���ַ�
	    	main_panal.add(line2); // ���������ӵ��������
	    	
	    	
	    	line3.setEditable(true); // �������������༭
	    	line3.setColumns(11); // ���������ĳ���Ϊ11���ַ�
	    	main_panal.add(line3); // ���������ӵ��������
	    	
	    	result.setEditable(false);
	    	
	    	main_panal.setLayout(new BoxLayout(main_panal,BoxLayout.Y_AXIS));
	    	top_panal.setLayout(new FlowLayout());
	
	    }
	    //�����Ӻ���
	    public void addZuJian()
	    {
	    	frame.add(main_panal);
	        main_panal.add(top_panal);
	        main_panal.add(bottom_panal);
	        top_panal.add(label);
	        top_panal.add(line1);
	        top_panal.add(line2);
	        top_panal.add(line3);
	        top_panal.add(buttom);
	        bottom_panal.add(result);
	        frame.setVisible(true);
	    }
	    public void setAction()
	    {
	    	 buttom.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					try{
							// TODO Auto-generated method stub
							num1=Double.valueOf(line1.getText());
							num2=Double.valueOf(line2.getText());
							num3=Double.valueOf(line3.getText());
						
							if(num1<=0 || num2 <=0 ||num3<=0)
							{
								result.setText("�߳����Ϸ�");
							}
							else
							{
								equilateral_striangle tr=new equilateral_striangle(num1,num2,num3);
								tr.checktype_equilateral_striangle();
								result.setText(tr.getMessage());
							}
						}
					catch(Exception e){
						result.setText("������Ϸ��߳�");
					}
				}});
	    }
}
///һ��������
class triangle{
	//���߳�
	protected double line1;
	protected double line2;
	protected double line3;
	//���ؽ��
	protected String message="";
	//���캯��
	triangle(double l1,double l2,double l3){
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

///����������
class isoscele_striangle extends triangle{
	//��д���캯��
	isoscele_striangle(double l1, double l2, double l3) {
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

///�ȱ�������
class equilateral_striangle extends isoscele_striangle{
	//��д���캯��
	equilateral_striangle(double l1, double l2, double l3) {
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