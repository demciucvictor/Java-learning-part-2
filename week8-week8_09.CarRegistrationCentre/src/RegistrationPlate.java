
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    @Override
    public boolean equals(Object plate){
        if(plate==null){
            return false;
        }
        if(getClass()!=plate.getClass()){
            return false;
        }
        RegistrationPlate compared = (RegistrationPlate) plate;
        
        if(!this.regCode.equals(compared.regCode)){
            return false;
        }
        if(!this.country.equals(compared.country)){ 
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        if(this.regCode.equals(null)){  
            return 5;
        }
        return this.country.hashCode() + this.regCode.hashCode();
    }

}
