import java.util.*;



public class PhoneBook {

    private HashMap<String, ArrayList<String>> PhoneNr;
    private HashMap<String, ArrayList<String>> streets;
    private HashMap<String, String> cities;
    
    public PhoneBook(){
        this.PhoneNr=new HashMap<String, ArrayList<String>>();
        this.streets=new HashMap<String, ArrayList<String>>();
        this.cities=new HashMap<String, String>();
    }
    
    public void addNr(String name, String nr){
        if(PhoneNr.containsKey(name)){  
            PhoneNr.get(name).add(nr);
        }else{  
            PhoneNr.put(name, new ArrayList<String>());
            PhoneNr.get(name).add(nr);
        }
    }
    
    public void searchNr(String name){
        
        if(!PhoneNr.containsKey(name)){
            System.out.println("  not found");
        }else{  
            ArrayList<String> nr=PhoneNr.get(name);
            for(String temp:nr){
                System.out.println(" " + temp);
            }
        }
        
    }
    
    public void searchName(String nr){  
        String name;
        boolean verify=false;
        ArrayList<String> found=new ArrayList<String>();
        Collection<ArrayList<String>> arrays=PhoneNr.values();
        for(ArrayList<String> s:arrays){
            for(String t : s){  
                if(t.equals(nr)){
                    verify=true;
                    found=s;
                }
            }
        }
        if(!verify){
            System.out.println(" not found");
        }else{
            HashMap<ArrayList<String>, String> test=new HashMap<ArrayList<String>, String>();
            for(String t:PhoneNr.keySet()){
                test.put(PhoneNr.get(t), t);
            }
            name=test.get(found);
            System.out.println(" " + name);
        }
    }
    
    public void addSt(String name, String street, String city){
        if(!streets.containsKey(name)){
        cities.put(name, city);
        streets.put(name, new ArrayList<String>());
        streets.get(name).add(street);
        }else{
            streets.get(name).add(street);
        }
    }
    
    public void infoSearch(String name){
        if(!streets.containsKey(name)&&!PhoneNr.containsKey(name)){
            System.out.println("  not found");
        }else{
        if(!streets.containsKey(name)){
            System.out.println("  address unknown");
        }else{
            System.out.print("  address: ");
            for(String temp:streets.get(name)){
                System.out.print(temp);
            }
            System.out.println(" " + cities.get(name));
        }
        if(!PhoneNr.containsKey(name)){
            System.out.println("  phone number not found");
        }else{
            System.out.println("  phone numbers:");
            for(String temp:PhoneNr.get(name)){
                System.out.println("   " + temp);
            }
        }
    }
    }
    
    public void remove(String name){
        if(PhoneNr.containsKey(name)){  
            PhoneNr.remove(name);
        }
        if(streets.containsKey(name)){
            streets.remove(name);
            cities.remove(name);
        }
    }
    
    public void filterSearch(String s){
        Set<String> namesFromPhoneNumber=PhoneNr.keySet();
        Set<String> filteredPhoneNumber=new HashSet<String>();
        Set<String> namesFromAdresses=streets.keySet();
        Set<String> filteredAdresses=new HashSet<String>();
        Collection<String> allCities=cities.values();
        for(String temp:namesFromPhoneNumber){
            if(temp.contains(s)){
                filteredPhoneNumber.add(temp);
            }
        }
        for(String temp:namesFromAdresses){
            for(String t:streets.get(temp)){  
                if(t.contains(s)|| temp.contains(s)){  
                    filteredAdresses.add(temp);
                }
            }
            
        }
        for(String temp:namesFromAdresses){
            if(cities.get(temp).contains(s)){
                filteredAdresses.add(temp);
            }
        }
        
        
        Set<String> finalSet=new HashSet<String>();
        finalSet.addAll(filteredPhoneNumber);
        finalSet.addAll(filteredAdresses);
        ArrayList<String> finalList=new ArrayList<String>();
        finalList.addAll(finalSet);
        Collections.sort(finalList);
        if(finalList.isEmpty()){    
            System.out.println(" keyword not found");
        }else{
        for(String name:finalList){
            System.out.println("\n " + name);
            infoSearch(name);
        }
        }
    }
    
}
