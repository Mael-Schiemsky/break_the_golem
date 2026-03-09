package org.example.controller;

import org.example.Model.character.Golem;
import org.example.Model.character.Hero;
import org.example.Model.weapon.Weapon;
import org.example.view.MyView;

public class MyController {
    private MyView view;
    private Golem golem;
    private Hero hero;

    public MyController(Golem golem) {
        this.golem = golem;
    }

    public void setView(MyView view) {
        this.view = view;
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
        view.sendMessage(golem.getName());

        golem.takeDamage(5);
        golem.takeDamage();

        view.sendMessage("" + golem.getHealth());
    }

    public String getHeroName() {
        return hero.getName();
    }
}
