
public class Main {

    public static void main(String[] args) throws Exception {
        // write some test code here
        // for testing purposes, project has files
        //    src/textfile.txt
        //    src/kalevala.txt
        Printer pr=new Printer("src/new.txt");
        pr.printLinesWhichContain("koe");
        pr.printLinesWhichContain("word");
    }
}
