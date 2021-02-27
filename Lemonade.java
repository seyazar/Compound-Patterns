/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg417projectmammadliyazar;

/**
 *
 * @author Shahla
 */
public class Lemonade extends ColdBeverage {

    public Lemonade(){
        description = "Lemonade";
    }
    
    //Lemonade's implementation of the addIngredients method
    @Override
    public String addIngredients() {
        return "Add lemon juice and sugar to the water ";
    }

    @Override
    public double cost() {
        return 20.90;
    }
}
