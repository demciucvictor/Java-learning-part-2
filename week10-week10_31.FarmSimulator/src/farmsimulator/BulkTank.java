

package farmsimulator;


public class BulkTank {
    
    private double capacity;
    private double volume;
    
    public BulkTank(){
        this.capacity=2000;
        this.volume=0;
    }
    
    public BulkTank(double capacity){
        this.capacity=capacity;
        this.volume=0;
    }
    
    public double getCapacity(){
        return capacity;
    }
    
    public double getVolume(){
       return volume; 
    }
    
    public double howMuchFreeSpace(){
        return capacity-volume;
    }
    
    public void addToTank(double amount){
        if(howMuchFreeSpace()-amount>0){
            volume+=amount;
        }else{  
            volume+=howMuchFreeSpace();
        }
    }
    
    public double getFromTank(double amount){
        if(volume-amount>0){
            volume-=amount;
        }else{
            volume=0;
        }
        return volume;
    }
    
    @Override
    public String toString(){
        return Math.ceil(volume) + "/"  + Math.ceil(capacity);
    } 

}
