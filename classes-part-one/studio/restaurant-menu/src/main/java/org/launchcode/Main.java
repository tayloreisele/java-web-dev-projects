package org.launchcode;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MenuItem pasta = new MenuItem(19.99, "Pasta", "Main Course", true);
        MenuItem cake = new MenuItem(9.99, "Cake", "Dessert", false);
        MenuItem steak = new MenuItem(29.99, "Steak", "Main Course", false);
        MenuItem soup = new MenuItem(5.99, "Soup", "Appetizer", true);

        ArrayList<MenuItem> initialItems = new ArrayList<>();
        Menu resturantMenu = new Menu(LocalDateTime.now(), initialItems);

        resturantMenu.addItem(pasta);
        resturantMenu.addItem(cake);
        resturantMenu.addItem(steak);
        resturantMenu.addItem(soup);

        resturantMenu.removeItem(pasta);

        System.out.println("Printing the entire menu:");
        System.out.println(resturantMenu.displayMenu());
        System.out.println(pasta.displayItem());


    }
}

