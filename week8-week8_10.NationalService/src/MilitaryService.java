
public class MilitaryService implements NationalService{
    private int daysLeft;
    
    public MilitaryService(int n){
        this.daysLeft=n;
    }
    
    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }
    
    @Override
    public void work(){
        if(this.daysLeft>0){
            this.daysLeft--;
        }
    }
}
