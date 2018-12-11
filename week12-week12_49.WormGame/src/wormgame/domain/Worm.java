

package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import wormgame.Direction;


public class Worm {
    
    private List<Piece> worm;
    private Direction dir;
    private boolean allowGrowth;
    
    public Worm(int originalX, int originalY, Direction originalDirection){
        this.dir=originalDirection;
        this.worm=new ArrayList<Piece>();
        this.worm.add(new Piece(originalX, originalY));
        this.allowGrowth=false;
    }
    
    public Direction getDirection(){
        return dir;
    }
    
    public void setDirection(Direction dir){
        this.dir=dir;
    }
    
    public int getLength(){
        return worm.size();
    }
    
    public List<Piece> getPieces(){
        return worm;
    }
    
    public void move(){
        if(worm.size()<3){
            grow();
        }
        Piece temp=worm.get(worm.size()-1);
        if(null!=dir)switch (dir) {
            case DOWN:
                worm.add(new Piece(temp.getX(), temp.getY()+1));
                break;
            case LEFT:
                worm.add(new Piece(temp.getX()-1, temp.getY()));
                break;
            case RIGHT:
                worm.add(new Piece(temp.getX()+1, temp.getY()));
                break;
            case UP:
                worm.add(new Piece(temp.getX(), temp.getY()-1));
                break;
            default:
                break;
        }
        if(!allowGrowth){
            worm.remove(0);
        }else{  
            allowGrowth=false;
        }
    }
    
    public void grow(){
        allowGrowth=true;
    }
    
    public boolean runsInto(Piece piece){
        boolean test=false;
        for(Piece t:worm){  
            if(t.getX()==piece.getX() && t.getY()==piece.getY()){
                test=true;
            }
        }
        return test;
    }
    
    public boolean runsIntoItself(){    
        Piece temp=worm.get(worm.size()-1);
        if(worm.size()-1<1){
            return false;
        }else{
            for(int i=0; i<worm.size()-1; i++){
                if(temp.getX()==worm.get(i).getX() && temp.getY()==worm.get(i).getY()){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean hitBorder(int l, int h){
        Piece head=worm.get(worm.size()-1);
        return head.getX()==l || head.getX()==0 || head.getY()==h || head.getY()==0;
    }
    
    

}
