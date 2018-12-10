import java.util.HashMap;
import java.util.*;
public class Dictionary {
    private HashMap<String, String> words;
    
    public Dictionary(){
        this.words=new HashMap<String, String>();
    }
    public void add(String word, String translation){
        words.put(word, translation);
    }
    public String translate(String word){
        if(words.containsKey(word)){    
            return words.get(word);
        }return null;
    }
    public int amountOfWords(){
        ArrayList<String> wordss=new ArrayList<String>(words.values());
        return wordss.size();
    }
    public ArrayList<String> translationList(){
        ArrayList<String> temp = new ArrayList<String>(words.keySet());
        ArrayList<String> finale = new ArrayList<String>();
        for(int i=0; i<temp.size(); i++){   
            finale.add(temp.get(i) + " = " + words.get(temp.get(i)));
        }
        return finale;
    }
}
