import java.util.Scanner;

public class VoteEligibility {
        //declared the variable
         int age;
         //user define method
         public  void eligibleForVote() {
         //create scanner object
         Scanner scanner = new Scanner(System.in);
         //print the text and tell the user what to enter
         System.out.println("please enter your age");
        age= scanner.nextInt();
        //condition apply for age
        if(age>=18){
            System.out.println("You are eligible for vote ");
        }
        else{
            System.out.println("You are not eligible for vote ");
        }
       }
       //calling main method
        public static void main(String[] args) {
        VoteEligibility voteEligibility=new VoteEligibility();
        voteEligibility.eligibleForVote();
    }
}
