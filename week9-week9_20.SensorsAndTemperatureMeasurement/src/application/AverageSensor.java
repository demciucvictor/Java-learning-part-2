

package application;

import java.util.*;

public class AverageSensor implements Sensor{
    
    private List<Sensor> sensors;
    
    private List<Integer> measures;
    
    public AverageSensor(){
        this.sensors=new ArrayList<Sensor>();
        
        this.measures=new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        sensors.add(additional);
        
    }
    
    public List<Integer> readings(){
        return measures;
    }

    @Override
    public boolean isOn() {
        int i=0;
        while (true){
            if(!sensors.get(i).isOn()){
                return false;
                
            }
            return true;
        }
    }

    @Override
    public void on() {
        for(Sensor temp : sensors){
            temp.on();
        }
        
    }

    @Override
    public void off() {
        for(Sensor temp : sensors){
            temp.off();
        }
        
    }

    @Override
    public int measure() {
        if(!isOn() || sensors.isEmpty()){
            throw new IllegalStateException("Cant measure");
        }else{
            int total=0;
            for(Sensor temp : sensors){
                total+=temp.measure();
            }
        int avg=(int) total/sensors.size();
        measures.add(avg);
        return avg;
        }
    }

}
