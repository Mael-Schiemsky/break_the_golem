package org.example.Model.character;
import org.example.Model.weapon.Weapon;

public class Hero extends Character {

    private String country;
    private Weapon weapon;

    public Hero(String name, int health, String country) {
        super(name, health);
        this.country = country;
    }

    public String getName() {
        return "I'm the hero of " + country + " and my name is " + super.getName();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public int attack() {
        if (weapon != null) {
            return weapon.getDamage();
        }
        return 0;
    }
}
