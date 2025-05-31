public class FactoryPattern {
/*
 When you get obejct in return based on some condition 
 */
    interface Shape{
        public void draw();
    }
    class Square implements Shape{
        public void draw(){
            System.out.print("Square");
        }
    }
    class Circle implements Shape{
        public void draw(){
            System.out.print("Circle");
        }
    }
    class Rectangle implements Shape{
        public void draw(){
            System.out.print("Rectangle");
        }
    }

    class ShapeFactory{
        
        public Shape getShape(String shape){
            switch (shape) {
                case "Circle":
                    return new Circle();
                case "Square":
                    return new Square();
                case "Rectangle":
                    return new Rectangle();
                default:
                    return null;
            }
        }
    }

    public static void main(String[] args) {
        FactoryPattern factoryPattern = new FactoryPattern();
        ShapeFactory shapeFactory = factoryPattern.new ShapeFactory();
        shapeFactory.getShape("Rectangle").draw();
    }
}
