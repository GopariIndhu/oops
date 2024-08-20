interface A //interface just show the design
{

    int age = 20;         //final and static
    String area = "Nizamabad";
    void show();
    void config();
}

class B implements A 
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
}

public class Interface 
{
    public static void main(String args[])
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config(); 

        System.out.println(A.area);
    }
}