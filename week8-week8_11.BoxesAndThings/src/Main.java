
public class Main {
     
    public static void main(String[] args) {
        Box box = new Box(10);
        Box bix =new Box(10);

       box.add( new Book("a"," b", 2));
       bix.add( new Book("c", "ds", 3));
       box.add(bix);
        System.out.println(box);
    }
      
}
