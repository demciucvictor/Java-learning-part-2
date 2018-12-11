

package clicker.applicationlogic;


public class PersonalCalculator implements Calculator{
    
    private int counter;
    
    public PersonalCalculator(){
        this.counter=0;
    }

    @Override
    public int giveValue() {
        return counter;
    }

    @Override
    public void increase() {
        counter++;
    }
    
    

}
