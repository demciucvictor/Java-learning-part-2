

package farmsimulator;

import java.util.*;


public class Barn {
    
    private BulkTank bt;
    private MilkingRobot mr;
    
    public Barn(BulkTank tank){ 
        bt=tank;
    }
    
    public BulkTank getBulkTank(){  
        return bt;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        mr=milkingRobot;
        mr.setBulkTank(bt);
    }
    
    public void takeCareOf(Cow cow){
        if(mr==null){
            throw new IllegalStateException();
        }
        mr.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(mr==null){
            throw new IllegalStateException();
        }
        for(Cow temp:cows){
            mr.milk(temp);
        }
    }
    
    @Override
    public String toString() {
        return bt.toString();
    }
    
    

}
