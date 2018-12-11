
public class Main {

    public static void main(String[] args) {
        String s="08:24:23";
        System.out.println(clockTime(s));
        String t="14";
        if(t.matches("[0-1][0-9]|2[0-4]")){    
            System.out.println("works");
        }
    }
    
    public static boolean isAWeekDay(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public static boolean allVowels(String string){
        boolean t=true;
        return string.matches("(a|e|i|o|u|ä|ö)+");
    }
    
    public static boolean clockTime(String string){
        boolean t=true;
        if(!string.matches("2[0-3]{1}+:+[0-5]{1}[0-9]{1}+:+[0-5]{1}[0-9]{1}|[0-1][0-9]+:+[0-5]{1}[0-9]{1}+:+[0-5]{1}[0-9]{1}")){
            return false;
        }
        return t;
    }
}
