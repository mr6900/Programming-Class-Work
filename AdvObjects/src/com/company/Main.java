package com.company;

public class Main {

    public static void main(String[] args) {
    /*what i was asked to do in this code was to make a simple little game that i had to peace together with the given
    objects and functions and look at each one to see where and how i needed to implement them and it also asks me to call
    them and use functions inside of loops and if else statements. The player should be prompted to do one of three things
    (attack, heal, or look at their stats) then if dead be shown what level they were and how much xp they had in the end.
    */

    StartScreen start = new StartScreen();



        //generate a new player
        Player player = new Player();
        Weapons weapons = new Weapons();
        //create main game loop that continues until the player has no health
        // as long as the players health is greater than 0 this loop will run
        while (player.getHealth() > 0){

            //generate a new enemy( the level of the enemy should be the player's level)
            Enemy enemy = new Enemy(player.getPlayerLevel());

            //create battle loop that should continue while both the player and enemy are alive
            while (player.getHealth() > 0 && enemy.getHealth() > 0){
                //gets player's input on what to do (use one of the methods to do this)
                player.menu(enemy);

                //has the player take damage
                //tells the program where the player is taking the damage from which would be the enemy
                player.takeDamage(enemy);

                //has the enemy take damage
                //tells the program where the enemy is taking the damage from which would be the player
                enemy.takeDamage(player);

                //once the player is dead print out the player's level and how much xp they had.
                if(player.getHealth() <= 0){
                    System.out.println("This Was Your Level: " + player.getPlayerLevel());
                    System.out.println("This Was How Much XP You Had: " + player.getXp());
                }
                //once reached level 2 you gain a wooden sword
                if (player.getPlayerLevel() == 2){
                    System.out.println("You Have Gained A Wood Sword!!");
                    player.weapon.WoodSword();
                    if (player.getPlayerLevel() == 4){
                        System.out.println("You Have Gained A Iron Sword!!");
                        player.weapon.IronSword();
                    }
                }
            }
        }
    }
}
