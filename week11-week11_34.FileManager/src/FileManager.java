
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    
    private File fw;
    private Scanner reader;
    
    public FileManager(){
        
    }
    
    

    public List<String> read(String file) throws FileNotFoundException {
        fw=new File(file);
        this.reader=new Scanner(fw);
        List<String> s=new ArrayList<String>();
        while(reader.hasNextLine()){
            s.add(reader.nextLine());
        }
        return s;
    }

    public void save(String file, String text) throws IOException {
        FileWriter f=new FileWriter(file);
        f.write(text);
        f.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter f=new FileWriter(file);
        for(String t:texts){
            f.write(t + "\n");
        }
        f.close();
    }
    
    
}
