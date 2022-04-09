package pl.javagame;


import java.util.*;

public class PasswordManager {


    private HashMap<String, Boolean> passwords = new HashMap<>();
    // private ArrayList<String> copyPasswords = new ArrayList<>();

    public PasswordManager() {
        passwords.put("Apetyt rośnie w miarę jedzenia", false);
        passwords.put("Co dwie głowy to nie jedna", false);
        passwords.put("Cwiczenie czyni mistrza", true);
        passwords.put("Darowanemu koniowi w zęby się nie zagląda", false);
        //    passwords.add("Diabeł tkwi w szczegółach");
        //    passwords.add("Elektryka prąd nie tyka");

        //    getRandomPassword();
    }


    public String getRandomPassword() {

        String Password = null;
        String getKey;
        Boolean getValue;

        Integer max = passwords.keySet().toArray().length;// result=6
        //  int random = new Random().nextInt(max);

        //  System.out.println(Password);

        Object randomPassword = passwords.keySet().toArray()[new Random().nextInt(max)];

      //  randomPassword = checkigRandomPassword(randomPassword);

        for (Map.Entry<String, Boolean> map : passwords.entrySet()) {

            getKey = map.getKey();
            if (getKey.equals(randomPassword) && map.getValue() == true) {
                randomPassword = passwords.keySet().toArray()[new Random().nextInt(max)];
            } else if (getKey.equals(randomPassword) && map.getValue() == false) {
                Password = getKey;
                map.setValue(true);
            }
        }

        return Password;
    }

    public Object checkigRandomPassword(Object randomPassword2) {
        for (Map.Entry<String, Boolean> map : passwords.entrySet()) {
            Integer max = passwords.keySet().toArray().length;
            String getKey;
            getKey = map.getKey();
            if (getKey.equals(randomPassword2) && map.getValue() == true) {
                randomPassword2 = passwords.keySet().toArray()[new Random().nextInt(max)];
                checkigRandomPassword(randomPassword2);
            }
        }
        return randomPassword2;
    }


}



