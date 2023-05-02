package com.bridgelabz;

public class SnakeLadder {
    public static int position=0;
    
    public static int rollDie(){
        int randomCheck=(int)(Math.random()*6);

        return randomCheck+1;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake & Ladder");
        System.out.println("Player : 웃 at " +position+" position");         
        System.out.println("Got number after player rolls the die:"+rollDie());

    }
}
