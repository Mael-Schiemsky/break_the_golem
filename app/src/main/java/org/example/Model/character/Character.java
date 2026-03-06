package org.example.Model.character;

import org.example.Logs;

public abstract class Character {
    private String name;
    protected int health;

    public Character(String name, int health) {
                            Logs.sendLog(0, "Character constructor");
        this.name = name;
        this.health = health;
                            Logs.sendLog(1, "Character constructor");
    }

    public int getHealth() {
                            Logs.sendLog(0, "Character getHealth method");
                            Logs.sendLog(1, "Character getHealth method");
        return health;
    }

    public String getName() {
                            Logs.sendLog(0, "Character getName method");
                            Logs.sendLog(1, "Character getName method");
        return name;
    }
}
