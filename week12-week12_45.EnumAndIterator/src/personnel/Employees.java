

package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    
    private ArrayList<Person> plist;
    
    public Employees(){
        plist=new ArrayList<Person>();
    }
    
    public void add(Person person){
        plist.add(person);
    }
    
    public void add(List<Person> persons){  
        plist.addAll(persons);
    }
    
    public void print(){    
        Iterator<Person> iter=plist.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iter=plist.iterator();
        while(iter.hasNext()){
            Person temp=iter.next();
            if(temp.getEducation()==education){  
                System.out.println(temp);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iter=plist.iterator();
        while(iter.hasNext()){
            if(iter.next().getEducation()==education){  
                iter.remove();
            }
        }
    }

}
