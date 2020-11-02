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

//ui������
public class UI
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
	    	label.setText("���������߳�");
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
	    //��Ӱ�ť�¼�
	    public void setAction()
	    {
	    	 buttom.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					setdata(line1.getText(),line2.getText(),line3.getText());
			
				}});
	    }
	    //����߳����ж������Ƿ�Ϸ�
	    public boolean setdata(String n1,String n2,String n3)
	    {
	    	try{
				num1=Double.valueOf(n1);
				num2=Double.valueOf(n2);
				num3=Double.valueOf(n3);
				if(num1<=0 || num2 <=0 || num3<=0)
				{
					result.setText("�߳����Ϸ�");
					return false;
				}
				else
				{
					result.setText(addobj(num1,num2,num3));
					return true;
				}
			}
			catch(Exception e){
				result.setText("������Ϸ��߳�");
				return false;
			}
		
	    }
	    //�½����Ƕ��󲢷����жϽ��
	    public String addobj(double n1,double n2,double n3) 
	    {
	    	equilateral_striangle tr=new equilateral_striangle(n1,n2,n3);
			tr.checktype_equilateral_striangle();
			return (tr.getMessage());
		}
}