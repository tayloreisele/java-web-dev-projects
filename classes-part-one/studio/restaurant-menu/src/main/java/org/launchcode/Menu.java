package org.launchcode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDateTime lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDateTime lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    // Methods

    public void addItem(MenuItem item) {
        if (!items.contains(item)) {
            items.add(item);
            updateLastUpdated();
        }
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
        updateLastUpdated();
    }

    private void updateLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
    }

    public String displayMenu() {
        String menuString = "";
        for (MenuItem item : items) {
            menuString += item.displayItem() + "\n";
        }
        return menuString;
    }

    public MenuItem findItem(String name) {
        for (MenuItem item : items) {
            if (item.getDescription().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
