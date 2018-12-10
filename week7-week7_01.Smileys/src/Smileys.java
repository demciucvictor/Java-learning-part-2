
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    private static void printWithSmileys(String characterString){   
     int i=characterString.length();
     if(characterString.length()%2==1){
         characterString+=" ";
          i=characterString.length();
     }
     printLine(i);
     initialize(characterString, i);
     printLine(i);
     
     
     
       
    }
    private static void printLine(int length){
        if(length%2==1){
            length++;
        }
        System.out.print(":)");
        for(int j=0; j<length/2+1; j++){
            System.out.print(":)");
        }
        System.out.println(":)");
    }
    private static void initialize(String s, int length){
        System.out.print(":) ");
        System.out.print(s);
        System.out.println(" :)");
    }
}
