package pl.javagame;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArrayList<Player> listaGraczy = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int iloscGraczy = sprawdzIlloscGraczy();

        try {
            for (int i = 1; i < iloscGraczy + 1; i++) {
                System.out.println("Wpisz imię gracza nr: " + i);
                Player imie = new Player(scanner.nextLine());
                listaGraczy.add(imie);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Nie podałeś imienia gracza");
        }

        System.out.println("Lista graczy: ");
        for (Player lista : listaGraczy) {
            System.out.println("Gracz: " + lista);
        }
        scanner.close();

    }

    private static int sprawdzIlloscGraczy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilość graczy: ");
        int iloscGraczy = scanner.nextInt();

        while (iloscGraczy < 2 || iloscGraczy > 4) {
            System.out.println("Ilość graczy ma być między 2 i 4");
            System.out.print("Podaj ilość graczy: ");
            iloscGraczy = scanner.nextInt();
        }
        return iloscGraczy;


    }
}
