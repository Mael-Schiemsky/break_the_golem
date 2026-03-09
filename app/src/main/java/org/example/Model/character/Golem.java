package org.example.Model.character;

public class Golem extends Monster {

    public Golem() {
        super("Golem", 6);
    }

    @Override
    public String getName() {
        return "Golem";
    }

    public void takeDamage(){
        health -= 1;
    }
}
