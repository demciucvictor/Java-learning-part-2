import java.util.*;
public class Container {
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int maxweigth;
    
    public Container(int maxkg){    
        this.maxweigth=maxkg;
    }
    public void addSuitcase(Suitcase suitcase){  
        int total=0;
        for(Suitcase suit : suitcases){ 
            total+=suit.totalWeight();
        }
        if(total+suitcase.totalWeight()<=maxweigth){
            suitcases.add(suitcase);
        }
        
    }
    public String toString(){
        int total=0;
        for(Suitcase suit : suitcases){ 
            total+=suit.totalWeight();
        }
        return suitcases.size() + " suitcases (" + total + " kg)";
    }
    public void printThings(){
        for(Suitcase suit : suitcases){ 
            suit.printThings();
        }
    }
    
}
