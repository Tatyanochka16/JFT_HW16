package ru.netology;

import java.util.*;

public class Game {
    private List<Player> nameList = new ArrayList<>();

    public void register(Player player) {
        nameList.add(player);
    }


    public int round(String playerName1, String playerName2) {
        Player player1 = null;
        Player player2 = null;
        for (Player player : nameList) {
            if (player.getName().equals(playerName1)) {
                player1 = player;
            }
            if (player.getName().equals(playerName2)) {
                player2 = player;
            }
        }
        if (player1 == null) {
            throw new NotRegisteredException(
                    "Player " + playerName1 + "is not registered"
            );
        }
        if (player2 == null) {
            throw new NotRegisteredException(
                    "Player " + playerName2 + "is not registered"
            );
        }
        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }
        if (player2.getStrength() > player1.getStrength()) {
            return 2;
        } else {
            return 0;
        }
    }
}


