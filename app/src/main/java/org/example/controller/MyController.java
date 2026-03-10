package org.example.controller;

import org.example.Model.character.Golem;
import org.example.Model.character.Hero;
import org.example.Model.weapon.Weapon;

public class MyController {
    private Golem golem;
    private Hero hero;

    public MyController(Golem golem) {
        this.golem = golem;
    }

    public void setHero() {
        this.hero = newHero();
    }

    private Hero newHero() {
        return new Hero("Arthur", 50, "Dragrice");
    }

    public void theHeroEquipsSword() {
        hero.equipWeapon(new Weapon("Sword", 4));
    }

    public void theHeroAttacks() {
        System.out.println("[" + "\u001B[32m" + "APP" + "\u001B[0m" + "]: " + golem.getName());

        golem.takeDamage(5);
        golem.takeDamage();

        System.out.println("[" + "\u001B[32m" + "APP" + "\u001B[0m" + "]: " + golem.getHealth());
    }

    public String getHeroName() {
        return hero.getName();
    }
}
