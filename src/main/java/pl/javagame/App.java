package pl.javagame;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        final int ROUNDS = 4;

        ArrayList<Player> playerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = checkingNumberOfPlayers(scanner);
        scanner.nextLine();

        try {
            for (int i = 1; i < numberOfPlayers + 1; i++) {
                System.out.println("Wpisz imię gracza nr: " + i);
                Player name = new Player(scanner.nextLine());
                playerList.add(name);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Nie podałeś imienia gracza");
        }

        System.out.println("Lista graczy: ");
        for (Player lista : playerList) {
            System.out.println("Gracz: " + lista);
        }
        scanner.close();

        dividingGameToRounds(ROUNDS, numberOfPlayers, playerList);
    }

    private static void dividingGameToRounds(int rounds, int numberOfPlayers, ArrayList<Player> playerList) {
        PasswordManager passwordManager = new PasswordManager();

        for (int round = 1; round <= rounds; round++) {
            System.out.println("Rozpoczęła się runda: " + round);
            System.out.println(passwordManager.getRandomPassword());
            for (int x = 0; x < numberOfPlayers; x++) {
                System.out.println("Tura gracza: " + playerList.get(x));
            }
        }

    }

    private static int checkingNumberOfPlayers(Scanner scanner) {
        System.out.print("Podaj ilość graczy: ");
        int numberOfPlayers = scanner.nextInt();

        while (numberOfPlayers < 2 || numberOfPlayers > 4) {
            System.out.println("Ilość graczy ma być między 2 i 4");
            System.out.print("Podaj ilość graczy: ");
            numberOfPlayers = scanner.nextInt();
        }
        return numberOfPlayers;
    }
}
