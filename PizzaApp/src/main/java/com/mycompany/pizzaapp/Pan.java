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
    private Cost cost;
    
    public Pan(){
        
    }

    public Pan(String typeOfPan, Cost cost) {
        this.typeOfPan = typeOfPan;
        this.cost = cost;
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
        return "The type of the pan is : " + typeOfPan + " ,Cost : " + cost.getCost();
    }
    
    
}
