

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

        JFrame frame = new JFrame("三角形类型判断");
        frame.setSize(500, 300);

        JLabel label = new JLabel("请输入三边长");
        
    	JTextField line1 = new JTextField(); // 创建一个单行输入框
    	line1.setEditable(true); // 设置输入框允许编辑
    	line1.setColumns(11); // 设置输入框的长度为11个字符
    	main_panal.add(line1); // 在面板上添加单行输入框
    	
    	JTextField line2 = new JTextField(); // 创建一个单行输入框
    	line2.setEditable(true); // 设置输入框允许编辑
    	line2.setColumns(11); // 设置输入框的长度为11个字符
    	main_panal.add(line2); // 在面板上添加单行输入框
    	
    	JTextField line3 = new JTextField(); // 创建一个单行输入框
    	line3.setEditable(true); // 设置输入框允许编辑
    	line3.setColumns(11); // 设置输入框的长度为11个字符
    	main_panal.add(line3); // 在面板上添加单行输入框
    	
    	JButton buttom=new JButton("检查");
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
        // 显示应用 GUI
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
			System.out.print("边长不合法");
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
			System.out.println("边长属于正常三角形");
			return true;
		}
		else
		{
			System.out.println("边长不构成三角形");
			return false;
		}
	}
}
class isoscele_striangle extends triangle{

	isoscele_striangle(double l1, double l2, double l3) {
		super(l1, l2, l3);
		if(l1<=0 || l2 <=0 ||l3<=0)
		{
			System.out.println("边长不合法");
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
				System.out.println("边长属于等腰三角形");
				return true;
			}
			else 
			{
				System.out.println("边长不属于等腰三角形");
				return false;
			}
			
		}
		else 
		{
			System.out.println("边长不属于等腰三角形");
			return false;
		}
	}
	
}
class equilateral_striangle extends isoscele_striangle{

	equilateral_striangle(double l1, double l2, double l3) {
		super(l1, l2, l3);
		if(l1<=0 || l2 <=0 ||l3<=0)
		{
			System.out.println("边长不合法");
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
				System.out.println("边长属于等边三角形");
				return true;
			}
			else 
			{
				System.out.println("边长不属于等边三角形");
				return false;
			}
			
		}
		else 
		{
			System.out.println("边长不属于等边三角形");
			return false;
		}
	}
	
}