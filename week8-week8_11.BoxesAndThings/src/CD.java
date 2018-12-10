
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int year;
    private final double weigth=0.1;
    
    public CD(String a, String t, int y){
        this.artist=a;
        this.title=t;
        this.year=y;
    }
    @Override
    public double weight(){
        return this.weigth;
    }
    @Override
    public String toString(){
        return this.artist+": "+this.title+" ("+this.year+")";
    }
}
