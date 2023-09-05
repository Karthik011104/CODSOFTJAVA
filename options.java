
import java.util.*;

public class options extends guess {
    private static final options Generate = null;
    public static void resetScore(){
        score=10;
    }
    public static void displayRules(){
        

        System.out.println("Following are the rules of game:");
        System.out.println("1. Guess a random number from range 1 to 100.");
        System.out.println("2. You have only 5 chances to guess the correct answer.");
        System.out.println("3. Your score will be displayed based on your attempts, Goodluck!");
    }
    
  
    
        public void playGame(){
        Scanner sc=new Scanner(System.in); 
        String choice="y";
        displayRules();
        while(choice.equals("y") || choice.equals("Y")){
        gen=generate.genNumber();
        System.out.println("");
        resetScore();
        
        System.out.print("Start the game, type y or n: ");
        choice=sc.next();
        System.out.println("");

        if(choice.equals("y") || choice.equals("Y")){
         guessNumber();
        }
        else{
            System.out.println("Your command has been recorded, thanks for playing!");
        }
    }
    
}
    public static void main(String args[]){
    }

    }

