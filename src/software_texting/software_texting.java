

package software_texting;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class software_texting {
	static double num1;
	static double num2;
	static double num3;
    private static void createAndShowGUI() {

        JPanel main_panal=new JPanel();

        JFrame frame = new JFrame("�����������ж�");
        frame.setSize(500, 300);

        JLabel label = new JLabel("���������߳�");
        
    	JTextField line1 = new JTextField(); // ����һ�����������
    	line1.setEditable(true); // �������������༭
    	line1.setColumns(11); // ���������ĳ���Ϊ11���ַ�
    	main_panal.add(line1); // ���������ӵ��������
    	
    	JTextField line2 = new JTextField(); // ����һ�����������
    	line2.setEditable(true); // �������������༭
    	line2.setColumns(11); // ���������ĳ���Ϊ11���ַ�
    	main_panal.add(line2); // ���������ӵ��������
    	
    	JTextField line3 = new JTextField(); // ����һ�����������
    	line3.setEditable(true); // �������������༭
    	line3.setColumns(11); // ���������ĳ���Ϊ11���ַ�
    	main_panal.add(line3); // ���������ӵ��������
    	
    	JButton buttom=new JButton("���");
    	buttom.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				num1=Double.valueOf(line1.getText());
				num2=Double.valueOf(line1.getText());
				num3=Double.valueOf(line1.getText());
				equilateral_striangle tr=new equilateral_striangle(num1,num2,num3);
				tr.checktype_equilateral_striangle();
			}});
    	
    	
        frame.add(main_panal);
        main_panal.add(label);
        main_panal.add(line1);
        main_panal.add(line2);
        main_panal.add(line3);
        main_panal.add(buttom);

        frame.setVisible(true);
    }

    public static void main(String[]args) {
        // ��ʾӦ�� GUI
        createAndShowGUI();
        
        
    	

    }
}

class triangle{
	protected double line1;
	protected double line2;
	protected double line3;
	
	triangle(double l1,double l2,double l3){
		if(l1<=0 || l2 <=0 ||l3<=0)
		{
			System.out.print("�߳����Ϸ�");
		}
		else
		{
			this.line1=l1;
			this.line1=l2;
			this.line1=l3;
		}
        
    }
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
	public boolean checktype_triangle()
	{
		if(checksum(line1,line2,line3) && checkcha(line1,line2,line3))
		{
			System.out.println("�߳���������������");
			return true;
		}
		else
		{
			System.out.println("�߳�������������");
			return false;
		}
	}
}
class isoscele_striangle extends triangle{

	isoscele_striangle(double l1, double l2, double l3) {
		super(l1, l2, l3);
		if(l1<=0 || l2 <=0 ||l3<=0)
		{
			System.out.println("�߳����Ϸ�");
		}
		else
		{
			this.line1=l1;
			this.line1=l2;
			this.line1=l3;
		}
		
		// TODO Auto-generated constructor stub
	}
	public boolean checktype_isoscele_striangle()
	{
		if(checktype_triangle())
		{
			if(line1==line2 || line2 ==line3 || line1==line3)
			{
				System.out.println("�߳����ڵ���������");
				return true;
			}
			else 
			{
				System.out.println("�߳������ڵ���������");
				return false;
			}
			
		}
		else 
		{
			System.out.println("�߳������ڵ���������");
			return false;
		}
	}
	
}
class equilateral_striangle extends isoscele_striangle{

	equilateral_striangle(double l1, double l2, double l3) {
		super(l1, l2, l3);
		if(l1<=0 || l2 <=0 ||l3<=0)
		{
			System.out.println("�߳����Ϸ�");
		}
		else
		{
			this.line1=l1;
			this.line1=l2;
			this.line1=l3;
		}
		// TODO Auto-generated constructor stub
	}
	public boolean checktype_equilateral_striangle()
	{
		if(checktype_isoscele_striangle())
		{
			if(line1==line2 && line2 ==line3)
			{
				System.out.println("�߳����ڵȱ�������");
				return true;
			}
			else 
			{
				System.out.println("�߳������ڵȱ�������");
				return false;
			}
			
		}
		else 
		{
			System.out.println("�߳������ڵȱ�������");
			return false;
		}
	}
	
}