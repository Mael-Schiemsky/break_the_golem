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

    public void init(){
        sendMessage("O no, an horrible Golem is in the forest !! We need a hero !");
    }

    public void aNewHeroCome(){
        controller.setHero();
        sendMessage("The Hero Arthur comes !");
    }

    public void theHeroEquipsSword() {
        controller.theHeroEquipsSword();
        sendMessage("The Hero equip is sword !");
    }

    public void theHeroAttacks() {
        controller.theHeroAttacks();
        sendMessage("The Hero deal a huge blow to the Golem !");
    }

    public void victory() {
        sendMessage(controller.getHeroName() + ", i killed this Golem !!!");
    }
}
