

package movingfigure;

import java.awt.Graphics;


public class Circle extends Figure{
    
    private int diameter;
    
    public Circle(int x, int y, int d){
        super(x, y);
        this.diameter=d;
    }
    
    @Override
    public void draw(Graphics gr){
        gr.fillOval(super.getX(), super.getY(), diameter, diameter);
    }
    
    

}
