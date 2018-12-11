
package reference.domain;


public enum Rating {
    
    BAD("-5"),
    MEDIOCRE("-3"),
    NOT_WATCHED("0"),
    NEUTRAL("1"),
    FINE("3"),
    GOOD("5");
    
    private String name;
    
    private Rating(String s){    
    this.name=s;
    }
    
    public int getValue(){    
        return Integer.parseInt(name);
    }
    
    
    
    
    
}
