package com.ecosystem;

public class Animal {
    String name;
    String family;
    String species;
    String e_level;
    String habitat;
    int age;

    public Animal(String name, String family, String species, int age, String e_level, String habitat){
        this.name = name;
        this.family = family;
        this.species = species;
        this.age = age;
        this.e_level = e_level;
        this.habitat = habitat;
    }

    Animal(){

    }

    public String get_details(){
        return "Name : " + this.name + "\nSpecies : " + this.species + "\nHabitat : "+ this.habitat;
    }
}


