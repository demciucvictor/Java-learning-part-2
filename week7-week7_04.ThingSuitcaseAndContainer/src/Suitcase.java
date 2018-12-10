import java.util.*;
public class Suitcase {
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int maxweigth;
    
    public Suitcase(int maxkg){ 
        this.maxweigth=maxkg;
    }
    public void addThing(Thing thing){
        int total=0;
        for(Thing t : things){
            total+=t.getWeight();
        }
        if(total+thing.getWeight()<=this.maxweigth){
            things.add(thing);
        }
    }
    public String toString(){
        int total=0;
        for(Thing t : things){
            total+=t.getWeight();
        }
        if(things.size()==0){   
            return "empty (" + total + " kg)";
        }else if(things.size()==1){ 
            return things.size() + " thing (" + total + " kg)";
        }else{  
            return things.size() + " things (" + total + " kg)";
        }
    }
    public void printThings(){
        for(Thing t : things){  
            System.out.println(t);
        }
        
    }
    public int totalWeight(){   
        int total=0;
        for(Thing t : things){
            total+=t.getWeight();
        }
        return total;
    }
    public Thing heaviestThing(){ 
        if(things.isEmpty()){   
            return null;
        }
        Thing temp=things.get(0);
        for(int i=1; i<things.size(); i++){
            if(things.get(i).getWeight()>temp.getWeight()){
                temp=things.get(i);
            }
        }
        return temp;
    }
    
}
