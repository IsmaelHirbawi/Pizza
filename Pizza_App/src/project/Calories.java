/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author loole
 */
public class Calories {
    private double calories;
    private static double sumOfCalories;
    
    public Calories(){
        
    }

    public Calories(float calories) {
        this.calories = calories;
        sumOfCalories += calories;
    }

    public double getCalories() {
        return calories;
    }

   /* public void setCalories(float calories) {
        this.calories = calories;
    }*/
    
    public void caloriesSum(double calories){
        this.calories += calories; 
    }
     

    static int dough = 100;
    static int tomatoSouce = 50;
    static int cheese = 80;
    static int pepperoni = 30;
    static int garlic = 20;
    static int blackOlive = 10;
    static int thyme = 15;
    static int tomato = 5;
    static int onion = 7; 
    
}
