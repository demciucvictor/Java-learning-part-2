public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    public static void addSuitcasesFullOfBricks(Container container){
        for(int i=0; i<100; i++){   
            Suitcase temp = new Suitcase(1000);
            temp.addThing(new Thing ("brick", i+1));
            container.addSuitcase(temp);
        }
    }
}