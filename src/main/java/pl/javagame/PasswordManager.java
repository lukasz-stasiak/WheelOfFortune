package pl.javagame;


import java.util.ArrayList;
import java.util.Random;

public class PasswordManager {


    private ArrayList<String> passwords = new ArrayList<>();

    public PasswordManager() {
        passwords.add("Apetyt rośnie w miarę jedzenia");
        passwords.add("Co dwie głowy to nie jedna");
        passwords.add("Cwiczenie czyni mistrza");
        passwords.add("Darowanemu koniowi w zęby się nie zagląda");
        passwords.add("Diabeł tkwi w szczegółach");
        passwords.add("Elektryka prąd nie tyka");

        getRandomPassword();
    }


    public String getRandomPassword() {
        int max = passwords.size(); // result=6
        int i = (int) (Math.random() * max);
        String randomPassword = passwords.get(i);
        passwords.remove(i); // to avoid the same passwords
        return randomPassword;

    }

}


