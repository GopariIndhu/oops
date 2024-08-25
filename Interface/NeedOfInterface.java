class Laptop
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}
class Developer
{
    public void devApp(Laptop lap)
    {
        lap.code();
    }
}

public class NeedOfInterface
{
    public static void main(String args[])
    {

        Developer indhu = new Developer();
        indhu.devApp(lap);
    }
}