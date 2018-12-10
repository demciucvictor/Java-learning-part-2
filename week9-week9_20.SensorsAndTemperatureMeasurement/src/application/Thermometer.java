

package application;

import java.util.*;

public class Thermometer implements Sensor{
    
    private boolean status;
    
    public Thermometer(){
        this.status=false;
    }
    
    @Override
    public boolean isOn() {
        while(status){
            return true;
        }return false;
    }

    @Override
    public void on() {
        status=true;
    }

    @Override
    public void off() {
        status=false;
    }

    @Override
    public int measure() {
        int r= new Random().nextInt(61)-30;
        if(status==false){
            throw new IllegalStateException("Thermometer is off");
        }
        return r;
    }

}
