package org.example.Model.character;

public class Monster extends Character {

    private int strength;

    public Monster(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        strength += 1;
    }

    @Override
    public int attack() {
        return strength;
    }
}
