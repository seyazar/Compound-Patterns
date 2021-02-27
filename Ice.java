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
public class Ice extends BeverageDecorator{
    private ColdBeverage coldBeverage;
    
    public Ice(ColdBeverage cb){
        this.coldBeverage = cb;
    }
    
    //add the decorator description to the beverage
    @Override
    public String getDescription() {
         return coldBeverage.getDescription() + " Ice";
    }

    //add the decorator cost to the beverage
    @Override
    public double cost() {
        return coldBeverage.cost() + 3.99;
    }

    //add the decorator description to the preparation steps
    @Override
    public String addIngredients() {
        return coldBeverage.addIngredients() + " add Ice";
    }
    
}
