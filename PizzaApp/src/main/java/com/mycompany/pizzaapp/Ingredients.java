/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;

import java.util.ArrayList;

/**
 *
 * @author loole
 */
public class Ingredients extends Pizza{
    
    ArrayList<Ingredients> ingredients = new ArrayList<>();
    private String name;
    private float weight;
    private Calories calories;
    
    public Ingredients(){
        
    }

    public Ingredients(String name, float weight, Calories calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Calories getCalories() {
        return calories;
    }

    public void setCalories(Calories calories) {
        this.calories = calories;
    }
    
    
    

    @Override
    public String getInfo() {
        return name + " " + weight + " " + calories;  // return the parameteres in the class as a string 
    }
    
}
