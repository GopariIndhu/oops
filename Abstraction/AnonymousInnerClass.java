class A 
{
    public void show()
    {
        System.out.println("in A Show");
    }
}


public class AnonymousInnerClass
{
    public static void main(String args[])
    {
        A obj = new B() 
        {
            public void show()
            {
                System.out.println("in new Show");
            }
        };
        obj.show();
    }
}