import java.util.Scanner;

public class CityName {
        String name ; //local variable
       //user defined method
        public void cities(){
        //create scanner object
        Scanner scanner =new Scanner(System.in);
        // user will Enter the City name
        System.out.println("Enter the City name");
        String name =scanner.nextLine();
        //check for condition
        if (name.startsWith("A")){
            System.out.println("Abu Dhabi");
        }
        else if (name.startsWith("B")) {
            System.out.println("Birmingham");
        }
        else if (name.startsWith("C")){
            System.out.println("Calcutta");
        }
        else if (name.startsWith("D")) {
            System.out.println("Dhaka");
        }
        else if(name.startsWith("E")){

            System.out.println("Eindhoven");

        }
        else if (name.startsWith("F")){
            System.out.println("Faisalabad");
        }
        else{
            System.out.println("Invalid entry");}
    }
    //calling main method
    public static void main(String[] args) {
        CityName cityName =new CityName();         //create the object
        cityName.cities();
    }
}
