

package moving.logic;

import java.util.*;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {
    
    private int maxvolume;
    
    
    public Packer(int boxesVolume){
        this.maxvolume=boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){    
        List<Box> list=new ArrayList<Box>();
        Box temp= new Box(maxvolume);
        int nrOfThings=things.size();
        for(int i=0; i<nrOfThings; i++){
            if(temp.addThing(things.get(i))){}
            else{   
                list.add(temp);
                temp.emptyBox();
                temp.addThing(things.get(i));
            }
            list.add(temp);
        }
        return list;
    }
}
