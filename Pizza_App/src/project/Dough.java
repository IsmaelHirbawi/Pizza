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
    
    public Dough(){
        
    }

    public Dough(String sizeOfDough, String typeOfDough) {
        this.sizeOfDough = sizeOfDough;
        this.typeOfDough = typeOfDough;
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
    
    @Override
    public String getInfo(){
        return "The type of dough is : " + typeOfDough + " ,His size : " + sizeOfDough;
    }
}
