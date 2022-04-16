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
public class Mixer extends Pizza{
    private Ingredients ingredients;
    private Pan pan;
    private Dough dough;
    ArrayList<Ingredients> ing = new ArrayList<>();

    public Mixer(Ingredients ingredients, Pan pan, Dough dough) {
        this.ingredients = ingredients;
        this.pan = pan;
        this.dough = dough;
    }
    
    
     

    /*Mixer(ArrayList<Ingredients> ingredient, Pan pan, Dough dough) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    @Override
    public String getInfo() {
        return ingredients.getInfo() + "\n " + pan.getInfo() + "\n " + dough.getInfo();
    }
    
    
}
