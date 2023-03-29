import java.util.Scanner;

public class LeapYear {
    //main method
    public static void main(String[] args) {
        int year;
        System.out.println("Enter any Year ");      //print the comment
        //create scanner object
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        //check for condition
        if(year % 4 == 0){
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap year");}
    }
}
