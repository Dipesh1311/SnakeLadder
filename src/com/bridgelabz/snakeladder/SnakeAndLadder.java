package com.bridgelabz.snakeladder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int player1 = 0;
        int Roll_Die;
        System.out.println("Player1 at " +player1+ " position");
        Random a = new Random();
        Roll_Die = a.nextInt(6) + 1;
        System.out.println(Roll_Die);
    }
}
