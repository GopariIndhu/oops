@FunctionalInterface
interface A 
{
    void show(int i, int j);
    
}
                                       //Lambda Expression only works on functioncal interface
public class LambdaExpressionReturn
{
    public static int main(String args[])
    {
        A obj = (i,j) -> i+j;
            
        int result = obj.add(5, 4);
        System.out.println(result);
    }
}