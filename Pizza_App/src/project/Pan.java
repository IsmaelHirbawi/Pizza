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
    private int sizeOfPan;
    
    public Pan(){
        
    }

    public Pan(String typeOfPan, int sizeOfPan) {
        this.typeOfPan = typeOfPan;
        this.sizeOfPan = sizeOfPan;
    }

    public int getSizeOfPan() {
        return sizeOfPan;
    }

    public void setSizeOfPan(int sizeOfPan) {
        this.sizeOfPan = sizeOfPan;
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
