
import java.util.*;

public class guess extends generate {
    
        static Scanner sc=new Scanner(System.in);
        public static int gen=genNumber();
        public static int attempts;
        public static int guess=0;
        public static int score=10;

        public static void resetScore(){
            score=10;
        }

        public static void guessNumber(){
            attempts=0;
        for(int i=0;i<5;i++){

         System.out.print("Enter your choice: ");
         guess=sc.nextInt();
         attempts++;

         if(guess==gen){
         System.out.println("");   
         System.out.println("Correct, you guessed the correct answer!");
         System.out.println("Your total attempts are: "+ attempts);
         break;
         }
         else if(guess>gen){
            System.out.println("Your guess is too high!");
         }
         else if(guess<gen){
            System.out.println("Your guess is quite low!");
         }
         score--;
        }
        
        if(attempts >= 5 && guess != gen){
            resetScore();
            System.out.println("");
         System.out.println("Sorry, you are out of attempts. The correct answer was "+ gen +", your score is 0");
        }
        else{
            System.out.println("");
            System.out.println("Your score is: "+ score);
        }
    }

public static void main(String args[]){

}

public void options() {
}
}
