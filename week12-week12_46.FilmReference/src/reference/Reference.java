

package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;


public class Reference {
    
    private RatingRegister rr;
    private Map<Film, List<Rating>> movies;
    
    public Reference(RatingRegister r){
        this.rr=r;
    }
    
    public Film recommendFilm(Person person){
        movies=rr.filmRatings();
        List<Film> films=new ArrayList<Film>();
        for(Film temp:movies.keySet()){
            films.add(temp);
        }
        Collections.sort(films, new FilmComparator(movies));
        for(Film t:films){  
            if(rr.hasntWatched(person, t)){
                return t;
            }
        }
        return null;
    }

}
