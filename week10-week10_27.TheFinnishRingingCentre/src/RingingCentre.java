import java.util.*;


public class RingingCentre {

    private HashMap<Bird, ArrayList<String>> obs;
    
    public RingingCentre(){
        this.obs=new HashMap<Bird, ArrayList<String>>();
    }
    
    public void observe(Bird bird, String place){
        
        if(obs.isEmpty() || !obs.containsKey(bird)){
            obs.put(bird, new ArrayList<String>());
            obs.get(bird).add(place);
        }else{
            obs.get(bird).add(place);
        }
        
    }
    
    public void observations(Bird bird){
        if (this.obs.get(bird) == null) {
            System.out.println(bird + " observations: 0");
        } else {
            int obsNum = this.obs.get(bird).size();
            System.out.println(bird + " observations: " + obsNum);
            for (int i = 0; i < obsNum; i++) {
                System.out.println(obs.get(bird).get(i));
            }
        }
    }
    }
        

