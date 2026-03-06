package org.example.Model.character;
import org.example.Logs;
import org.example.Model.weapon.Weapon;

public class Hero extends Character {

    private String country;
    private Weapon weapon;

    public Hero(String name, int health, String country) {
        super(name, health);
                                        Logs.sendLog(0, "Hero constructor BEFORE Character constructor");
        this.country = country;
                                        Logs.sendLog(1, "Hero constructor");
    }

    public Weapon getWeapon() {
        return weapon;
    }
    
    public void equipWeapon(Weapon weapon) {
                                        Logs.sendLog(0, "Hero equipWeapon method");
        this.weapon = weapon;
                                        Logs.sendLog(1, "Hero equipWeapon method");
    }

    @Override
    public String getName() {
                                        Logs.sendLog(0, "Hero getName method");
                                        Logs.sendLog(1, "Hero getName method AFTER Character getName method");
        return "I'm the hero of " + country + " and my name is " + super.getName();
    }
}
