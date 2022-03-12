package pl.javagame;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArrayList<Player> playerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = checkingNoOfPlayers(scanner);

        try {
            for (int i = 1; i < numberOfPlayers + 1; i++) {
                System.out.println("Wpisz imię gracza nr: " + i);
                Player name = new Player(scanner.next());
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

    }

    private static int checkingNoOfPlayers(Scanner scanner) {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilość graczy: ");
        int noOfPlayers = scanner.nextInt();

        while (noOfPlayers < 2 || noOfPlayers > 4) {
            System.out.println("Ilość graczy ma być między 2 i 4");
            System.out.print("Podaj ilość graczy: ");
            noOfPlayers = scanner.nextInt();
        }
        return noOfPlayers;


    }
}
