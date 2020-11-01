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



