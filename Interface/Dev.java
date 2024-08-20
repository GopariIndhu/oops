class Laptop
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop
{
    public void code()
    {
        System.out.println("code, compile, run: Faster");
    }
}


class Developer
{
    public void devApp(Laptop lap)
    {
        //System.out.println("coding...");
        lap.code();
    }
}

public class Dev 
{
    public static void main(String args[])
    {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();

        Developer indhu = new Developer();
        indhu.devApp(desk);
    }
}