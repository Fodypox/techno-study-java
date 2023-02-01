package Mentoring01302023;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<Food> menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getMenu() {
        return menu;
    }

    public void addFood(Food food) {
        this.menu.add(food);
    }
}
