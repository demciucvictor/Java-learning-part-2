import java.util.*;

public class ui {
    private Scanner reader;
    private ArrayList<jumpers> members;
    
    public ui(Scanner reader){
        this.reader=reader;
        this.members=new ArrayList<jumpers>();
    }
    
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true){
            System.out.print("  Participant name: ");
            String n=reader.nextLine();
            if(n.isEmpty()){
                break;
            }else{
                jumpers j=new jumpers(n);
                members.add(j);
            }
            
        }
        System.out.println("\nThe tournament begins!\n");
        int round=0;
        while (true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String t=reader.nextLine();
            if(!t.equals("jump")){   
                break;
            }else{
                round++;
                System.out.println("\nRound " + round + "\n");
                
                Collections.sort(members);
                System.out.println("Jumping order:");
                
                int nr=1;
                for(jumpers temp : members){    
                    System.out.println("  " +  nr + ". " + temp.getName() + " (" + temp.getPoints() + " points)");
                    nr++;
                }
                System.out.println("\nResults of round " + round);
                
                int index=0;
                for(index=0; index<members.size(); index++){
                    System.out.println("  " + members.get(index).getName());
                    int rnd=random(60, 120);
                    int v1=random(10, 20), v2=random(10, 20), v3=random(10, 20), v4=random(10, 20), v5=random(10, 20);
                    System.out.println("    length: " + rnd);
                    System.out.println("    judge votes: [" + v1 + ", " + v2 + ", " + v3 + ", " + v4 + ", " + v5 + "]");
                    int jt=v1+v2+v3+v4+v5;
                    ArrayList<Integer> votes=new ArrayList<Integer>();
                    votes.add(v1);
                    votes.add(v2);
                    votes.add(v3);
                    votes.add(v4);
                    votes.add(v5);
                    Collections.sort(votes);
                    jt=jt-votes.get(0)-votes.get(4);
                    votes.clear();
                    
                    members.get(index).addPoints(rnd+jt);
                    members.get(index).addJump(rnd);
                    
                    
                }
                System.out.println("");
            }
        }
        Collections.sort(members);
        Collections.reverse(members);
        System.out.println("\nThanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for(int ind=0; ind<members.size(); ind++){  
            System.out.println(ind+1 + "           " + members.get(ind).getName() + " (" + members.get(ind).getPoints() + " points)");
            System.out.print("            jump lengths: ");
            members.get(ind).showJumps();
            System.out.println("");
        }
    }
    public int random(int min, int max){
        int te;
        te=new Random().nextInt(max-min+1) + min;
        return te;
    }
    
}
