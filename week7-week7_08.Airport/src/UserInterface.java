import java.util.*;
public class UserInterface {
    private Scanner reader;
    private Airport airport;
    
    public UserInterface(Scanner reader, Airport airport){
        this.reader=reader;
        this.airport=airport;
    }
    
    public void start(){    
        String scan;
        System.out.println("Airport panel\n" + "--------------------");
        while (true){
            System.out.print("Choose operation:\n[1] Add airplane\n[2] Add flight\n[x] Exit\n>");
            scan=reader.nextLine();
            if(scan.equals("1")){
                System.out.print("Give plane ID: ");
                String a=reader.nextLine();
                System.out.print("Give plane capacity: ");
                String b=reader.nextLine();
                airport.addPlane(a, b);
            }else if(scan.equals("2")){
                System.out.print("Give plane ID: ");
                String ID=reader.nextLine();
                if(airport.contains(ID)){
                    System.out.print("Give departure airport code: ");
                    String dep=reader.nextLine();
                    System.out.print("Give destination airport code: ");
                    String dest=reader.nextLine();
                    airport.addFlight(ID, dep, dest);
                    
                }
            }else if(scan.equals("x")){
                break;
            }System.out.println("");
        }
        System.out.println("");
        startServiceMenu();
    }
    public void startServiceMenu(){ 
        String scan;
        System.out.println("Flight service\n" + "------------");
        while (true){
            System.out.print("Choose operation:\n[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit\n>");
            scan=reader.nextLine();
            if(scan.equals("1")){
                airport.printPlanes();
            }else if(scan.equals("2")){ 
                airport.printFlights();
            }else if(scan.equals("3")){ 
                System.out.print("Give plane ID: ");
                String temp=reader.nextLine();
                if(airport.contains(temp)){   
                    airport.searchByID(temp);
                }
            }else if(scan.equals("x")){ 
                break;
            }System.out.println("");
        }
    }
}
