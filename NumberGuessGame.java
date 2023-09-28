import java.util.Scanner;
import java.util.Random;
public class NumberGuessGame{
    
    public static void main(String[] args) {

        Random rand=new Random();

        int numberToGuess=rand.nextInt(100)+1;

        Scanner sc=new Scanner(System.in);

        int attempts=0;

        int maxAttempts=10;
    
        System.out.println("Welcome the Number Guess Game!");

        System.out.println("Guess a number between 1 to 100 : ");
        
       for(int i=1;i<=10;i++){
        
        for(int j=1;j<=10;j++){
          

           while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");

               int guess = sc.nextInt();

              attempts++;

              maxAttempts++;

            if(guess==numberToGuess){

                System.out.println("Congratulation , You guess the Correct Number !"+ attempts + " attempts.");

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
          sc.close();
  }
  
}



 