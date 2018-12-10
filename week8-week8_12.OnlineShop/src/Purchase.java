
public class Purchase {
    private String product;
    private int amount=1;
    private int price;
    
    
    
    
    public Purchase(String product, int amount, int unitPrice){
        this.product=product;
        this.price=unitPrice;
        this.amount=amount;
    }
    public int price(){ 
        return price*amount;
    }
    public void increaseAmount(){   
        this.amount++;
    }
    @Override
    public String toString(){   
        return this.product+": "+this.amount;
    }
    @Override
    public boolean equals(Object pur){   
        Purchase purc=(Purchase)pur;
        if(this.product.equals(purc.getProduct())){  
            return true;
        }return false;
    }
    public String getProduct(){
        return this.product;
    }
    
}
