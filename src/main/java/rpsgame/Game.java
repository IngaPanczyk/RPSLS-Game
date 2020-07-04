package rpsgame;

public class Game {

    private int numberOfWinns;
    private int round;
    private int computerScore;
    private int humanScore;

    void run() {
        numberOfWinns = UserDialogs.getNumberOfWinns();
        round = 1;
        while (computerScore < numberOfWinns && humanScore < numberOfWinns) {
            UserSelection user = UserDialogs.getUserSelection();
            UserSelection computer = AI.getComputerSelection();
            Winner winner = AI.getWinner(user, computer);
            if (winner == Winner.COMPUTER) {
                computerScore++;
            } else if (winner == Winner.HUMAN) {
                humanScore++;
            } else {
                computerScore++;
                humanScore++;
            }
            UserDialogs.showStatistics(user, computer, winner, computerScore, humanScore, round, numberOfWinns);

            round++;
        }
        UserDialogs.showFinalWinner(computerScore, humanScore);
    }
}
