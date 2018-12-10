

package boxes;


public class BlackHoleBox extends Box{
    
     public BlackHoleBox(){}
     
     @Override
     public void add(Thing t){
         
     }
     
     @Override
     public boolean isInTheBox(Thing t){
         return false;
     }

}
