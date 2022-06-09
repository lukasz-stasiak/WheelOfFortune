package pl.javagame;


import java.util.*;

public class PasswordManager {


    private ArrayList<String> passwords = new ArrayList<>();
    private ArrayList<String> passwordsPicked = new ArrayList<>();
    // private ArrayList<String> copyPasswords = new ArrayList<>();

    public PasswordManager() {
        passwords.add("Apetyt rośnie w miarę jedzenia");
        passwords.add("Co dwie głowy to nie jedna");
        passwords.add("Cwiczenie czyni mistrza");
        // passwords.add("Darowanemu koniowi w zęby się nie zagląda");
        //    passwords.add("Diabeł tkwi w szczegółach");
        //    passwords.add("Elektryka prąd nie tyka");
        //passwords_picked.add("Apetyt rośnie w miarę jedzenia");
        //passwords_picked.add("Co dwie głowy to nie jedna");
    }


    public String getRandomPassword() {
        String randomPassword;
        do {
            int max = passwords.size();// result=6
            if (max == 0) {
                throw new IllegalStateException("Brak unikalnego hasła");
            }
            int random = (int) (Math.random() * max);
            randomPassword = passwords.get(random);
        } while (checkifPasswordIsUnique(randomPassword) == true);

        passwordsPicked.add(randomPassword);
        passwords.remove(randomPassword);

        return randomPassword;

    }

    private boolean checkifPasswordIsUnique(String randomPassword) {

        boolean check = false;
        for (int i = 0; i < passwordsPicked.size(); i++) {
            if (passwordsPicked.get(i).equals(randomPassword)) {
                check = true;
            }
        }
        return check;
    }


}



