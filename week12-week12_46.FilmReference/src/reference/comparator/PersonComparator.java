

package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.*;


public class PersonComparator implements  Comparator<Person>{
    
    private Map<Person, Integer> cmp;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities){
        cmp=peopleIdentities;
    }
    
    

    @Override
    public int compare(Person o1, Person o2) {
        if(cmp.get(o1)>cmp.get(o2)){
            return -1;
        }else if(cmp.get(o2)==cmp.get(o1)){ 
            return 0;
        }else if(cmp.get(o1)<cmp.get(o2)){
            return 1;
        }
        return 0;
    }
    
    

}
