package pl.javagame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {
    @Test
    public void alwaysPass() {
        assertTrue(true);
    }

    @Test
    public void PlayerTestNull() {

        try{
           // System.out.println("Porownanie konstruktora Null z to String");
            Player p1 = new Player(null);
            String nameCreated =  p1.toString();
            String nameNull = null;
            assertEquals(nameNull, nameCreated, "porownanie null z toString" );
        } catch (IllegalArgumentException e) {
            System.out.println("imie jest null");
        }

    }

    @Test
    public void PlayerTestBlankString() {
        try{
            //System.out.println("Porownanie konstruktora Blank z to String");
            Player p2 = new Player("");
            String nameCreated =  p2.toString();
            String nameBlank = "";
            assertEquals(nameBlank, nameCreated, "porownanie blank String z toString" );
        } catch (IllegalArgumentException e) {
            System.out.println("imie jest blank");
        }
    }

    @Test
    public void PlayerTestWithString() {
        try{
            //System.out.println("Porownanie konstruktora z imieniem z toString");
            Player p3 = new Player("Jan");
            String nameCreated =  p3.toString();
            String nameBlank = "Jan";
            assertEquals(nameBlank, nameCreated, "porownanie konstruktora z toString" );
        } catch (IllegalArgumentException e) {
            System.out.println("imie jest null lub bez znakow");
        }
    }

    @Test
    void testExpectedExceptionWithParentType() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("One");
        });
    }
}
