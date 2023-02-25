import java.util.*;
import javax.swing.*;
public class Number_guess_game
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100*Math.random());
        //System.out.println(number);
        JOptionPane.showMessageDialog(null,"===================================*****INSTRUCTIONS OF THE GAME*****===================================\n" +
        "1 - You can choose N-Number of Chances to Guess the number.\n" +
        "2 - User have to Guess the Number between 1 to 100 (Including 1 & 100).\n" +
        "3 - If the guessed number by the user is greater than computer generated number, player can guess number again.\n" +
        "4 - If the guessed number by the user is lesser than computer generated number, player can guess number again.\n" +
        "5 - If the user guessing number is same as computer generated number then player declared as a winner with number of guessing steps.\n" +
        "6 - Those who get more points in the game they win the game.");
        System.out.println("Enter the Chances You want to Guess the Number");
        int chances=sc.nextInt();
        int i=1,save=chances;
        boolean f=true,win=false;
        while(chances-->0){
            if(f){
            System.out.println("Guess the Number:"); }
            else{
                System.out.println("Choose Again.. "+(save-i+1)+" steps are left");
            }
            int step=sc.nextInt();
            
            if(step>number){
                f=false;
                System.out.println("Your guessed number is Greater than the Generated Number!!");
            }
            else if(step<number){
                f=false;
                System.out.println("Your guessed Number is Lesser than Generated Number!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Congratulations!! You win the Game. You Guessed the correct Number in "+(i)+" Steps and Your Guessed number is "+number);
                win=true;
                break; }
            i++; }
            if(!win){
        JOptionPane.showMessageDialog(null,"Your Chances exhausted. You loose the Game"); }
	}
}
