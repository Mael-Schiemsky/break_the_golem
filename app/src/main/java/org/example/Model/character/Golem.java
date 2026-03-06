package org.example.Model.character;

public class Golem extends Monster {

    public Golem() {
        super("Golem", 5, 5);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage-2);
    }

    public void regenerate() {
        health += 1;
    }
}
