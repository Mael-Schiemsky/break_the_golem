package org.example;

public class Logs {
    static boolean isEnabled = false;

    public static void enable(){
        isEnabled = true;
    }
    
    public static void sendLog(int pos, String message){
        if(isEnabled){
            String inout = pos == 0 ? "\u001B[34m" + "ENTER" + "\u001B[0m" : "\u001B[31m" + "EXIT " + "\u001B[0m";
            System.out.println("[" + "\u001B[35m" + "LOG" + "\u001B[0m" + "]: " + inout + " " + message);
        }
    }
}
