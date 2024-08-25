enum Status{
    Running, Failed, Pending, Success;
}


public class Enum 
{
    public static void main(String args[])
    {
        int i = 5;
        //Status s = Status.Pending;          //printing one 
        Status[] ss = Status.values();

        //System.out.println(s);                //printing only one
        //System.out.println(s.ordinal());        //printing range of the word

        for(Status s : ss)
        {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}