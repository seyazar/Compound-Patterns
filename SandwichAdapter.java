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
public class SandwichAdapter implements Sandwich {
    private Burger burger;
    
    public SandwichAdapter(Burger burger){
        this.burger = burger;
    }
    
    //transition methods between clubsanwich and cheeseburger:
    
    @Override
    public void useToastBread() {
        burger.addBurgerBread();
    }

    @Override
    public void addChicken() { 
        burger.addMeat();
    }

    @Override
    public double cost() {
       return  burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDesctiption();
    }
    
}
