class A 
{
    public void showTheDataBelongsToThisClass()
    {
        System.out.println("in A show");
    }
}

class B extends A 
{
    @Override
    public void showTheDataBelongsToThisClass()
    {
        System.out.println("in B show");
    }
}

public class Annotation
{
    public static void main(String args[])
    {
        A obj = new B();
        obj.showTheDataBelongsToThisClass();
    }
}