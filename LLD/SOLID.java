1. Single Responsibility
- Class only has 1 responsibility. Like only to save in DB
- A class should only have 1 reason to change

DAO layer
class Order{
    int id;
    int entryFee;
    String name;

    //Constructor

    private void addToDB(){
        //in this class only this func can change class structure
    }
}

2. Open-Closed Principle
- Open for extension but closed for modification

interface Dao{
    save()
}

class saveToDB extends Dao{

}

class saveToFile extends Dao{

}

3. Liskov Substitution
- If class B is subtype of class A, then we should be able to replace object of class A with B,
and the behaviour should not change.
- class B should have additional function and not narrow class A existing functions

4. Interface Segmented Principle
- Interface should be such that the classes implementing it shouldnt need to implement unnecessary functions

interface RestaurantEmployee{
    void washDishes();
    void serveFood();
    void cookFood();
}

class waiter implements RestaurantEmployee{
    private void washDishes(){
        //not his job - unnecessary implementation
    }

    public void serveFood() {
        //Yes
    }
}

5. Dependency Inversion Principle

- Class should depend on interfaces rather than concrete classes.
        
interface Keyboard{
    
}
class WiredKeyboard implements Keyboard{
    
}
class BluetoothKeyboard implements Keyboard{
    
}

class Macbook{
    private WiredKeyboard wiredKeyboard; //Wrong as now we cant change without modifying this class
    private Keyboard keyboard; //Correct choose any
}