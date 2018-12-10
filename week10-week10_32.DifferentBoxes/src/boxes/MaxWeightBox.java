

package boxes;

import java.util.*;


public class MaxWeightBox extends Box{
    
    private int maxw;
    private List<Thing> tl;
    
    public MaxWeightBox(int maxWeight){
        super();
        this.maxw=maxWeight;
        this.tl=new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing t){
        if(weight()+t.getWeight()<=maxw){
            tl.add(t);
        }
    }
    
    public int weight(){
        if(tl.size()==0){
            return 0;
        }
        int t=0;
        for(Thing temp:tl){
            t+=temp.getWeight();
        }
        return t;
    }
    
    @Override
    public boolean isInTheBox(Thing t){
        if(tl.contains(t)){
            return true;
        }
        return false;
    }

}
