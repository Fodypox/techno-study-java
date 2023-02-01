package Mentoring01302023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Food {

    private String name;
    private List<String> ingredients;
    public abstract void madeIn();
    public abstract void taste();

    public Food() {
        this.ingredients = new ArrayList<>();
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(String...ingredients) {
       this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
