package CODSOFT;

import java.util.Scanner;
import java.util.Random;
public class NumberGuessGame{
    public static void main(String[] args) {
        Random rand=new Random();
        int numberToGuess=rand.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int guess;
         numberToGuess ++ ;
    
        System.out.println("Welcome the Number Guess Game!");
        System.out.println("Guess a number between 1 to 100 : ");
        
       for(int i=1;i<=10;i++){
        for(int j=1;j<=10;j++){
            guess=sc.nextInt();
            if(guess==numberToGuess){
                System.out.println("Congratulation , You guess the Correct Number !");
                break;
        
            }
            else if(guess<numberToGuess){
                System.out.println(" Your guess is Too Low .  Try again : ");
            }
            else{
                System.out.println("Your guess is Too High . Try again : ");
    
            }

        }
            System.out.println("Play Again: ");
        
    
    
        }
        
    }

}
 