/* 
have a base class
then add another class with base + extra function - class2
then have class2 + extra - class3

It has both IS-A and HAS-A relationship to base


*/
public class DecoratorPattern {
    
    public abstract class Pizza{
        abstract int cost();
    }

    class Margarita extends Pizza{
        int cost(){
            return 100;
        }
    }
    class FarmHouse extends Pizza{
        int cost(){
            return 120;
        }
    }
    public class PeppyPaneer extends Pizza{
        int cost(){
            return 150;
        }
    }

    abstract class ToppingDecorator extends Pizza{
        
    }   
    class ExtraCheese extends ToppingDecorator{
        private Pizza pizza;

        ExtraCheese(Pizza pizza){
            this.pizza = pizza;
        }

        @Override
        int cost() {
            return pizza.cost() + 20;
        }
        
    }
    class Mushrooms extends ToppingDecorator{
        private Pizza pizza;

        Mushrooms(Pizza pizza){
            this.pizza = pizza;
        }

        @Override
        int cost() {
            return pizza.cost() + 30;
        }
        
    }

    public static void main(String[] args) {
        DecoratorPattern decoratorPattern = new DecoratorPattern();
        Pizza pizza = decoratorPattern.new PeppyPaneer();
        Pizza extraMushroom = decoratorPattern.new Mushrooms(pizza);
        Pizza extraMushroomAndCheese = decoratorPattern.new ExtraCheese(extraMushroom);
        System.out.print(extraMushroomAndCheese.cost());
    }


}
