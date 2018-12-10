

package containers;

import java.util.*;

public class ContainerHistory { 
    
    private ArrayList<Double> history;
    
    public ContainerHistory(){
        history=new ArrayList<Double>();
    }
    
    public void add(double situation){  
        history.add(situation);
    }
    
    public void reset(){
        history.clear();
    }
    
    @Override
    public String toString(){
        return history.toString();
    }
    
    public double maxValue(){
        double t=history.get(0);
        if(history.isEmpty()){
            return 0;
        }
        for(double temp:history){
            if(temp>t){
                t=temp;
            }
        }
        return t;
    }
    
    public double minValue(){
        if(history.isEmpty()){
            return 0;
        }
        double t=history.get(0);
        for(double temp:history){
            if(temp<t){
                t=temp;
            }
        }
        return t;
    }
    
    public double average(){
        if(history.isEmpty()){
            return 0;
        }
        double sum=0;
        double avg;
        for(double temp:history){
            sum+=temp;
        }
        avg=sum/history.size();
        return avg;
    }
    
    public double greatestFluctuation(){
        if(history.isEmpty()||history.size()==1){
            return 0;
        }
        double endf=0;
        for(int i=1; i<history.size(); i++){
            double temp=Math.abs(history.get(i)-history.get(i-1));
            if(temp>endf){
                endf=temp;
            }
            
        }
        return endf;
        
        
    }
    
    public double variance(){
        if(history.isEmpty()||history.size()==1){
            return 0;
        }
        double avg=average();
        double n=0;
        for(int i=0; i<history.size(); i++){
            n+=Math.pow(history.get(i)-avg, 2);
        }
        return n/(history.size()-1);
    }

}
