import java.util.*;

public class VehicleRegister {
     private HashMap<RegistrationPlate, String> someMap = new HashMap<RegistrationPlate, String>();
    
    
    
    public boolean add(RegistrationPlate plate, String owner){
        if(!someMap.containsKey(plate)){
            someMap.put(plate, owner);
            return true;
        }return false;
    }
    public String get(RegistrationPlate plate){
        if(someMap.get(plate)!=null){
            return someMap.get(plate);
        }return null;
    }
    public boolean delete(RegistrationPlate plate){
        if(someMap.containsKey(plate)){
            someMap.remove(plate);
            return true;
        }return false;
    }
    public void printRegistrationPlates(){
        ArrayList<RegistrationPlate> temp=new ArrayList<RegistrationPlate>(someMap.keySet());
        for(int i=0; i<temp.size(); i++){
            System.out.println(temp.get(i));
        }
    }
    public void printOwners(){
        ArrayList<RegistrationPlate> temp=new ArrayList<RegistrationPlate>(someMap.keySet());
        ArrayList<String> alreadyPrinted=new ArrayList<String>();
        for(int i=0; i<temp.size(); i++){   
            if(!alreadyPrinted.contains(someMap.get(temp.get(i)))){
                System.out.println(someMap.get(temp.get(i)));
                alreadyPrinted.add(someMap.get(temp.get(i)));
            }
        }
    }
    
}
