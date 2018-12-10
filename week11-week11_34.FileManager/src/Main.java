
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        FileManager t = new FileManager();

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }
}
