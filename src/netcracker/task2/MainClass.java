package netcracker.task2;

import java.util.Scanner;
/**
 * Main class to test voices
 */
public class MainClass {
    /**
     * main
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of players: ");
        int pl = scanner.nextInt();
        System.out.println("Enter number of dices ");
        int dices = scanner.nextInt();
        DiceGame myGame = new DiceGameImpl(pl, dices);
        System.out.println("Payer "+ (myGame.playGame())+" wins!");
    }
}
