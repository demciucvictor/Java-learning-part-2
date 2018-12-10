
package movable;

import java.util.*;

public class Group implements Movable{
    
    private ArrayList<Movable> theGroup;
    
    public Group(){ 
        this.theGroup=new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable){    
        theGroup.add(movable);
    }
    
    @Override
    public String toString(){
        String temp="";
        for(Movable mov:theGroup){
            temp+=mov.toString()+"\n";
        }
        return temp;
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable mov:theGroup){  
            mov.move(dx, dy);
        }
    }
    
}
