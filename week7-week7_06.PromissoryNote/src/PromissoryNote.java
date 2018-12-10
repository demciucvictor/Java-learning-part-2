import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> notes;
    
    public PromissoryNote(){
        this.notes=new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        notes.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose){   
        if(notes.containsKey(whose)){   
            return notes.get(whose);
        }return 0;
    }
}
