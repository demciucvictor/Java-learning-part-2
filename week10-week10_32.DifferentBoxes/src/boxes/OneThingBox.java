

package boxes;


public class OneThingBox extends Box{
    
    private Thing thing;
    
    public OneThingBox(){}
    
    @Override
    public void add(Thing t){
        if(thing==null){
            thing=t;
        }
    }
    
    @Override
    public boolean isInTheBox(Thing t){
        if(thing==null){
            return false;
        }
        return thing.equals(t);
    }

}
