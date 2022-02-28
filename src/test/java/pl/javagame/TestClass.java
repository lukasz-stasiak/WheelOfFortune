package pl.javagame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {


    @Test
    public void PlayerTestNull() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Player p1 = new Player(null);
        });

    }

    @Test
    public void PlayerTestBlankString() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Player p2 = new Player("");
        });
    }

    @Test
    public void PlayerTestWithString() {

        Player p3 = new Player("Jan");
        String nameCreated = p3.toString();
        String nameBlank = "Jan";
        assertEquals(nameBlank, nameCreated, "porownanie konstruktora z toString");
    }

}
