package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by DaH4uk on 17.12.2015.
 */
public class Hippodrome
{
    public static Hippodrome game;
    ArrayList<Horse> horses = new ArrayList<>();

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        Horse horse1 = new Horse("Catalina", 3, 0);
        Horse horse2 = new Horse("Stamina", 3, 0);
        Horse horse3 = new Horse("Nigga", 3, 0);

        game.horses.add(horse1);
        game.horses.add(horse2);
        game.horses.add(horse3);

        game.run();

        game.printWinner();
    }

    public void run() throws InterruptedException
    {
        for (int i = 0; i < 100; i++)
        {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }
    public void print(){
        for (Horse horse:getHorses())
        {
            horse.print();
        }
        System.out.println();
        System.out.println();
    }

    public Horse getWinner(){
        double dist = 0;
        Horse winner = null;
        for (Horse horse: getHorses())
        {

            if (dist < horse.distance)
            {
                dist = horse.distance;
                winner = horse;
            }

        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


}

