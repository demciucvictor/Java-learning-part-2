import java.util.ArrayList;
public class Changer {
    private ArrayList<Change> list;
    private int size;
    public Changer(){
    list=new ArrayList<Change>();
    size=0;
    }
    
    public void addChange(Change change){
        list.add(change);
        size++;
        
    }
    public String change(String characterString){
        String word=characterString;
        for(int i=0; i<size; i++){
            word=list.get(i).change(word);
            
        }
        return word;
    }
}
