import java.util.*;
public class Main {

    public static void main(String[] args) {
        Storehouse store = new Storehouse();
    store.addProduct("coffee", 5, 10);
    store.addProduct("milk", 3, 20);
    store.addProduct("milkbutter", 2, 55);
    store.addProduct("bread", 7, 8);

    Shop shop = new Shop(store, new Scanner(System.in));
    shop.manage("Pekka");
    }
}
