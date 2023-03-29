import java.util.Scanner;

public class NumberIdentifier {
       public static void main(String[] args) {
        //variable declared
        int num;
        //create scanner object
        Scanner scanner = new Scanner(System.in);
        //prints the text
        System.out.println("Enter a number");
        num = scanner.nextInt();
        //check the number is positive or not
        if (num > 0) {
            System.out.println("The number is positive");
        }
        //condition applied
        else if (num < 0)
        {System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }

    }
}
