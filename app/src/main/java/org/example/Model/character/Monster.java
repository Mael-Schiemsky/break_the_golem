package org.example.Model.character;

public class Monster extends Character {

    public Monster(String name, int health) {
        super(name, health);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
