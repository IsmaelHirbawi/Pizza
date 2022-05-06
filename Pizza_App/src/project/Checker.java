/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author loole
 */
public class Checker {

    static boolean flag = false;
    
    static Boolean checkIngredients(String check){
        switch(check){
            case "chicage" -> {
                if(Quantity.deepDish > 0 && Quantity.dough >= 3 && Quantity.cheese >= 80 && Quantity.tomatoSouce >= 50)
                    flag = true;
                return flag;
            }

            case "detroit" -> {
                if(Quantity.rectangleDish > 0 && Quantity.dough >= 2 && Quantity.cheese >= 80 && Quantity.pepperoni >= 12 && Quantity.tomatoSouce >= 20 && Quantity.garlic >= 3)
                    flag = true;
                return flag;
            }

            case "greek" -> { 
                if(Quantity.pan > 0 && Quantity.dough >= 2 && Quantity.cheese >= 25 && Quantity.blackOlive >= 30 && Quantity.onion >= 5)
                    flag = true;
                return flag;
            }

            case "neapolitan" -> {
                if(Quantity.pan > 0 && Quantity.dough >= 3 && Quantity.cheese >= 100 && Quantity.tomatoSouce >= 20)
                    flag = true;
                return flag;
            }
            case "newyork" -> {
                if(Quantity.pan > 0 && Quantity.dough >= 5 && Quantity.thyme >= 30 && Quantity.tomato >= 2)
                    flag = true;
                return flag;
            }

            case "sicilian" -> {
                if(Quantity.rectangleDish > 0 && Quantity.dough >= 4 && Quantity.onion >= 5 && Quantity.tomato >= 5)
                    flag = true;
                return flag;
            }

            case "vegetable" -> {
                if(Quantity.pan > 0 && Quantity.dough >= 3 && Quantity.cheese >= 50 && Quantity.tomatoSouce >= 30 && Quantity.tomato >= 6 && Quantity.blackOlive >= 30)
                    flag = true;
                return flag;
            }
            default -> flag = false;
        }
        return flag;
    }
}
