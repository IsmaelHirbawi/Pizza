/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pizzaapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

/**
 *
 * @author loole
 */
public class PizzaApp {

    public static void main(String[] args) {
        Ingredients ing = new Ingredients("cheese" ,1,new Calories(10),new Cost(5));
        ArrayList<Ingredients> ingredient = new ArrayList<>();
        ingredient.add(ing);
        ing = new Ingredients("onion" ,2,new Calories(5),new Cost(2));
        ingredient.add(ing);
        
       /* Ingredients [] ingredients = new Ingredients[10];
        
        Ingredients ing = new Ingredients("cheese" ,1,new Calories(10),new Cost(5));
        ingredients[0] = ing;
        ing = new Ingredients("onion" ,2,new Calories(5),new Cost(2));
        ingredients[1] = ing;
        String s = ingredient[0] + " " + ingredient[1];*/
        
        Pan pan = new Pan("deep pan" ,new Cost(25));
        
        Dough dough = new Dough("small" ,"wheet" ,new Calories(10) ,new Cost(15));
        
        //Mixer mixer = new Mixer(s ,pan ,dough);
        Mixer mixer = new Mixer(ing ,pan ,dough);
        
        JOptionPane.showMessageDialog(null, mixer.getInfo());
        
    
    }
}
