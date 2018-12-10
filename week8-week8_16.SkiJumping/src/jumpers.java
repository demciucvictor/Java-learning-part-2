import java.util.*;

public class jumpers implements Comparable<jumpers>{
    private String name;
    private int points;
    private ArrayList<Integer> jumps;
    
    
    public jumpers(String n){
        this.name=n;
        this.points=0;
        this.jumps =new ArrayList<Integer>();
    }
    
    public String getName(){
        return this.name;
    }
    public int getPoints(){
        return points;
    }
    public void addPoints(int npoints){
        this.points+=npoints;
    }
    public void addJump(int ju){    
        jumps.add(ju);
    }
    public void showJumps(){    
        for(int i=0; i<jumps.size(); i++){
            System.out.print(jumps.get(i));
            if(i<jumps.size()-1){   
                System.out.print(", ");
            }
        }
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    @Override
    public int compareTo(jumpers s){
        return this.points-s.getPoints();
    }
}
