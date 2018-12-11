

package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;


public class CompoundFigure extends Figure{
    
    ArrayList<Figure> figures;

    public CompoundFigure() {
        super(0, 0);
        figures=new ArrayList<Figure>();
    }
    
    public void add(Figure f){
        figures.add(f);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Figure temp:figures){
            temp.move(dx, dy);
        }
    }
    

    @Override
    public void draw(Graphics g) {
        for(Figure temp:figures){
            temp.draw(g);
        }
    }

}
