/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg417projectmammadliyazar;

import java.util.Scanner;

/**
 *
 * @author Shahla Mammadli(21701343) and Şeyma Yazar(21703784)
 *  
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FacadeMenu menufacade;
        ColdBeverage beverage;
        Scanner choice = new Scanner(System.in);
        String str;
        int menu;
        
        do{
            //print the menu:
            System.out.println("Menu Options:");
            System.out.println("Menu Number 1: Club Sandwich and Lemonade with Mint and Ice.");
            System.out.println("Menu Numper 2: Cheeseburger and Ayran with Double Mint.");
            System.out.println("Menu Numper 3: Club Sandwich and Ayran with Ice.");
            System.out.println("Please enter the menu number to order.");
            System.out.println("Enter 4 to exit.");
            str = choice.nextLine();
            menu = Integer.parseInt(str);
            
            //based on the user menu choice, decorate the beverage and instantiate the facede
            if(menu == 1){
                beverage = new Lemonade();
                beverage = new Mint(beverage);//wrap the lemonade beverage with mint
                beverage = new Ice(beverage); //wrap the beverage with ice
                
                ClubSandwich sandwich = new ClubSandwich();
                menufacade = new FacadeMenu(sandwich, beverage);
                
                //use facade methods to prepare and deliver the order
                menufacade.prepareMenu();
                menufacade.printDesciptions();
                menufacade.changeState(sandwich);
                menufacade.calculateCost();
            }
            if(menu == 2){
                beverage = new Ayran();
                beverage = new Mint(beverage);//wrap the ayran beverage with mint
                beverage = new Mint(beverage);//wrap the beverage with mint again

                Burger burger = new CheeseBurger();
                SandwichAdapter sandwichadapter = new SandwichAdapter(burger);

                //use facade methods to prepare and deliver the order
                menufacade = new FacadeMenu(sandwichadapter, beverage);
                menufacade.prepareMenu();
                menufacade.printDesciptions();
                menufacade.calculateCost();
            }
        
            if(menu ==3){
                beverage = new Ayran();
                beverage = new Ice(beverage); //wrap the ayran beverage with ice
                
                ClubSandwich sandwich = new ClubSandwich();
                menufacade = new FacadeMenu(sandwich, beverage);
                
                 //use facade methods to prepare and deliver the order
                menufacade.prepareMenu();
                menufacade.printDesciptions();
                menufacade.changeState(sandwich);
                menufacade.calculateCost();
            }
            //continue to ask for orders until the user chooses to exit
        }while(menu!=4);
    }
    
}
