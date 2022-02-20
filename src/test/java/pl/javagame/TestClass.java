package pl.javagame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {
    @Test
    public void alwaysPass() {
        assertTrue(true);
    }

    @Test
    public void PlayerTestNull() {
        Player p1 = new Player(null);
        System.out.println(p1);
    }

    @Test
    public void PlayerTestBlankString() {
        Player p2 = new Player("");
        System.out.println(p2);
    }
}
