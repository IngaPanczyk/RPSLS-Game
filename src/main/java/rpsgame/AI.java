package rpsgame;

import java.util.Random;

public class AI {
    public static UserSelection getComputerSelection() {
        Random random = new Random();
        int n = random.nextInt(3);
        if (n == 1) {
            return UserSelection.ROCK;
        } else if (n == 2) {
            return UserSelection.PAPER;
        } else {
            return UserSelection.SCISSORS;
        }

    }

    public static Winner getWinner(UserSelection user, UserSelection computer) {

        if (user == UserSelection.PAPER) {
            if (computer == UserSelection.PAPER) {
                return Winner.BOTH;
            } else if (computer == UserSelection.ROCK || computer == UserSelection.SPOCK) {
                return Winner.HUMAN;

            } else if (computer == UserSelection.LIZARD || computer == UserSelection.SCISSORS){
                return Winner.COMPUTER;
            }

        } else if (user == UserSelection.ROCK) {
            if (computer == UserSelection.ROCK) {
                return Winner.BOTH;
            } else if (computer == UserSelection.PAPER || computer == UserSelection.SPOCK) {
                return Winner.COMPUTER;
            } else if (computer == UserSelection.LIZARD || computer == UserSelection.SCISSORS){
                return Winner.HUMAN;
            }

        } else if (user == UserSelection.SCISSORS){
            if (computer == UserSelection.SCISSORS) {
                return Winner.BOTH;
            } else if (computer == UserSelection.PAPER || computer == UserSelection.LIZARD) {
                return Winner.HUMAN;
            } else if(computer == UserSelection.ROCK || computer == UserSelection.SPOCK) {
                return Winner.COMPUTER;
            }
        }else if (user == UserSelection.LIZARD){
            if(computer == UserSelection.LIZARD){
                return Winner.BOTH;
            }else if (computer == UserSelection.ROCK || computer == UserSelection.SCISSORS){
                return Winner.COMPUTER;
            }else if (computer == UserSelection.SPOCK || computer == UserSelection.PAPER){
                return Winner.HUMAN;
            }
        }else {
            if (computer == UserSelection.SPOCK){
                return Winner.BOTH;
            }else if (computer == UserSelection.LIZARD || computer == UserSelection.PAPER){
                return Winner.COMPUTER;
            }else if (computer == UserSelection.SCISSORS || computer == UserSelection.ROCK){
                return Winner.HUMAN;
            }
        }
        return Winner.HUMAN;
    }
}
