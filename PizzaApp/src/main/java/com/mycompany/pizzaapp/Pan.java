/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;

/**
 *
 * @author loole
 */
public class Pan extends Pizza{
    private String typeOfPan;
    private Calories calories;
    private Cost cost;
    
    public Pan(){
        
    }

    public Pan(String typeOfPan, Calories calories, Cost cost) {
        this.typeOfPan = typeOfPan;
        this.calories = calories;
        this.cost = cost;
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

    public String getTypeOfPan() {
        return typeOfPan;
    }

    public void setTypeOfPan(String typeOfPan) {
        this.typeOfPan = typeOfPan;
    }

    @Override
    public String getInfo() {
        return "The type of the pan is : " + typeOfPan + ",Calories : " + calories.getCalories() + " ,Cost : " + cost.getCost();
    }
    
    
}
