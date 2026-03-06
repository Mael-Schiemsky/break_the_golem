package org.example.controller;

import org.example.Logs;
import org.example.Model.character.Golem;
import org.example.Model.character.Hero;
import org.example.Model.weapon.Weapon;

public class MyController {
    private Golem golem;
    private Hero hero;

    public MyController(Golem golem) {
                                        Logs.sendLog(0, "MyController constructor");
        this.golem = golem;
                                        Logs.sendLog(1, "MyController constructor");
    }

    public void setHero() {
                                        Logs.sendLog(0, "MyController setHero method");
        this.hero = newHero();
                                        Logs.sendLog(1, "MyController setHero method");
    }

    private Hero newHero() {
                                        Logs.sendLog(0, "MyController newHero method");
                                        Logs.sendLog(1, "MyController newHero method AFTER Hero constructor");
        return new Hero("Arthur", 50, "Dragrice");
    }

    public void theHeroEquipsSword() {
                                        Logs.sendLog(0, "MyController theHeroEquipsSword method");
        hero.equipWeapon(new Weapon("Sword", 4));
                                        Logs.sendLog(1, "MyController theHeroEquipsSword method");
    }

    public void theHeroAttacks() {
                                        Logs.sendLog(0, "MyController theHeroAttacks method");
        System.out.println("[" + "\u001B[32m" + "APP" + "\u001B[0m" + "]: " + golem.getName());

        golem.takeDamage(5);
        golem.takeDamage();

        System.out.println("[" + "\u001B[32m" + "APP" + "\u001B[0m" + "]: " + golem.getHealth());
                                        Logs.sendLog(1, "MyController theHeroAttacks method");
    }

    public String getHeroName() {
                                        Logs.sendLog(0, "MyController getHeroName method");
                                        Logs.sendLog(1, "MyController getHeroName method AFTER Hero getName method");
        return hero.getName();
    }
}
