package DesignPatterns.DecoratorPattern;

/**
 * @author niranjanjoglekar on 30/05/23
 */
public class Mushroom extends ToppingDecorator{

    BasePizza pizza;

    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 50;
    }
}
