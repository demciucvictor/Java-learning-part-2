

package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionEventListener implements ActionListener{
    
    private JTextField top;
    private JLabel bottom;
    
    public ActionEventListener(JTextField a, JLabel b){
        this.top=a;
        this.bottom=b;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        bottom.setText(top.getText());
        top.setText("");
    }
    
    
    

}
