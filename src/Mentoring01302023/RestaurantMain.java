package Mentoring01302023;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Techno Cafe");

        restaurant.addFood(new Baklava("pistachio"));
        restaurant.addFood(new CesarSalad());
        restaurant.addFood(new Baklava("walnut"));
        restaurant.addFood(new GreekSalad());
        printIngredients(restaurant);
    }

    public static void printIngredients(Restaurant restaurant) {
        for (Food food : restaurant.getMenu()) {
            if (food.getName().equalsIgnoreCase("baklava")){
                if (food.getIngredients().contains("walnut")){
                    System.out.println(food.getIngredients());
                }
            }
        }
    }

}
