
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String,String> list = new HashMap<String, String>();
        list.put("matti", "mage");
        list.put("mikael", "mixu");
        list.put("arto", "arppa");
        
        System.out.println(list.get("mikael"));
    }

}
