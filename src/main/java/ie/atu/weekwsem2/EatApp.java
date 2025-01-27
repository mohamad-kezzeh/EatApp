package ie.atu.weekwsem2;

import java.util.ArrayList;

public class EatApp {

    public static void main(String[] args){
        System.out.println("Welcome to Eat App");
        System.out.println("This is your order");
        //Create an order
        ArrayList<Food> items = new ArrayList<>();
        Burger cheesBurger = new Burger("Cheeseburger",1.99,"Tasty");
        Burger Veggie = new Burger("Veggie Burger",2.99,"Very Tasty");
        Pizza chicken = new Pizza("Chicken Pizza", 9.99,"Surprisingly nice");
        Fries garlic = new Fries("Garlic Fries",4.99,"You wont regret it!");
        Dessert cheesecake = new Dessert("Oreo Cheesecake",6.50,"Taste amazing!");

        //list all the food items like burgers, pizzas fries, etc
        items.add(cheesBurger);
        items.add(Veggie);
        items.add(chicken);
        items.add(garlic);
        items.add(cheesecake);

        //Total Cost
        double totalCost = 0.0;
        for(Food item : items){
            totalCost += item.getPrice();
        }

        //Display details to
        for(Food item : items){
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());

        }

        System.out.println("\nTotal Cost: €" + totalCost);

    }
}
