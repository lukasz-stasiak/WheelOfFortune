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
        dividingGameToRounds(ROUNDS, numberOfPlayers, playerList);
        scanner.close();
    }

    private static void dividingGameToRounds(int rounds, int numberOfPlayers, ArrayList<Player> playerList) {
        PasswordManager passwordManager = new PasswordManager();
        Scanner scanner;
        String letter, randomPassword;

        for (int round = 1; round <= rounds; round++) {
            randomPassword = passwordManager.getRandomPassword();
            System.out.println("Rozpoczęła się runda: " + round);
            System.out.println("hasło do odgadnięcia: " + randomPassword);
            for (int x = 0; x < numberOfPlayers; x++) {
                System.out.println("Tura gracza: " + playerList.get(x));
                System.out.println("Zgadnij literę lub hasło");
                scanner = new Scanner(System.in);
                letter = scanner.nextLine();
                if (letter.length() > 1) {
                    System.out.println("Zgaduję hasło");

                    if (randomPassword.equalsIgnoreCase(letter)) {
                        System.out.println("Hasło odgadnięte");
                    } else {
                        System.out.println("Niepoprawne hasło");
                    }
                } else {
                    System.out.println("Zgaduję literę");
                    if (randomPassword.contains(letter)) {
                        System.out.println("Zgadnięta litera");
                    } else {
                        System.out.println("Taka litera nie występuje w haśle");
                    }
                }

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
