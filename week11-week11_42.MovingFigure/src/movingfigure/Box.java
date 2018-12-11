

package movingfigure;

import java.awt.Graphics;


public class Box extends Figure{
    
    private int width;
    private int height;
    
    public Box(int x, int y, int w, int h){
        super(x,y);
        this.height=h;
        this.width=w;
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(super.getX(), super.getY(), width, height);
    }

}
