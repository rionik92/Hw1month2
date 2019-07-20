package com.company;

public class Shelter {
    // Класс Шелтер с полями имя и адрес
    private String name;
    private String address;

    // Конструктор для инициализации полей класса
    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //Гетеры для полей класса
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
