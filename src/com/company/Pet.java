package com.company;

import java.util.Random;

public class Pet {

    private int age;
    private Color color;
    private Shelter shelter;

    public Pet(int age, Color color, Shelter shelter) {
        this.age = this.generateDefaultAge();
        this.color = color;
        this.shelter = shelter;
    }

    public Pet() {
    }


    //создали метод и инициализировали поле age
    private int generateDefaultAge() {
        return new Random().nextInt(100);
    }

    // создать метод который будет возвращать всю информацию по полям
    public final String getInfo() {
        return "Питомец {" +
                "возраст=" + getAge() +
                ", приют=" + getShelter().getName() + " " + getShelter().getAddress() +
                ", цвет=" + getColor() +
                "}";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}


