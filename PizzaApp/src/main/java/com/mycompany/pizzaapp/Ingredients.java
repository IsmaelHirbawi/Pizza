/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;

//import java.util.ArrayList;

/**
 *
 * @author loole
 */
public class Ingredients extends Pizza{
    
   // ArrayList<Ingredients> ingredients = new ArrayList<>();
    private String name;
    private double weight;
    private Calories calories;
    private Cost cost;
    
    public Ingredients(){
        
    }

    public Ingredients(String name, double weight, Calories calories, Cost cost) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
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

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }
    
    
    @Override
    public String getInfo() {
        return "The " + name + " ,His weight is : " + weight + " ,calories : " + calories.getCalories() +" ,And the cost is : " + cost.getCost();  // return the parameteres in the class as a string 
    }
    
}
