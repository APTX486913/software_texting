//金秋
//2020.10.30
//修改了类的内容，类的逻辑更清晰

package software_texting;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//主类
public class software_texting {

    public static void main(String[]args) {
        // 显示应用 GUI
    	UI ui=new UI();
        ui.createAndShowGUI();
        ui.addZuJian();
        ui.setAction();
    }
}
//ui界面类
class UI
{
		//储存键盘输入值
		static double num1;
		static double num2;
		static double num3;
		//页面组件
		private static JFrame frame = new JFrame("三角形类型判断");
		private static JPanel main_panal=new JPanel();
		private static JPanel  top_panal=new JPanel();
		private static JPanel  bottom_panal=new JPanel();
		
		private static JLabel label = new JLabel("请输入三边长");
		private static JButton buttom=new JButton("检查");
		private static JTextField result=new JTextField(30);
		private static JTextField line1 = new JTextField(); // 创建一个单行输入框
		private static JTextField line2 = new JTextField(); // 创建一个单行输入框
		private static JTextField line3 = new JTextField(); // 创建一个单行输入框
		//页面创建函数
	    public static void createAndShowGUI() {
	        frame.setSize(500, 300);
	        
	    	line1.setEditable(true); // 设置输入框允许编辑
	    	line1.setColumns(11); // 设置输入框的长度为11个字符
	    	main_panal.add(line1); // 在面板上添加单行输入框
	    	
	    	
	    	line2.setEditable(true); // 设置输入框允许编辑
	    	line2.setColumns(11); // 设置输入框的长度为11个字符
	    	main_panal.add(line2); // 在面板上添加单行输入框
	    	
	    	
	    	line3.setEditable(true); // 设置输入框允许编辑
	    	line3.setColumns(11); // 设置输入框的长度为11个字符
	    	main_panal.add(line3); // 在面板上添加单行输入框
	    	
	    	result.setEditable(false);
	    	
	    	main_panal.setLayout(new BoxLayout(main_panal,BoxLayout.Y_AXIS));
	    	top_panal.setLayout(new FlowLayout());
	
	    }
	    //组件添加函数
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
								result.setText("边长不合法");
							}
							else
							{
								equilateral_striangle tr=new equilateral_striangle(num1,num2,num3);
								tr.checktype_equilateral_striangle();
								result.setText(tr.getMessage());
							}
						}
					catch(Exception e){
						result.setText("请输入合法边长");
					}
				}});
	    }
}
///一般三角形
class triangle{
	//三边长
	protected double line1;
	protected double line2;
	protected double line3;
	//返回结果
	protected String message="";
	//构造函数
	triangle(double l1,double l2,double l3){
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

///等腰三角形
class isoscele_striangle extends triangle{
	//重写构造函数
	isoscele_striangle(double l1, double l2, double l3) {
		super(l1, l2, l3);

			this.line1=l1;
			this.line2=l2;
			this.line3=l3;
		// TODO Auto-generated constructor stub
	}
	//等腰三角形判断
	public boolean checktype_isoscele_striangle()
	{
		if(checktype_triangle())
		{
			if(line1==line2 || line2 ==line3 || line1==line3)
			{
				this.message="边长属于等腰三角形";
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

///等边三角形
class equilateral_striangle extends isoscele_striangle{
	//重写构造函数
	equilateral_striangle(double l1, double l2, double l3) {
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