package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator c;
    
    public UserInterface(Calculator c){
        this.c=c;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JLabel text=new JLabel("0");
        JButton button= new JButton("Click!");
        ClickListener cl=new ClickListener(c, text);
        button.addActionListener(cl);
        container.add(text);
        container.add(button, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
