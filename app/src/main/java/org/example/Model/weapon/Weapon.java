package org.example.Model.weapon;

import org.example.Logs;

public class Weapon {

    private int damage;
    private String name;

    public Weapon(String name, int damage) {
                                        Logs.sendLog(0, "Weapon constructor");
        this.name = name;
        this.damage = damage;
                            Logs.sendLog(1, "Weapon constructor");
    }

    public int getDamage() {
                            Logs.sendLog(0, "Weapon getDamage method");
                            Logs.sendLog(1, "Weapon getDamage method");
        return damage;
    }

    public String getName() {
                            Logs.sendLog(0, "Weapon getName method");
                            Logs.sendLog(1, "Weapon getName method");
        return name;
    }
    
}