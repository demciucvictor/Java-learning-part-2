

package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyboardListener implements KeyListener{
    
    private Component component;
    private Figure fig;
    
    public KeyboardListener(Component c, Figure f){
        this.component=c;
        this.fig=f;
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            fig.move(1, 0);
            component.repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){ 
            fig.move(-1, 0);
            component.repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            fig.move(0, -1);
            component.repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            fig.move(0, 1);
            component.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }



}
