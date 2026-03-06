package org.example.Model.weapon;

public class Weapon {

    private int damage;
    private String name;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
    
}