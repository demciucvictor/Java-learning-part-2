

package personnel;


public class Person {
    
    private String name;
    private Education edu;
    
    public Person(String s, Education e){
        this.name=s;
        this.edu=e;
    }
    
    public Education getEducation(){
        return edu;
    }
    
    @Override
    public String toString(){
        return name + ", " + edu;
    }

}
