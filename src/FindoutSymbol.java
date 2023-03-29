import java.util.Scanner;

public class FindoutSymbol {

    //Main method
    public static void main(String[] args) {
        //create scanner object
        Scanner scanner=new Scanner(System.in);
        //Declared variable
        char story;
        //acknowledge the user what to enter
        System.out.println("Enter any value");
        story=scanner.next().charAt(0);
        //condition applied
        if((story>='a'&& story<='z')||(story>='A' && story<='Z')){
            System.out.println("This is an alphabet");
        }
        else if (story>='0'&& story<='9'){
            System.out.println("This is number");
        }
        else{
            System.out.println("This is symbol");
        }

    }
}
