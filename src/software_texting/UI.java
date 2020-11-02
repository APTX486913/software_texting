package software_texting;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//ui界面类
public class UI
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
	    	label.setText("请输入三边长");
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
	    //添加按钮事件
	    public void setAction()
	    {
	    	 buttom.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					setdata(line1.getText(),line2.getText(),line3.getText());
			
				}});
	    }
	    //输入边长并判断输入是否合法
	    public boolean setdata(String n1,String n2,String n3)
	    {
	    	try{
				num1=Double.valueOf(n1);
				num2=Double.valueOf(n2);
				num3=Double.valueOf(n3);
				if(num1<=0 || num2 <=0 || num3<=0)
				{
					result.setText("边长不合法");
					return false;
				}
				else
				{
					result.setText(addobj(num1,num2,num3));
					return true;
				}
			}
			catch(Exception e){
				result.setText("请输入合法边长");
				return false;
			}
		
	    }
	    //新建三角对象并返回判断结果
	    public String addobj(double n1,double n2,double n3) 
	    {
	    	equilateral_striangle tr=new equilateral_striangle(n1,n2,n3);
			tr.checktype_equilateral_striangle();
			return (tr.getMessage());
		}
}