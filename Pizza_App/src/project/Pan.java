/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author loole
 */
public class Pan extends Pizza{
    private String typeOfPan;
    private Cost cost;
    private int sizeOfPan;
    
    public Pan(){
        
    }

    public Pan(String typeOfPan, Cost cost, int sizeOfPan) {
        this.typeOfPan = typeOfPan;
        this.cost = cost;
        this.sizeOfPan = sizeOfPan;
    }

    public int getSizeOfPan() {
        return sizeOfPan;
    }

    public void setSizeOfPan(int sizeOfPan) {
        this.sizeOfPan = sizeOfPan;
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
