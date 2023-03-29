import java.util.Scanner;

public class Marksheet1 {//Global variable declared
    static String name;
    static int roll;
    static int math,eng,science;
    //Main method
    public static void main(String[] args) {
        //create scanner objects and pass Name, Roll and marks in it
        Scanner scanner = new Scanner(System.in);
        //Print the text and acknowledge the user what to enter
        System.out.println("enter Name");
        name = scanner.nextLine();
        System.out.println("enter roll num");
        roll = scanner.nextInt();
        //enter 3 subjects mark
        System.out.println("enter marks in maths,eng,science");
        math = scanner.nextInt();
        eng = scanner.nextInt();
        science = scanner.nextInt();
        int total = math + eng + science;
        //Print total marks
        System.out.println("Total marks :" + total);
        float percentage = ((float) total / 3);
        //extract the percentage from total mark
        System.out.println("Percentage =" + percentage);
        //check for condition
        if (percentage >= 80 && 100 >= percentage) {
            System.out.println("Result = pass\nYour Grade is A+");
        } else if (percentage >= 60 && 79 >= percentage) {
            System.out.println("Result = pass\nYour Grade is A");
        } else if (percentage >= 50 && 59 >= percentage) {
            System.out.println("Result=pass\nYour Grade is B");
        } else if (percentage >= 35 && 49 >= percentage) {
            System.out.println("Result = pass\nYour Grade is C");
        } else {
            System.out.println("You are Fail");
        }
    }
}
