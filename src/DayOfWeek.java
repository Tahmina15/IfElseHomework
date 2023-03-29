import java.util.Scanner;

public class DayOfWeek {
        //Main method
        public static void main(String[] args) {
        //increment a value
        int day;
        //create scanner objects
        Scanner scanner = new Scanner(System.in);
        //prints the text and acknowledge the user what to do
        System.out.println("Enter the week number (1-7) ");
        day = scanner.nextInt();
        if (day == 1) {
            System.out.println("This is Monday");
        } else if (day == 2) {
            System.out.println("This is Tuesday");
        } else if (day == 3) {
            System.out.println("This is Wednesday");
        } else if (day == 4) {
            System.out.println("This is Thursday");
        } else if (day == 5) {
            System.out.println("This is Friday");}
        else if (day == 6) {
            System.out.println("This is Saturday");
        }
        else if(day==7){
            System.out.println("This is Sunday");
        }
        else{
            System.out.println("Enter 1 to 7");
        }
    }
}
