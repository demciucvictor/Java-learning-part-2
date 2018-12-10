import java.util.*;


public class UserInterface {
    
    private Scanner reader;
    private PhoneBook Book;

    public UserInterface(){
        
        this.reader=new Scanner(System.in);
        this.Book=new PhoneBook();
        
    }
    
    public void start(){
        
        System.out.println("phone search\n" +
        "available operations:\n" +
        " 1 add a number\n" +
        " 2 search for a number\n" +
        " 3 search for a person by phone number\n" +
        " 4 add an address\n" +
        " 5 search for personal information\n" +
        " 6 delete personal information\n" +
        " 7 filtered listing\n" +
        " x quit");
        while(true){
            System.out.print("\ncommand: ");
            String scn=reader.nextLine();
            if(scn.equals("1")){
                System.out.print("whose number: ");
                String name=reader.nextLine();
                System.out.print("number: ");
                String nr=reader.nextLine();
                Book.addNr(name, nr);
            }else if(scn.equals("2")){
                System.out.print("whose number: ");
                String name=reader.nextLine();
                Book.searchNr(name);
                
            }else if(scn.equals("3")){    
                System.out.print("number: ");
                String nr=reader.nextLine();
                Book.searchName(nr);
            }else if(scn.equals("4")){   
                System.out.print("whose address: ");
                String name=reader.nextLine();
                System.out.print("street: ");
                String street=reader.nextLine();
                System.out.print("city: ");
                String city=reader.nextLine();
                Book.addSt(name, street, city);
            }else if(scn.equals("5")){
                System.out.print("whose information: ");
                String name=reader.nextLine();
                Book.infoSearch(name);
            }else if(scn.equals("6")){
                System.out.print("whose information: ");
                String name=reader.nextLine();
                Book.remove(name);
            }else if(scn.equals("7")){
                System.out.print("keyword (if empty, all listed): ");
                String s=reader.nextLine();
                Book.filterSearch(s);
            }else if(scn.equals("x")){
                break;
            }
            
        }
        
    }
    
    
    
}
