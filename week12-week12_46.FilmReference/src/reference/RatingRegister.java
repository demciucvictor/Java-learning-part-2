

package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.*;


public class RatingRegister {
    
    Map<Film, List<Rating>> movies;
    Map<Person, Map<Film, Rating>> ppl;
    
    public RatingRegister(){
        movies=new HashMap<Film, List<Rating>>();
        ppl=new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating){    
        if(!movies.containsKey(film)){
            movies.put(film, new ArrayList<Rating>());
            movies.get(film).add(rating);
        }else{
            movies.get(film).add(rating);
        }
    }
    
    public List<Rating> getRatings(Film film){
        return movies.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return movies;
    }
    
    public void addRating(Person person, Film film, Rating rating){
        if(!ppl.containsKey(person)){
            ppl.put(person, new HashMap<Film, Rating>());
            ppl.get(person).put(film, rating);
        }else{  
            ppl.get(person).put(film, rating);
        }
        addRating(film, rating);
    }
    
    public Rating getRating(Person person, Film film){
        if(ppl.containsKey(person)){
            if(ppl.get(person).containsKey(film)){
                return ppl.get(person).get(film);
            }
        }
        return Rating.NOT_WATCHED;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){ 
        if(ppl.containsKey(person)){    
            return ppl.get(person);
        }
        return new HashMap<Film, Rating>();
    }
    
    public List<Person> reviewers(){    
        List<Person> t= new ArrayList<Person>();
        for(Person temp:ppl.keySet()){
            t.add(temp);
        }
        return t;
    }
    
    public boolean hasntWatched(Person p, Film f){  
        if(!ppl.containsKey(p)){
            return true;
        }else{
            if(!ppl.get(p).containsKey(f)){
                return true;
            }else{  
                return false;
            }
        }
    }

}
