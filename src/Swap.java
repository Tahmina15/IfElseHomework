import java.util.Scanner;

public class Swap {
    //main method
    public static void main(String[] args) {
        //local variable
        int a;
        int b;
        //create scanner object
        Scanner swap = new Scanner(System.in);

        System.out.println("Input the first number\na=");
        a=swap.nextInt();  //numerical input
        System.out.println("Input the second number\nb=");
        b=swap.nextInt();       // numerical input
        // write the code to swap the value
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The result of swap numbers :\n"+" "+"a = " + a +" "+"\nand\n"+ " "+ "b = "+b); //print the value

    }

}
