

package dungeon;

import java.util.*;


public class Dungeon {
    
    private int length;
    private int height;
    private int nrOfVampires;
    private int moves;
    private boolean allowVMove;
    private Scanner reader;
    private Vampires vl;
    private Human h;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.length=length;
        this.height=height;
        this.nrOfVampires=vampires;
        this.moves=moves;
        this.allowVMove=vampiresMove;
        this.reader=new Scanner(System.in);
        this.vl=new Vampires(length, height);
    }
    
    public void run(){
        vl.generateVampires(nrOfVampires);
        this.h=new Human(length, height, vl);
        
        while (true){
            if(nrOfVampires==0){
                System.out.println("YOU WIN");
                break;
            }else if(moves==0){
                System.out.println("YOU LOSE");
                break;
            }
            printing();
            System.out.println("");
            String s=reader.nextLine();
            if(allowVMove){
                h.movementWithVampires(s);
            }else{
                h.movementWithoutVampires(s);
            }
            moves--;
            nrOfVampires=h.nrVamp();
            
        }
    }
    
    public void printing(){
        System.out.println(moves + "\n");
        System.out.println(h);
        for(int i=0; i<height; i++){
            for(int j=0; j<length; j++){    
                if(h.getL()==j && h.getH()==i){
                    System.out.print("@");
                }else if(h.vampireAt(j, i)){
                    System.out.print("v");
                }else{
                    System.out.print(".");
                }
                
            }
            System.out.println("");
        }
    }
    
    

}
