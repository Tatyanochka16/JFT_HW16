package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void shouldShowWinnerFirst() {
        Player player1 = new Player(1, "Pasha", 500);
        Player player2 = new Player(2, "Masha", 550);


        Game fight = new Game();
        fight.register(player1);
        fight.register(player2);


        int expected = 1;
        int actual = fight.round("Masha", "Pasha");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowWinnerBoth() {
        Player player1 = new Player(1, "Pasha", 500);
        Player player2 = new Player(2, "Masha", 500);

        Game fight = new Game();
        fight.register(player1);
        fight.register(player2);


        int expected = 0;
        int actual = fight.round("Pasha", "Masha");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowWinnerSecond() {
        Player player1 = new Player(1, "Pasha", 550);
        Player player2 = new Player(2, "Masha", 500);


        Game fight = new Game();
        fight.register(player1);
        fight.register(player2);


        int expected = 2;
        int actual = fight.round("Masha", "Pasha");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotReg1() {
        Player player1 = new Player(1, "Pasha", 500);
        Player player2 = new Player(2, "Masha", 550);


        Game fight = new Game();
        fight.register(player1);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            fight.round("Masha", "Pasha");
        });
    }

    @Test
    public void shouldShowNotReg2() {
        Player player1 = new Player(1, "Pasha", 500);
        Player player2 = new Player(2, "Masha", 550);


        Game fight = new Game();
        fight.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            fight.round("Masha", "Pasha");
        });
    }

}
