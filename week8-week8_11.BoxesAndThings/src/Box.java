import java.util.*;

public class Box implements ToBeStored{
    private ArrayList<ToBeStored> list;
    private double maxweight;
    
    public Box(double maxw){    
        this.maxweight=maxw;
        list=new ArrayList<ToBeStored>();
        
    }
    public void add(ToBeStored tbs){
        if(weight()+tbs.weight()<=maxweight){
            list.add(tbs);
        }
    }
    
    @Override
    public double weight(){
        double w=0;
        for(ToBeStored tbs:list){   
            w+=tbs.weight();
        }
        return w;
    }
    @Override
    public String toString(){
        return "Box: "+list.size()+" things, total weight "+weight()+" kg";
    }
}
