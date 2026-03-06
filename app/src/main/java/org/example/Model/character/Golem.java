package org.example.Model.character;

import org.example.Logs;

public class Golem extends Monster {

    public Golem() {
        super("Golem", 6);
                                        Logs.sendLog(0, "Golem constructor BEFORE Monster constructor");
                                        Logs.sendLog(1, "Golem constructor");
    }

    @Override
    public String getName() {
                                        Logs.sendLog(0, "Golem getName method");
                                        Logs.sendLog(1, "Golem getName method");
        return "Golem";
    }

    public void takeDamage(){
                                        Logs.sendLog(0, "Golem takeDamage method");
        health -= 1;
                                        Logs.sendLog(1, "Golem takeDamage method");
    }
}
