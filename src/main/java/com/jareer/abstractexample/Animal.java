package com.jareer.abstractexample;

public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name=name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
