package librarycatalog;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1styrGroupB
 */
public class main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        App app = new App();
        
        
        
        while (true){
            System.out.println("Card Catalog Options\n1 - Add Catalog Card\n2 - Edit Catalog Card\n3 - Remove Catalog Card\n4 - View Catalog Card");
            System.out.print("Choice: ");
            
            // Menu
            switch (app.Choice()){
                case "1": //Add
                    app.addCard();
                    break;
                case "2": //Edit
                    app.editCard();
                    break;
                case "3": //Remove
                    app.removeCard();
                    break;
                case "4": //View
                    app.viewCard();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.print("\n");
        }
    }
}
