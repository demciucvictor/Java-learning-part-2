

package dungeon;

import java.util.*;


public class Human extends MoveableObject{
    
    private Vampires vl;
    private int currentl;
    private int currenth;
    
    public Human(int maxl, int maxh, Vampires vv){
        super(maxl, maxh);
        this.vl=vv;
        currentl=0;
        currenth=0;
        
    }
    
    public void movementWithVampires(String s){
        for(int i=0; i<s.length(); i++){
            move(s.charAt(i));
            vl.removeIfOccupied(currentl, currenth);
            vl.move();
            vl.removeIfOccupied(currentl, currenth);
            
        }
    }
    
    public void movementWithoutVampires(String s){
        for(int i=0; i<s.length(); i++){
            move(s.charAt(i));
            vl.removeIfOccupied(currentl, currenth);
            
            
        }
    }
    
    public void move(char c){ 
        if(c=='w' && currenth-1>=0){ 
            currenth--;
        }else if(c=='d' && currentl+1<super.getMaxl()+1){
            currentl++;
        }else if(c=='s' && currenth+1<super.getMaxh()+1){ 
            currenth++;
        }else if(c=='a' && currentl-1>=0){  
            currentl--;
        }
    }
    
    @Override
    public String toString(){   
        return "@ " + currentl + " " + currenth + "\n" + vl.toString();
    }
    
    public int getL(){
        return currentl;
    }
    
    public int getH(){
        return currenth;
    }
    
    public boolean vampireAt(int l, int h){
        return !vl.checkMovement(new Vampire(super.getMaxl(), super.getMaxh(), l, h));
    }
    
    public int nrVamp(){
        return vl.nrVamp();
    }

}
