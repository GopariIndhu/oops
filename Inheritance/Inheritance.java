public class Inheritance
{
    public static void main(String args[])
    {
        AdvCal obj = new AdvCal();
        int r1 = obj.add(4,7);
        int r2 = obj.sub(5,3);
        int r3 = obj.multi(9,3);
        int r4 = obj.div(6,3);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}