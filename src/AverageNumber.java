import java.util.Scanner;

public class AverageNumber {
    //Main method
    public static void main(String[] args) {
        //create scanner object
        Scanner scanner=new Scanner(System.in);
        //print the text & acknowledge the user what to do
        System.out.println("Enter first number");

        int num1 = scanner.nextInt();

        System.out.println("Enter second number ");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number");
        int num3 = scanner.nextInt();

        System.out.println("Enter fourth number");
        int num4 = scanner.nextInt();

        System.out.println("Enter fifth number");
        int num5 = scanner.nextInt();
        //answer should be an average number basis of user input
        System.out.println("Average of five number is :"+ (num1+num2+num3+num4+num5) /5 );



    }
}
