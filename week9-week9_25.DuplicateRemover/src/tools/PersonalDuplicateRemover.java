

package tools;

import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover{

    private Set<String> strings;
    private int nrOfDub;
    
    public PersonalDuplicateRemover(){
       
        this.strings=new HashSet<String>();
        this.nrOfDub=0;
    }
    
    @Override
    public void add(String characterString){
        
        if(!strings.contains(characterString)){
            strings.add(characterString);
        }else{  
            nrOfDub++;
        }
        
    }
    
    @Override
    public int getNumberOfDetectedDuplicates(){
        
        return nrOfDub;
        
    }
    
    @Override
    public Set<String> getUniqueCharacterStrings(){
        
        return strings;
        
    }
    
    @Override
    public void empty(){
        
        strings.clear();
        nrOfDub=0;
        
    }
    
}
