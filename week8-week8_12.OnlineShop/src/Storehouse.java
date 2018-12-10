import java.util.*;
public  class Storehouse {
    
    private Map<String, Integer> listp;
    private Map<String, Integer> lists;
    
    public Storehouse(){
        listp=new HashMap<String, Integer>();
        lists=new HashMap<String, Integer>();
    }
    public void addProduct(String product, int price, int stock){   
        listp.put(product, price);
        lists.put(product, stock);
    }
    public int price(String product){
        if(listp.get(product)==null){    
            return -99;
        }return listp.get(product);
    }
    public int stock(String product){   
        if(lists.get(product)==null){
            return 0;
        }return lists.get(product);
    }
    public boolean take(String product){    
        if(!lists.containsKey(product)){
            return false;
        }
        if(lists.get(product)<1){   
            return false;
        }
        lists.replace(product, lists.get(product)-1);
        return true;
    }
    public Set<String> products(){  
        return listp.keySet();
    }
    
    
}
