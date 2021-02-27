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
public abstract class ColdBeverage {
    protected String description = "Unknown Cold Beverage";
    
    //all concrete beverages will iplement cost method
    public abstract double cost();
    
    //template method
    public final void prepareColdBeverage()  {
       pourWater();
       System.out.println(addIngredients());
       pourInCup();
   }
    //same for all beverages
    public void pourWater(){
       System.out.println("Pour water.");
   }
   //same for all beverages
    public void pourInCup(){
       System.out.println("Pour into cup.");
   }
   //different for different beverages, every beverage will implement its own method
    public abstract String addIngredients();
    
    public String getDescription(){
        return this.description;
    }
}
