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
    
    static Boolean checkIngredients(String pizzaName , String pizzaSize){
        switch(pizzaName){
            case "chicage" -> {
                if(Quantity.dough >= 3 && Quantity.cheese >= 80 && Quantity.tomatoSouce >= 50){
                    if("Big".equals(pizzaSize) && Quantity.deepDishBig > 0)
                        flag = true;
                    else if("small".equals(pizzaSize) && Quantity.deepDishSmall > 0)
                        flag = true;
                }
                return flag;
            }

            case "detroit" -> {
                if(Quantity.dough >= 2 && Quantity.cheese >= 80 && Quantity.pepperoni >= 12 && Quantity.tomatoSouce >= 20 && Quantity.garlic >= 3){
                     if("Big".equals(pizzaSize) && Quantity.rectangleDishBig > 0)
                        flag = true;
                    else if("small".equals(pizzaSize) && Quantity.rectangleDishSmall > 0)
                        flag = true;
                }
                return flag;
            }

            case "greek" -> { 
                if(Quantity.dough >= 2 && Quantity.cheese >= 25 && Quantity.blackOlive >= 30 && Quantity.onion >= 5){
                    if("Big".equals(pizzaSize) && Quantity.panBig > 0)
                        flag = true;
                    else if("small".equals(pizzaSize) && Quantity.panSmall > 0)
                        flag = true;
                }
                return flag;
            }

            case "neapolitan" -> {
                if(Quantity.dough >= 3 && Quantity.cheese >= 100 && Quantity.tomatoSouce >= 20)
                {
                    if("Big".equals(pizzaSize) && Quantity.panBig > 0)
                        flag = true;
                    else if("small".equals(pizzaSize) && Quantity.panSmall > 0)
                        flag = true;
                }
                return flag;
            }
            case "newyork" -> {
                if(Quantity.dough >= 5 && Quantity.thyme >= 30 && Quantity.tomato >= 2)
                    {
                    if("Big".equals(pizzaSize) && Quantity.panBig > 0)
                        flag = true;
                    else if("small".equals(pizzaSize) && Quantity.panSmall > 0)
                        flag = true;
                }
                return flag;
            }

            case "sicilian" -> {
                if(Quantity.dough >= 4 && Quantity.onion >= 5 && Quantity.tomato >= 5)
                {
                    if("Big".equals(pizzaSize) && Quantity.rectangleDishBig > 0)
                        flag = true;
                    else if("small".equals(pizzaSize) && Quantity.rectangleDishSmall > 0)
                        flag = true;
                }
                return flag;
            }

            case "vegetable" -> {
                if(Quantity.dough >= 3 && Quantity.cheese >= 50 && Quantity.tomatoSouce >= 30 && Quantity.tomato >= 6 && Quantity.blackOlive >= 30)
                    {
                    if("Big".equals(pizzaSize) && Quantity.panBig > 0)
                        flag = true;
                    else if("small".equals(pizzaSize) && Quantity.panSmall > 0)
                        flag = true;
                }
                return flag;
            }
            default -> flag = false;
        }
        return flag;
    }
}
