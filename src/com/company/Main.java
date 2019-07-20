package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        Dog dog2 = new Dog("Sharic", "Shpic", Color.WHITE,
                new Shelter("petWorld", "NewYork"));

        Dog dog3 = new Dog("Bobic", "Alabay", Color.WHITE,
                new Shelter("petWorld", "NewYork"), "Sit");


        System.out.println(dog2.getInfo());
        System.out.println(dog3.getInfo());
        dog1.makeVoice();
        dog2.makeVoice(3);
        dog3.makeVoice("Gav");


    }
}
