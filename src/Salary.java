import java.util.Scanner;

public class Salary {
    //main method


    static String id;
    static String name;
    static double salary;



    public static void main(String[] args) {
        //local variable

        //create scanner object and
        Scanner scanner = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter employee ID : ");
        id =scanner.nextLine();
        System.out.println("Type your Name : ");
        name = scanner.nextLine();
        System.out.println("Enter your basic Salary : ");
        salary = scanner.nextDouble();
        //find out HRA ,Da,Ta , PF and gross on basis of salary
        double HRA =( salary *10/100);
        double Da = (salary*8/100);
        double Ta =(salary*9/100);
        double PF =(salary*20/100);
        double gross =(salary +HRA+Da+Ta-PF);
        // acknowledge the user what to enter

        System.out.println("HRA = "+HRA);
        System.out.println("DA = "+ Da);
        System.out.println("Ta = "+ Ta);
        System.out.println("PF = "+ PF);
        System.out.println("gross salary =" +gross);

    }

}
