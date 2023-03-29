import java.util.Scanner;

public class SellersInfo {
    //Variable declared
    String id;
    String name;
    double amount;
    double salary;
    //create User define method
    public void salesCommission() {
        //create scanner objects
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sales Id : ");
        String id = scanner.nextLine();
        //print the text and acknowledge the user what to do
        System.out.println("Enter Name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your basic salary : ");
        double salary = scanner.nextDouble();
        System.out.println("Enter your sales amount : ");
        double amount = scanner.nextDouble();

        //condition applied

        if (amount >= 50000) {
            System.out.println("Your sales commission is :  " + amount * 35 / 100);

        }
        else if (amount >= 30000) {
            System.out.println("Your sales commission is : " + amount * 20 / 100);

        }
        else if (amount >= 20000) {
            System.out.println("Your sales commission is : " + amount *10/100);
        }

        else if (amount>=1000) {
            System.out.println("Your sales commission is : "+amount*5/100);

        }

        else {
            System.out.println("Your commission is : " +amount*2/100);
        }
    }
    //calling main method
    public static void main(String[] args) {
        SellersInfo sellersInfo = new SellersInfo();
        sellersInfo.salesCommission();
    }

}
