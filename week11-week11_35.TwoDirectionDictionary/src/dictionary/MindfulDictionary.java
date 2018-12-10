

package dictionary;

import java.util.*;
import java.io.*;

public class MindfulDictionary {
    
    private HashMap<String, String> fineng;
    private HashMap<String, String> engfin;
    private String filename;
    private File file;
    private Scanner reader;
    private FileWriter fw;
    
    public MindfulDictionary(){
        this.engfin=new HashMap<String, String>();
        this.fineng=new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file){
        this.engfin=new HashMap<String, String>();
        this.fineng=new HashMap<String, String>();
        this.filename=file;
    }
    
    public boolean load(){
        try{    
            file=new File(filename);
            reader=new Scanner(file);
        }catch(Exception ex){
            return false;
        }
        while(reader.hasNextLine()){    
            String line=reader.nextLine();
            int n=line.indexOf(':');
            String w=line.substring(0, n);
            String t=line.substring(n+1);
            add(w, t);
        }
        return true;
    }
    
    public void add(String word, String translation){
        if(!fineng.containsKey(word)){
            fineng.put(word, translation);
            engfin.put(translation, word);
        }
    }
    
    public String translate(String word){
        if(fineng.containsKey(word)){
            return fineng.get(word);
        }else if(engfin.containsKey(word)){
            return engfin.get(word);
        }
        return null;
    }
    
    public void remove(String word){
        if(fineng.containsKey(word)){
            engfin.remove(fineng.get(word));
            fineng.remove(word);
        }else if(engfin.containsKey(word)){
            fineng.remove(engfin.get(word));
            engfin.remove(word);
        }
    }
    @Override
    public String toString(){
        return fineng + "\n" + engfin;
    }
    
    public boolean save(){
        try{
            fw=new FileWriter(filename);
        }catch(Exception ex){
            return false;
        }
        Set<String> keysfin=fineng.keySet();
        for(String temp:keysfin){
            try{
                fw.write(temp + ":" + fineng.get(temp) + "\n");
            }catch(Exception ex){
                
            }
        }
        try{fw.close();}    
        catch(Exception ex){}
        return true;
    }

}
