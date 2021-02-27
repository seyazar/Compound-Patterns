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
public class FacadeMenu {
    //composition:
    private Sandwich sandwich;
    private ColdBeverage beverage; 
    
    public FacadeMenu(Sandwich sandwich, ColdBeverage beverage){
        this.sandwich = sandwich;
        this.beverage = beverage;
    }

    public void prepareMenu(){
        System.out.println("Preperating beverage:");
        beverage.prepareColdBeverage();//template method for the beverage
        System.out.println("\nPrepation meal:");//prepare the sandwich
        sandwich.useToastBread();
        sandwich.addChicken();
    }
    
    //if the meal is clubsandwich it will be heated
    public void changeState(ClubSandwich cs){
        cs.warmSandwich();
    }
    

    public void printDesciptions(){ //print the order description:
        System.out.println("\nOrder Contents:");
        System.out.println(beverage.getDescription());
        System.out.println(sandwich.getDescription()); 
    }
    
    public void calculateCost(){ //calculate the cost of the order:
        System.out.println("Bill Details:");
        double beverageCost = beverage.cost();
        double sandwichCost = sandwich.cost();
        double totalCost = beverageCost + sandwichCost;
        System.out.println("Beverage Cost: "+beverageCost);
        System.out.println("Meal Cost: "+sandwichCost+"\n");
        
        System.out.printf("Total Cost:  %.2f", totalCost);
        System.out.println("\n");
        
    }
}
