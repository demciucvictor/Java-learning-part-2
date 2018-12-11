

package clicker.ui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import clicker.applicationlogic.Calculator;


public class ClickListener implements ActionListener{
    
    private Calculator calc;
    private JLabel jl;
    
    public ClickListener(Calculator c, JLabel l){
        this.calc=c;
        this.jl=l;
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        jl.setText(String.valueOf(calc.giveValue()));
    }

}
