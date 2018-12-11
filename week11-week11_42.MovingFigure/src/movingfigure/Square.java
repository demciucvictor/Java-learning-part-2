

package movingfigure;

import java.awt.Graphics;


public class Square extends Figure{
    
    private int length;
    
    public Square(int x, int y, int l){
        super(x, y);
        this.length=l;
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(super.getX(), super.getY(), length, length);
    }

}
