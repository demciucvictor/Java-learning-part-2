

package reference.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.domain.Film;
import reference.domain.Rating;


public class FilmComparator implements Comparator<Film>{
    
    Map<Film, List<Rating>> films;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){ 
        films=ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        Map<Film, Double> ratings=new HashMap<Film, Double>();
        Set<Film> movieNames=films.keySet();
        
        
        for(Film temp:films.keySet()){ 
            
            double avg;
            int sum=0;
            int n=0;
            for(Rating s:films.get(temp)){
                sum+=s.getValue();
                n++;
            }
            avg=(double)sum/n;
            
            ratings.put(temp, avg);
            
        }
        
        
        if(ratings.get(o1)>ratings.get(o2)){
            return -1;
        }else if(ratings.get(o1)==ratings.get(o2)){
            return 0;
        }else if(ratings.get(o1)<ratings.get(o2)){  
            return 1;
        }
        return 0;
    }

}
