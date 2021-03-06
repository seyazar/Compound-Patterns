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
public class HotSandwich implements State{
     private ClubSandwich sandwich;
    
    public HotSandwich(ClubSandwich sandwich){//this reference is used to change state
        this.sandwich = sandwich;
    }

    @Override
    public void getColdSandwich() {//frozes the sandwich
        sandwich.setState(sandwich.getColdState());
        System.out.println("Sandwich is cold.");
    }

    @Override
    public void getHotSandwich() { //cannot perform in this state
       System.out.println("The sandwich is already hot.");
    }
}
