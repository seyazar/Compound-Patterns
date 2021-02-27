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
public class CheeseBurger implements Burger {

    private String description;
    
    public CheeseBurger(){
        this.description = "CheeseBurger";
    }
    @Override
    public void addBurgerBread() {//different than the addToastBread of ClubSandwich
        System.out.println("Add burger bread.");
    }

    @Override
    public void addMeat() { //different than the addToastBread of ClubSandwi
        System.out.println("Add red meat.");
    }

    @Override
    public double cost() {
        return 40.9;
    }

    @Override
    public String getDesctiption() {
        return this.description;
    }
    
}
