
public class Book implements ToBeStored{
    private String writter;
    private String name;
    private double weight;
    
    public Book(String w, String n, double we){ 
        this.writter=w;
        this.name=n;
        this.weight=we;
    }
    
    @Override
    public double weight(){ 
        return this.weight;
    }
    @Override
    public String toString(){
        return this.writter+": "+this.name;
    }
}
