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
public class Ayran extends ColdBeverage {

    public Ayran(){
        description = "Ayran";
    }
    
    //ayran's implementation of the addIngredients method
    @Override
    public String addIngredients() {
        return "Add yogurt to water";
    }

    @Override
    public double cost() {
        return 15.90;
    }
    
}
