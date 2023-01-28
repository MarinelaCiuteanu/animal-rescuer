package org.example;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.name = "Gray";
        animal.age = 1;
        animal.favoriteFood = new AnimalFood();
        animal.favoriteFood.name = "wiskas";
        animal.favoriteFood.expirationDate = new Date(2024, 6,4);
        animal.favoriteFood.price = 10.5;
        animal.favoriteFood.quantity = 5;
        animal.favoriteFood.inStock = true;
        animal.hungerLvl = 3;
        animal.healthLvl = 7;
        animal.favoriteActivity = new Activity();
        animal.favoriteActivity.name = "run";
        Adopter adopter = new Adopter();
        adopter.name = "Gheorghita";
        adopter.money = 250;
        Game game = new Game();
        game.adopter = adopter;
        game.animal = animal;
        game.veterinarian = new Veterinarian();
        game.veterinarian.name = "Stefan Cel Mare";
        game.veterinarian.speciality = "Crocobaur";
    }
}
