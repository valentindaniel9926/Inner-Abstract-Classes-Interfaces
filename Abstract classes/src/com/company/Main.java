package com.company;


public class Main {

    public static void main(String[] args) {
    Dog dog = new Dog("Jackie");
    dog.breath();
    dog.eat();
    Paroot paroot = new Paroot("Parrot");
    paroot.breath();
    paroot.eat();
    paroot.fly();
    Penguin penguin = new Penguin("Emperor");
    penguin.fly();
    }
}
