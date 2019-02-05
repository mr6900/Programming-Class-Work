package com.company;


import javax.swing.*;
import java.util.Scanner;

public class Weapons {
    //set values that have to be set for each weapon
    private static int Damage;
    private static int Value;
    private static int itemID;
    private static String itemName;
    private static int attackSpeed;

    public Weapons(){
        Damage = 0;
        Value = 0;
        attackSpeed = 0;
        itemID = 0;
        itemName = "";
    }

    public int WoodSword(){
        Damage = 2;
        Value = 1;
        attackSpeed = 2;
        itemID = 1;
        itemName = "Wood Sword";
        return itemID;
    }
    public int IronSword(){
        Damage = 4;
        Value = 2;
        attackSpeed = 3;
        itemID = 2;
        itemName = "Iron Sword";
        return itemID;
    }
    //getters
    public int getAttackSpeed() {return attackSpeed;}

    public int getDamage() {return Damage;}

    public int getValue() {return Value;}

    public int getItemID() {return itemID;}

    public String Equip (){
        Scanner kboard = new Scanner(System.in);
        String YN = "";
        return YN;
    }
}
