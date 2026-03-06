package org.example.Model.character;

import org.example.Logs;

public class Monster extends Character {

    public Monster(String name, int health) {
        super(name, health);
                                        Logs.sendLog(0, "Monster constructor BEFORE Character constructor");
                                        Logs.sendLog(1, "Monster constructor");
    }

    public void takeDamage(int damage) {
                                        Logs.sendLog(0, "Monster takeDamage method");
        health -= damage;
                                        Logs.sendLog(1, "Monster takeDamage method");
    }
}
