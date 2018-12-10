

package file;

import java.util.*;
import java.io.File;


public class Analysis {
    
    private Scanner reader;
    private String text;
    
    public Analysis(File file) throws Exception{
        this.reader=new Scanner(file);
        this.text="";
        while(reader.hasNextLine()){    
            text+=reader.nextLine();
            text+="\n";
        }
    }
    
    public int lines(){
        String[] lines=text.split("\r\n|\r|\n");
        return lines.length;
    }
    public int characters(){
        System.out.println(text);
        return text.length();
    }
    
    
}
