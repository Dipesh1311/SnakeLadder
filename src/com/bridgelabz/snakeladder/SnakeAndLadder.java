package com.bridgelabz.snakeladder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int player1 = 0;
        int Roll_Dice;
        int check;
        final int No_Play = 0;
        final int Ladder = 1;
        final int Snake = 2;
        int position = 0;

        System.out.println("Player1 at " +player1+ " position");
        Random a = new Random();
        Roll_Dice = a.nextInt(6) + 1;
        System.out.println(Roll_Dice);
        check = a.nextInt(3);
        System.out.println(check);

        switch (check) {

            case   No_Play:
                System.out.println("NOPLAY");
                System.out.println("Position of player : " + position);
                System.out.println("----------------------");
                break;
            case Ladder:
                System.out.println("############## Climb up the ladder ############");
                position += Roll_Dice;
                System.out.println("Position of the  Player = " + position);
                System.out.println("----------------------");
                break;
            case Snake:
                System.out.println("~~~~~~~~~~~~~~~~ Swallowed by snake ~~~~~~~~~~~~");
                position = position + Roll_Dice;
                System.out.println("Position of the  Player = " + position);
                System.out.println("----------------------");
                break;

            default:
                break;
        }
    }
}
