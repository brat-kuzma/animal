package com.company;

import java.awt.*;

class Animal {
    String color;
    boolean tail;
    String nick;
   public Animal(){}
    public Animal(String color, boolean tail, String nick) {
        this.color = color;
        this.tail = tail;
        this.nick = nick;
    }

    @Override
    public String toString(){
        return nick;
    }
}
class Cat extends Animal {
    boolean sapogi;
    public Cat(String color, boolean tail, String nick, boolean sapogi){
        super(color, tail, nick);
        this.sapogi = sapogi;
    }
}
class Dog extends Animal {
    boolean kost;
    public Dog(boolean kost) {
        this.kost = kost;
    }
}
public class Main {
    public static void main(String[] args) {
        Cat bonic = new Cat("Red", true, "Bonic", false);
        Dog sonya = new Dog(true);
        System.out.println(bonic);
        System.out.println(sonya);
    }
}