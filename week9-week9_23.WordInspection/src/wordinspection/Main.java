package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception{
        // test your code here

        File file = new File("src/shortList.txt");
        WordInspection wi=new WordInspection(file);
        System.out.println(wi.wordCount());
        for(String t : wi.wordsContainingZ()){
            System.out.println(t);
        }
        for(String t : wi.wordsEndingInL()){
            System.out.println(t);
        }
        for(String t : wi.palindromes()){
            System.out.println(t);
        }
        for(String t : wi.wordsWhichContainAllVowels()){
            System.out.println(t);
        }

    }
}
