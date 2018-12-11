package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame=new JFrame("");
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        GridLayout gl=new GridLayout(3, 1);
        container.setLayout(gl);
        JTextField topArea=new JTextField();
        JButton button=new JButton("Copy!");
        JLabel bottomArea=new JLabel();
        
        ActionEventListener ael=new ActionEventListener(topArea,bottomArea);
        button.addActionListener(ael);
        container.add(topArea);
        container.add(button);
        container.add(bottomArea);
    }
}
