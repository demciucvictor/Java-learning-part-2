package personnel;

public class Main {

    public static void main(String[] args) {
        Employees t = new Employees(); 
Person h = new Person("Arto", Education.D); t.add(h); 
h = new Person("Pekka", Education.B); t.add(h); 
h = new Person("Matti", Education.D); t.add(h); 
t.fire(Education.D);
 t.print();
    }
}
