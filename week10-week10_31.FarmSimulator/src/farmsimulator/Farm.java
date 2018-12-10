

package farmsimulator;

import java.util.*;

public class Farm implements Alive{
    
    private String name;
    private Barn barn;
    private List<Cow> cows;
    
    public Farm(String name, Barn b){
        this.name=name;
        this.barn=b;
        cows=new LinkedList<Cow>();
    }
    
    @Override
    public void liveHour(){
        for(Cow temp:cows){
            temp.liveHour();
        }
    }
    
    public void manageCows(){
        barn.takeCareOf(cows);
    }
    
    public void addCow(Cow c){
        cows.add(c);
    }
    
    public void installMilkingRobot(MilkingRobot r){    
        barn.installMilkingRobot(r);
    }
    
    @Override
    public String toString(){
        String t="";
        for(Cow temp:cows){
            t+="        " + temp.toString() + "\n";
        }
        return "Farm owner: " + name + "\nBarn bulk tank: " + barn.getBulkTank().toString() + "\nAnimals:\n" + t;
    }
    
    public String getOwner(){
        return name;
    }
    
    

}
