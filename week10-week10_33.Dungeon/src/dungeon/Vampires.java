

package dungeon;

import java.util.*;

public class Vampires {
    
    private List<Vampire> vl;
    private int maxl;
    private int maxh;
    
    public Vampires(int l, int h){
        this.maxh=h;
        this.maxl=l;
        vl=new ArrayList<Vampire>();
    }
    
    public void generateVampires(int n){
        for(int i=0; i<n; i++){
        int randoml=new Random().nextInt(maxl);
        int randomh=new Random().nextInt(maxh);
        if(vl.isEmpty()){
            vl.add(new Vampire(maxl, maxh, randoml, randomh));
        }else{
            boolean test=true;
            for(Vampire temp:vl){
                if(temp.equals(new Vampire(maxl, maxh, randoml, randomh))){
                    test=false;
                }
            }
            if(test){
                vl.add(new Vampire(maxl, maxh, randoml, randomh));
            }else{
                randoml=new Random().nextInt(maxl);
                randomh=new Random().nextInt(maxh);
                vl.add(new Vampire(maxl, maxh, randoml, randomh));
            }
        }
        }
        
    }
    
    public void move(){
        int newl;
        int newh;
        for(Vampire temp:vl){
            int rng=new Random().nextInt(4);
            newl=temp.getL();
            newh=temp.getH();
            if(rng==0 && newh-1>=0){
                newh--;
            }else if(rng==1 && newl+1<maxl){
                newl++;
            }else if(rng==2 && newh+1<maxh){   
                newh++;
            }else if(rng==3 && newl-1>=0){
                newl--;
            }
            if(checkMovement(new Vampire(maxl, maxh, newl, newh))){
                temp.assignPosition(newl, newh);
            }
            
        }
    }
    
    public boolean checkMovement(Vampire v){
        boolean test=true;
        for(Vampire temp:vl){
            if(temp.equals(v)){
                test=false;
            }
        }
        return test;
    }
    
    public void removeIfOccupied(int l, int h){
        List<Vampire> toRemove=new ArrayList<Vampire>();
        for(Vampire temp:vl){
            if(temp.equals(new Vampire(maxl, maxh, l, h))){
                toRemove.add(temp);
            }
        }
        if(!toRemove.isEmpty()){
            vl.removeAll(toRemove);
        }
    }
    
    
    @Override
    public String toString(){
        String t="";
        for(Vampire temp:vl){
            t+=temp.toString() + "\n";
        }
        return t;
    }
    
    public int nrVamp(){
        return vl.size();
    }

}
