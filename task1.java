package CODSOFT;

import java.util.*;
public class task1 {
    public static boolean numberGame(int round,int randomNumber){
        Scanner sc=new Scanner(System.in);
         System.out.println("guess the number");
        int guessLimit=9;
         int guess=sc.nextInt();
                if(randomNumber==guess){
                System.out.println("WOW!: Your guess is correct:");
                System.out.println("your score is: "+round+"."+guessLimit);
                return false;
            }
        while(guessLimit!=1){
             
            if(randomNumber>guess){
                System.out.println("Oops!: guess is too low:");
                System.out.println("guess again");
                guess=sc.nextInt();
                guessLimit--;
            }
            else if(randomNumber<guess){
                System.out.println("Oops!: guess is too high:");
                System.out.println("guess again");
                guess=sc.nextInt();
                 guessLimit--;
            }
            else{ 
                System.out.println("WOW!: Your guess is correct:");
                System.out.println("your score is: "+round+"."+(guessLimit));
                return false;
            }
        }
        System.out.println("Your Limit is over, Try again");
        return true;
    }
    public static void main(String args[]){ 
        int randomNumber=(int)Math.ceil(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Number-Game");

        System.out.println("Round Limit is 5\nGuess Limit is 7");
        System.out.println("Higest score is 5.7");
        int i=4;
        if(numberGame(5,randomNumber)){
             for(;i>=1;i--){
                 System.out.println("for next round enter 1 OR enter 0");
                int info=sc.nextInt();
                int newNumber=(int)Math.ceil(Math.random()*100);
                if(info==1){
                    if(numberGame(i,newNumber)==false) break;
                }
                else{
                    System.out.println("Game Over");
                    System.out.println("Your score is: 0.0");
                    break;
                }
            }  
        }
        if(i==0){
           System.out.println("Game Over"); 
           System.out.println("Your score is: 0.0"); 
        }  
    }
}
