

package movingfigure;

import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawingBoard extends JPanel{
    
    private Figure fig;
    
    public DrawingBoard(Figure f){
        this.fig=f;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        fig.draw(g);
    }

}
