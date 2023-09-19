package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }


    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    // Methods

    public boolean isNew() {
        return isNew;
    }

    public String displayItem() {
        return "Name: " + description + ", Price: $" + price + ", Category: " + category + ", New: " + (isNew ? "Yes" : "No");
    }

    public boolean equals(MenuItem other) {
        return this.description.equals(other.description) && this.price == other.price && this.category.equals(other.category);
    }
}
