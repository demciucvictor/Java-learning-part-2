import java.util.*;
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dic;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader=reader;
        this.dic=dictionary;
    }
    public void start(){    
        while (true){   
            System.out.print("Statement: ");
            String scan=reader.nextLine();
            if(scan.equals("quit")){    
                break;
            }
            else if(scan.equals("add")){
                System.out.print("In Finnish: ");
                String fin=reader.nextLine();
                System.out.print("translation: ");
                String eng=reader.nextLine();
                add(fin, eng);
            }
            else if(scan.equals("translate")){  
                System.out.print("Give a word: ");
                String temp=reader.nextLine();
                System.out.println("Translation: " + dic.translate(temp));
            }
            else{
                System.out.println("Unknown statement");
            }
            System.out.println("");
        }
    }
    public void add(String fin, String eng){
        dic.add(fin, eng);
    }
}
