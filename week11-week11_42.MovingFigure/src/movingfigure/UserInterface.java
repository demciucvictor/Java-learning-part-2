package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure fig;
    
    public UserInterface(Figure f){
        this.fig=f;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard drawing=new DrawingBoard(fig);
        container.add(drawing);
        KeyboardListener kl=new KeyboardListener(drawing, fig);
        frame.addKeyListener(kl);
        
    }

    private void addListeners() {
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
