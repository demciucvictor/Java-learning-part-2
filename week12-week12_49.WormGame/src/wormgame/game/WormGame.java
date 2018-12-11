package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Random rng;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);
        
        this.worm=new Worm(width/2, height/2, Direction.DOWN);
        rng=new Random();
        apple=new Apple(rng.nextInt(width), rng.nextInt(height));
        while(worm.runsInto(apple)){
                apple=new Apple(rng.nextInt(width), rng.nextInt(height));
            }

    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        worm.move();
        if(worm.hitBorder(width, height)){
            continues=false;
        }
        if(worm.runsInto(apple)){   
            worm.grow();
            apple=new Apple(rng.nextInt(width), rng.nextInt(height));
            while(worm.runsInto(apple)){
                apple=new Apple(rng.nextInt(width), rng.nextInt(height));
            }
        }else if(worm.runsIntoItself()){
            continues=false;
        }
        updatable.update();
        setDelay(1000 / worm.getLength());
        if (!continues) {
            return;
        }

    }
    
    public Worm getWorm(){
        return worm;
    }
    
    public void setWorm(Worm worm){ 
        this.worm=worm;
    }
    
    public Apple getApple(){
        return apple;
    }
    
    public void setApple(Apple apple){
        this.apple=apple;
    }
    
    

}
