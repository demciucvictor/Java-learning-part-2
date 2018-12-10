
public class Change {
    
    private char initCharacter;
    private char finalCharacter;
    
     public Change(char fromCharacter, char toCharacter){
         this.initCharacter=fromCharacter;
         this.finalCharacter=toCharacter;
     }
     public String change(String characterString){
         int i=characterString.length();
         String finalString="";
         for(int j=0; j<i; j++){    
             if(characterString.charAt(j)==initCharacter){
                 finalString+=finalCharacter;
             }else{
                 finalString+=characterString.charAt(j);
             }
         }
         return finalString;
     }
}
