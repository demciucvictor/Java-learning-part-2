

package dungeon;

import java.util.*;


public class Vampire extends MoveableObject{
    
    private int currentl;
    private int currenth;
    
    public Vampire(int maxl, int maxh, int l, int h){
        super(maxl, maxh);
        this.currenth=h;
        this.currentl=l;
    }
    
    public int getL(){
        return currentl;
    }
    
    public int getH(){
        return currenth;
    }
    
    @Override
    public String toString(){
        return "v " + currentl + " " + currenth;
    }
    
    public void assignPosition(int l, int h){
        currentl=l;
        currenth=h;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.currentl;
        hash = 37 * hash + this.currenth;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vampire other = (Vampire) obj;
        if (this.currentl != other.currentl) {
            return false;
        }
        if (this.currenth != other.currenth) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void move(int n){
        for(int i=0; i<n; i++){ 
            int mov=new Random().nextInt(4);
            if(mov==0){ 
                if(currenth-1>=0){  
                    currenth--;
                }
            }else if(mov==1){
                if(currentl+1<=super.getMaxl()){
                    currentl++;
                }
            }else if(mov==2){   
                if(currenth+1<=super.getMaxh()){
                    currenth++;
                }
            }else if(mov==3){
                if(currentl-1>=0){
                    currentl--;
                }
            }
        }
    }

}
