
public class Thing {
    
    private String name;
    private int weigth;
    
    public Thing(String name, int kg){
        this.name=name;
        this.weigth=kg;
    }
    public String getName(){
        return this.name;
    }
    public int getWeight(){  
        return this.weigth;
    }
    public String toString(){
        return name + " (" + weigth + " kg)";
    }
}
