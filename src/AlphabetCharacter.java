import java.util.Scanner;

public class AlphabetCharacter {
    //Main method
    public static void main(String[] args) {
        //variable
        char alpha;
        //create scanner objects
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter any alphabet in uppercase");     //given direction that what to enter
        String line= scanner.nextLine();

        System.out.println("Lowercase letter is :"+(line.toLowerCase()));  //Uppercase alphabet replaced to lower case
    }
}
