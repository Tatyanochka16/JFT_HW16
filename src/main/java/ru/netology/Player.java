package ru.netology;

import java.util.Objects;

public class Player {
    private int id;
    private String name;
    private int strength;

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, strength);
//    }
//    @Override
//    public int compareTo(Player o) {
//        if (this.strength < o.strength) {
//            return 1;
//        } else if (this.strength > o.strength) {
//            return 2;
//        } else {
//            return 0;
//        }
//    }
//}
