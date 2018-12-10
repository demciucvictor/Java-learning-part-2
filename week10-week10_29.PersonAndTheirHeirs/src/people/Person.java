package people;


public class Person {
    private String name;
    private String adress;
    
    public Person(String name, String adress){  
        this.adress=adress;
        this.name=name;
    
    }
    
    @Override
    public String toString(){
        return name + "\n  " + adress;
    }
    

}
