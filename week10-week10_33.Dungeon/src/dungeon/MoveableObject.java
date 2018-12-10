

package dungeon;


public abstract class MoveableObject {
    
    private int maxlength;
    private int maxheight;
    
    public MoveableObject(int l, int h){    
        this.maxheight=h;
        this.maxlength=l;
    }
    
    
    
    public int getMaxl(){
        return this.maxlength-1;
    }
    
    public int getMaxh(){
        return this.maxheight-1;
    }
    

}
