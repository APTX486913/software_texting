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



