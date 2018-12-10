

package farmsimulator;

import java.util.*;

public class Cow implements Milkable, Alive{
    
    private String name;
    private int udder;
    private double milk;
    
    public Cow(){
        this.name=NAMES[new Random().nextInt(NAMES.length)];
        this.udder=15 + new Random().nextInt(26);
        this.milk=0;
    }
    public Cow(String name){
        this.name=name;
        this.udder=15 + new Random().nextInt(26);
        this.milk=0;
    }
    
    public String getName(){
        return name;
    }
    
    public double getCapacity(){
        return udder;
    }
    
    public double getAmount(){
        return milk;
    }
    
    @Override
    public String toString(){
        return name + " " +  Math.ceil(milk) + "/" + Math.ceil(udder);
    }
    
    @Override
    public double milk(){
        double amount=milk;
        milk=0;
        return amount;
    }
    
    @Override
    public void liveHour(){
        double t=0.7 + (1.3*new Random().nextDouble());
        if(milk+t<udder){
            milk+=t;
        }else{  
            milk=udder;
        }
    }
    
    
    
      private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

}


