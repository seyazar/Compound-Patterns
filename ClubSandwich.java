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
public class ClubSandwich implements Sandwich{
    
    private State coldSandwich,
            hotSandwich;
    private State state;
    private String description;
    
    public ClubSandwich(){
        //creare state instances
        coldSandwich = new ColdSandwich(this);
        hotSandwich = new HotSandwich(this);
        this.description = "Club Sandwich";
        state = coldSandwich;//set the default state
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    //getters for states
    public State getColdState(){
        return this.coldSandwich;
    }

    public State getHotState(){
        return this.hotSandwich;
    }
    
    //delegates to the current state
    public void warmSandwich(){
        state.getHotSandwich();
    }
    
    //delegates to the current state
    public void coldSandwich(){
        state.getColdSandwich();
    }
    

    //preparation of club sandwich
    @Override
    public void useToastBread() {
        System.out.println("Toast bread is added.");
    }

    @Override
    public void addChicken() {
        System.out.println("Chicken is added.");
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public double cost(){
        return 35.9;
    }
}
