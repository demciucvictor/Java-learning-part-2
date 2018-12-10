
import java.io.File;
import java.util.*;

public class Printer {
    
    private File f;
    private Scanner reader;
    
    public Printer(String fileName) throws Exception{
        f=new File(fileName);
        reader=new Scanner(f);
        
    }
    public void printLinesWhichContain(String word) throws Exception{    
        String temp="";
        while(reader.hasNextLine()){    
            temp=reader.nextLine();
            if(temp.contains(word) || temp.equals(word)){
                System.out.println(temp);
            }
        }
        reader=null;
        reader= new Scanner(f);
    }
    
}
