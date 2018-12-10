package file;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception{
        // test your code here

        File file = new File("src/testfile.txt");
        Analysis an=new Analysis(file);
        System.out.println(an.lines());
        System.out.println(an.characters());
    }
}
