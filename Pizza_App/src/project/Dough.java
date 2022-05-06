 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author loole
 */
public class Dough extends Pizza{
    private String sizeOfDough;
    private String typeOfDough;
    private Calories calories;
    private Cost cost;
    
    public Dough(){
        
    }

    public Dough(String sizeOfDough, String typeOfDough, Calories calories, Cost cost) {
        this.sizeOfDough = sizeOfDough;
        this.typeOfDough = typeOfDough;
        this.calories = calories;
        this.cost = cost;
    }

    public String getSizeOfDough() {
        return sizeOfDough;
    }

    public void setSizeOfDough(String sizeOfDough) {
        this.sizeOfDough = sizeOfDough;
    }

    public String getTypeOfDough() {
        return typeOfDough;
    }

    public void setTypeOfDough(String typeOfDough) {
        this.typeOfDough = typeOfDough;
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
    public String getInfo(){
        return "The type of dough is : " + typeOfDough + " ,His size : " + sizeOfDough + " ,calories : " + calories.getCalories() + " ,cost : " + cost.getCost();
    }
}
