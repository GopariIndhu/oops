abstract class Car
{
    public abstract void drive(); //declare a method 
    public abstract void fly();

    public void playMusic() 
    {
        System.out.println("Play Music");
    }

}

abstract class BMW extends Car
{
    public void fly() 
    {
        System.out.println("Flying..");
    }
    public void drive() 
    {
        System.out.println("Driving..");
    }
}

class updatedBMW extends BMW   //concrete class
{
    public void fly() {
        System.out.println("Flying..");
    }
}

public class Abstraction 
{
    public static void main(String args[])
    {

        Car obj = new updatedBMW();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}