package DesignPatterns.DecoratorPattern;

/**
 * @author niranjanjoglekar on 30/05/23
 */
public class Cheese extends ToppingDecorator{

    BasePizza pizza;

    public Cheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost() + 30;
    }
}
