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
public class Mint extends BeverageDecorator {
      private ColdBeverage coldBeverage;
    
    public Mint(ColdBeverage cb){
        this.coldBeverage = cb;
    }
    
     //add the decorator description to the beverage
    @Override
    public String getDescription() {
         return coldBeverage.getDescription() + " Mint";
    }

     //add the decorator cost to the beverage
    @Override
    public double cost() {
        return coldBeverage.cost() + 5.00;
    }

     //add the decorator description to the preparation steps
    @Override
    public String addIngredients() {
        return coldBeverage.addIngredients() + " add Mint";
    }
    
    
}
