

package farmsimulator;


public class MilkingRobot {
    
    private BulkTank bt;
    
    public MilkingRobot(){  
        
    }
    
    public BulkTank getBulkTank(){
        return bt;
    }
    
    public void setBulkTank(BulkTank tank){
        bt=tank;
    }
    
    public void milk(Milkable milkable){
        if(getBulkTank()==null){
            throw new IllegalStateException();
            
        }
        double t;
        t=milkable.milk();
        bt.addToTank(t);
    }

}
