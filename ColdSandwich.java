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
public class ColdSandwich implements State{
    
    private ClubSandwich sandwich;
    
    public ColdSandwich(ClubSandwich sandwich){//this reference is used to change state
        this.sandwich = sandwich;
    }

    @Override
    public void getColdSandwich() {//cannot perform on this state
        System.out.println("Sandwich is already cold.");
    }

    @Override
    public void getHotSandwich() {//warms the sandwich
        sandwich.setState(sandwich.getHotState());
        System.out.println("Sandwich is heated.\n");
    }
}
