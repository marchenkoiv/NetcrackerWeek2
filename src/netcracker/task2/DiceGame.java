package netcracker.task2;

public interface DiceGame {
    /**
     * @return max number in array score[]
     */
    int maxCurrent();
    /**
     * @return max number in array score[], which is lower than maxCurrent variable
     */
    int lowerMax(int maxCurrent);
    /**
     * @return number of player, who was the winner of previous round
     */
    int winnerOfPrev(int[] queue);
    /**
     * A round of the game
     * thisRound[1] = 4 means that Player 1 will be 5th in the next round
     * @return Queue of players for the next round
     */
    int[] nextRound(int[] queue);
    /**
     * The whole game
     * Includes arrays queue[] - array of queue of round and wins[] - it counts number of wins
     * @return Number of players, who wins
     */
    int playGame();
}
