package org.example.controller;

import org.example.Model.character.Golem;
import org.example.Model.character.Hero;
import org.example.Model.weapon.Weapon;
import org.example.view.MyView;

public class MyController {
    private MyView view;
    private Golem golem;
    private Hero hero;

    public MyController(Golem golem, Hero hero) {
        this.golem = golem;
        this.hero = hero;
    }

    public void setView(MyView view) {
        this.view = view;
    }

    public String getHeroName() {
        return hero.getName();
    }

    public int theHeroEquipsWeapon(String name) {
        if(name.equals("sword")){
            return theHeroEquipsSword();
        } else {
            return theHeroEquipsHaxe();
        }
    }

    private int theHeroEquipsSword() {
        hero.equipWeapon(new Weapon("Sword", 4));
        return 4;
    }

    private int theHeroEquipsHaxe() {
        hero.equipWeapon(new Weapon("Haxe", 5));
        return 5;
    }

    public int theHeroAttacks() {
        int damage = hero.attack();
        golem.takeDamage(damage);
        return golem.getHealth();
    }

    public int theGolemAttacks() {
        int damage = golem.attack();
        hero.takeDamage(damage);
        return hero.getHealth();
    }

    public void theGolemRegenerates() {
        golem.regenerate();
        view.sendMessage("The Golem regenerates " + 1 + " health !");
    }
}
