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
    
    public Pan(){
        
    }

    public Pan(String typeOfPan) {
        this.typeOfPan = typeOfPan;
    }

    public String getTypeOfPan() {
        return typeOfPan;
    }

    public void setTypeOfPan(String typeOfPan) {
        this.typeOfPan = typeOfPan;
    }

    @Override
    public String getInfo() {
        return "The type of the pan is : " + typeOfPan;
    }
    
    
}
