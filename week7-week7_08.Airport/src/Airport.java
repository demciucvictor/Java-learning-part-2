import java.util.*;

public class Airport {
    private HashMap<String, String> planes;
    private HashMap<String, String> flights;
    
    public Airport(){
        planes=new HashMap<String, String>();
        flights=new HashMap<String, String>();
    }
    public void addPlane(String a, String b){
        planes.put(a, b);
    }
    public boolean contains(String a){   
        if(planes.containsKey(a)){  
            return true;
        }return false;
    }
    public void addFlight(String id, String dep, String dest){  
        flights.put(dep + "-" + dest, id);
    }
    public void printPlanes(){
        ArrayList<String> keys=new ArrayList<String>(planes.keySet());
        for(int i=0; i<keys.size(); i++){   
            System.out.println(keys.get(i) + " (" + planes.get(keys.get(i)) + " ppl)");
        }
    }
    public void printFlights(){
        ArrayList<String> id=new ArrayList<String>(flights.values());
        ArrayList<String> keys=new ArrayList<String>(flights.keySet());
        for(int i=0; i<id.size(); i++){
            System.out.println(flights.get(keys.get(i)) + " (" + planes.get(id.get(i)) + " ppl)" + " (" + keys.get(i) + ")");
        }
    }
    public void searchByID(String id){  
        System.out.println(id + " (" + planes.get(id) + " ppl)");
    }
    
}
