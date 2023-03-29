import java.util.Scanner;

public class MarksheetPassFail {
    //Global veriable
    static String name;
    static int roll;
    static int eng, maths, science;

    //Main method
    public static void main(String[] args) {
        //create scanner objects and pass Name, Roll and marks in it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");    //print Enter your name :
        name =scanner.nextLine();                    // user will enter name
        System.out.println("Enter your roll");
        roll = scanner.nextInt();
        System.out.println("enter your eng mark");
        eng = scanner.nextInt();
        System.out.println("Enter your maths mark");
        maths = scanner.nextInt();
        System.out.println("Enter your science mark");
        science = scanner.nextInt();
        //check for condition
        if (eng >= 35 && maths >= 35 && science >= 35) {
            System.out.println("Result : pass");    //Print results according to the condition
        } else {
            System.out.println("Fail");
        }

    }
}
