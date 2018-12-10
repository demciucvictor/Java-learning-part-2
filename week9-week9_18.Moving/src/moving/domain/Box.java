
package moving.domain;

import java.util.*;

public class Box implements Thing{
    private int maxcap;
    private ArrayList<Thing> Things;
    
    public Box(int maximumCapacity){    
        this.maxcap=maximumCapacity;
        this.Things = new ArrayList<Thing>();
        
    }
    
    public boolean addThing(Thing thing){
        
        if(maxcap-getVolume()-thing.getVolume()<0){
            return false;
        }else{  
            Things.add(thing);
            
            return true;
        }
    }
    
    
    @Override
    public int getVolume() {
        int i=0;
        for(Thing t : Things){  
            i+=t.getVolume();
        }
        return i;
    }
    
    public void emptyBox(){ 
        Things.clear();
    }
    @Override
    public String toString(){ 
        String finall="";
        for(Thing t : this.Things){ 
            finall=finall+t+"\n";
        }
        return finall;
    }
    
}
