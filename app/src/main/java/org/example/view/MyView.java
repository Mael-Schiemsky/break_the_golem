package org.example.view;

import org.example.controller.MyController;

public class MyView {

    private MyController controller;

    public void setController(MyController controller) {
        this.controller = controller;
    }

    public void sendMessage(String message) {
        System.out.println("[" + "\u001B[32m" + "APP" + "\u001B[0m" + "]: " + message);
    }

    public void theHeroEquipsSword() {
        int damage = controller.theHeroEquipsWeapon("sword");
        sendMessage("The Hero equip a sword wich deal " + damage + " damages !");
    }

    public void theHeroEquipsHaxe() {
        int damage = controller.theHeroEquipsWeapon("haxe");
        sendMessage("The Hero equip a haxe wich deal " + damage + " damages !");
    }

    public void theHeroAttacks() {
        int golemHealth = controller.theHeroAttacks();
        sendMessage("The Hero attacks the Golem, and reduce it's health to " + golemHealth + " !");

        if(golemHealth <= 0){
            victory();
        }
    }

    public void endTurn() {
        int heroHealth = controller.theGolemAttacks();
        sendMessage("The Golem attacks the Hero, and reduce he's health to " + heroHealth + " !");
        controller.theGolemRegenerates();

        if(heroHealth <= 0){
            defeat();
        }
    }
    
    public void defeat() {
        sendMessage("The Golem Killed the hero !!!");
    }

    public void victory() {
        sendMessage(controller.getHeroName() + ", i killed this Golem !!!");
    }

    public void init(){
        sendMessage("An hero found a very bad golem around a forest");
        sendMessage("It's time to break it !");
    }
}
