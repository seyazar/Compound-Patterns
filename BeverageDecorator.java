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
public abstract class BeverageDecorator extends ColdBeverage {
    
    //every concrete decorator will have to implement this method so that we can also know the decorators of the beverage
    public abstract String getDescription();


}
