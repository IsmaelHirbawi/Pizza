/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author loole
 */
public class Cost {
    private double cost;
    private static double sumOfCost;
    
    public Cost(){
        
    }

    public Cost(float cost) {
        this.cost = cost;
        sumOfCost += cost;
    }

    public double getCost() {
        return cost;
    }

    /*public void setCost(float cost) {
        this.cost = cost;
    }*/
    
    public void costSum(double cost){
        this.cost += cost;
    }
}
