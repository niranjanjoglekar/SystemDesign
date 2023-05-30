package DesignPatterns.DecoratorPattern;

/**
 * @author niranjanjoglekar on 30/05/23
 */
public class PizzaStore {

    public static void main(String[] args) {

        BasePizza vegDelightPizza = new VegDelightPizza();
        BasePizza cheese = new Cheese(vegDelightPizza);
        BasePizza mushroom = new Mushroom(vegDelightPizza);
        BasePizza cheeseMushroom = new Mushroom(cheese);

        System.out.println("VegDelight pizza cost : "+ vegDelightPizza.cost());
        System.out.println("VegDelight cheese pizza cost : "+cheese.cost());
        System.out.println("VegDelight mushroom pizza cost : "+mushroom.cost());
        System.out.println("VegDelight cheese mushroom pizza cost : "+cheeseMushroom.cost());
    }
}
