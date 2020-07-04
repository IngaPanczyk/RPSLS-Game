package rpsgame;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfWinns() {
        Scanner scaner = new Scanner(System.in);
        Scanner getName = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = getName.nextLine().toUpperCase();
        System.out.println("Witaj " + name);

        while (true) {
            System.out.println("Do ilu zwycięstw chcesz grać?");
            String s = scaner.nextLine();
            try {
                int winns = Integer.parseInt(s);
                if (winns >= 1 && winns <= 5) {
                    return winns;
                } else {
                    System.out.println("Niepoprawna wartość, wprowadź liczbę od 1 do 5");
                }
            } catch (Exception e) {
                System.out.println("Niepoprawna wartość, spróbuj jeszcze raz");
            }
        }
    }

    public static UserSelection getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Dokonaj wyboru (1)ROCK, (2)PAPER, (3)SCISSORS, (4)LIZARD, (5) SPOCK ");
            String s = scanner.nextLine().toUpperCase();
            if (s.equals("1")) {
                return UserSelection.ROCK;
            } else if (s.equals("2")) {
                return UserSelection.PAPER;
            } else if (s.equals("3")) {
                return UserSelection.SCISSORS;
            } else if (s.equals("4")) {
                return UserSelection.LIZARD;
            } else if (s.equals("5")) {
                return UserSelection.SPOCK;
            }
            System.out.println("Zły wybór, spróbuj ponownie");
        }
    }

    public static void showStatistics(UserSelection user, UserSelection computer, Winner winner, int computerScore, int humanScore, int round, int numberOfRunds) {
        System.out.println("Zagrano " + round + " rund");
        System.out.println("Komputer zagrał: " + computer + " Człowiek zagrał " + user);
        System.out.println("Wynik komputera: " + computerScore + " Wynik człowieka: " + humanScore);
        System.out.println("Zwycięzcą rundy jest " + winner);
    }

    public static void showFinalWinner(int computerScore, int humanScore) {
        System.out.println("Wynik gry");
        System.out.println("Komputer: " + computerScore);
        System.out.println("Człowiek: " + humanScore);
    }

    public static boolean getContinue() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Czy chcesz zrezygnowac z gry? X - TAK, N - NIE");
            String s = scanner.nextLine().toUpperCase();
            if (s.equals("X")) {
                return false;
            } else if (s.equals("N")) {
                return true;
            }
            System.out.println("Błedne dane, aby zrezygnować wpisz X, aby zagrać ponownie wpisz N");
        }
    }
}
