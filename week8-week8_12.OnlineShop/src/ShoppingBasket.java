import java.util.*;
public class ShoppingBasket {
    private List<Purchase> list;
    
    public ShoppingBasket(){    
        list=new ArrayList<Purchase>();
        
    }
    public void add(String product, int price){
        if(list.contains(new Purchase(product, 1, price))){    
            int ind=list.indexOf(new Purchase(product, 1, price));
            
            list.get(ind).increaseAmount();
        }else{  
            list.add(new Purchase(product, 1, price));
        }
    }
    public int price(){
        int price=0;
        for(Purchase pur:list){ 
            price+=pur.price();
        }
        return price;
    }
    public void print(){
        for(Purchase pur:list){ 
            System.out.println(pur.toString());
        }
    }
    
}
