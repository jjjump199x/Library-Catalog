/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycatalog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 1styrGroupB
 */
public class App {

    Scanner input = new Scanner(System.in);
    ArrayList<CatalogCard> cat = new ArrayList<>();

    // Choice for Menu
    public String Choice() {
        String choice = input.nextLine();
        return choice;
    }

    // Add
    public void addCard() {
        CatalogCard card = new CatalogCard(); // Initializing card

        System.out.print("Card ID: ");
        card.setCardID(input.nextLine());
        // String cardID = input.nextLine();
        System.out.print("Book Title: ");
        card.setBookTitle(input.nextLine());
        // String bookTitle = input.nextLine();
        System.out.print("Book Author: ");
        card.setBookAuthor(input.nextLine());
        // String bookAuthor = input.nextLine();
        System.out.print("Year Publish: ");
        card.setYearPublished(input.nextLine());
        // String yearPublished = input.nextLine();
        System.out.print("Publisher: ");
        card.setPublisher(input.nextLine());
        // String publisher = input.nextLine();

        cat.add(card); // Saving the card created
    }

    // Edit
    public void editCard() {
        if (cat.isEmpty()) {
            System.out.println("No card to be edited! Add card first.");
        } else {
            System.out.print("Enter card ID: ");
            String id = input.nextLine();

            for (int i = 0; i < cat.size(); i++) {
                if (id.equals(cat.get(i).getCardID())) {
                    System.out.print("Input new card ID: ");
                    cat.get(i).setCardID(input.nextLine());
                    System.out.print("Input new book title: ");
                    cat.get(i).setBookTitle(input.nextLine());
                    System.out.print("Input new book author: ");
                    cat.get(i).setBookAuthor(input.nextLine());
                    System.out.print("Input new year publish: ");
                    cat.get(i).setYearPublished(input.nextLine());
                    System.out.print("Input new publisher: ");
                    cat.get(i).setPublisher(input.nextLine());
                    break;
                } else {
                    System.out.println("ID NOT FOUND!");
                }
            }
        }
    }

    // Remove
    public void removeCard() {
        if (cat.isEmpty()) {
            System.out.println("No card in the list. Add card first!");
        } else {
            System.out.print("Enter card ID: ");
            String id = input.nextLine();

            for (int i = 0; i < cat.size(); i++) {
                if (id.equals(cat.get(i).getCardID())) {
                    cat.remove(cat.get(i));
                    System.out.println("Card deleted successfully!");
                    break;
                } else {
                    System.out.println("ID NOT FOUND!");
                }
            }
        }
    }

    // View
    public void viewCard() {
        if (cat.isEmpty()) {
            System.out.println("No card to be viewed! Add card first.");
        } else {
            System.out.println("1 - View By ID\n2 - View All");
            System.out.print("Choice: ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter card ID: ");
                String id = input.nextLine();
                String message = "";

                for (int i = 0; i < cat.size(); i++) {
                    if (id.equals(cat.get(i).getCardID())) {
                        message = "LIBRARY CATALOG INFORMATION\nCard ID: " + cat.get(i).getCardID() + "\nBook Title: "
                                + cat.get(i).getBookTitle() + "\nBook Author: " + cat.get(i).getBookAuthor() + "\nYear Published: "
                                + cat.get(i).getYearPublished() + "\nPublisher: " + cat.get(i).getPublisher();
                        break;
                    } else {
                        message = "ID NOT FOUND!";
                    }
                }
                System.out.println(message);
            } else if (choice.equals("2")) {
                Collections.sort(cat);
                System.out.println("LIBRARY CATALOG INFORMATION");
                
                for (int i = 0; i < cat.size(); i++) {
                    System.out.println("---------------------------\nCard ID: " + cat.get(i).getCardID() + "\nBook Title: "
                                + cat.get(i).getBookTitle() + "\nBook Author: " + cat.get(i).getBookAuthor() + "\nYear Published: "
                                + cat.get(i).getYearPublished() + "\nPublisher: " + cat.get(i).getPublisher());
                }
            } else {
                System.out.println("ID NOT FOUND!");
            }
        }
    }
}
